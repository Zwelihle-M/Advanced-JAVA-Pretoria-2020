
package contactsapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author zwelihle
 */
class FrameClass extends JFrame
{
    //Array List 
    private ArrayList<String> contactsNames= new ArrayList<String>();
    //labels
  private JLabel selectContlabel,
            numberOfContlabel,
            mobileContlabel,
            workContlabel,
            emailContlabel;
  
  //TextFields
  
   private JTextField mobileContTxtF,
            workContTxtF,
            emailContTxtF;
   //List and search button
   private JList namesContList= new JList();
   private JButton searchbutton= new JButton("Search");
    //Constructor
    public FrameClass()
    {
        //setting layout 
        this.setLayout(null);
        //Frame title 
        this.setTitle("Contacts Application");
        
        //calling a method to populate the list with names
      // ListPopulation();
        
        
    //Initializing    
   selectContlabel= new JLabel("Select Contact:");
   numberOfContlabel= new JLabel("Number of contacts:");
   mobileContlabel= new JLabel("Mobile:");
   workContlabel= new JLabel("Work:");
   emailContlabel= new JLabel("Email:");
  
  //TextFields
  
   mobileContTxtF= new JTextField();
   workContTxtF= new JTextField();
   emailContTxtF= new JTextField();
   
   //JLabels position
    selectContlabel.setBounds(5, 5, 100, 30);
   numberOfContlabel.setBounds(5, 250, 200, 30);
   mobileContlabel.setBounds(240, 50, 100, 30);
   workContlabel.setBounds(240, 100, 100, 30);
   emailContlabel.setBounds(240, 150, 100, 30);
   
   //positioning size JText fields
   
   mobileContTxtF.setBounds(290, 50, 150, 30);
   workContTxtF.setBounds(290, 100, 150, 30);
   emailContTxtF.setBounds(290, 150, 150, 30);
   
   //positioning and sizing JList
    namesContList.setBounds(5, 50, 200, 200);
    
    //Positioning and sizing search
    searchbutton.setBounds(5, 300, 200, 30);
    
    //Adding text to labels
    numberOfContlabel.setText("Number of contacts:"+contactsNames.toArray().length);
    
   //// numberOfContLabel.setText("Number of contacts:"+contactsNames.toArray().length);
    
    //adding action to search button
    this.searchbutton.addActionListener(
            new ActionListener()
            {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //if statement to check if name is selected 
                if(namesContList.getSelectedValue()!= null)
                {
                 int indexNumber=readFromFile().indexOf(namesContList.getSelectedValue());
                 mobileContTxtF.setText(readFromFile().toArray()[(indexNumber+1)]+"");
                 workContTxtF.setText(readFromFile().toArray()[(indexNumber+2)]+"");
                 emailContTxtF.setText(readFromFile().toArray()[(indexNumber+3)]+"");
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Please select the name from the list before you click the search button");
                }
            }
            
            }
    
    );
    
    
   //Adding componets to jframe

   this.add(selectContlabel);
   this.add(numberOfContlabel);
   this.add(mobileContlabel);
   this.add(workContlabel);
   this.add(emailContlabel);
  
  //TextFields
  
   this.add(mobileContTxtF);
   this.add(workContTxtF);
   this.add(emailContTxtF);
   //adding list and button
   this.add(namesContList);
   this.add(searchbutton);
   
    }
    //method read from file
   public List<String> readFromFile()
   {
       try
       { 
           return Files.readAllLines(Paths.get("src\\TextFiles\\Contacts.txt"));
       }
       catch(Exception IO)
       {
       JOptionPane.showMessageDialog( null,"Error:"+IO);
       return null;
       }
       
   }
   //method to populate the list with names 

    private void ListPopulation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   // public void ListPopulation()
    {
        for (int i=0;i<(readFromFile().toArray()).length;i+=4)
        contactsNames.add((String) (readFromFile().toArray()[i]));
        namesContList.setListData(contactsNames.toArray());
    }
    //end
   
    
}
