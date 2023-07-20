
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



/**
 *
 * @author zwelihle
 */
public class Utility {
    
    public static ArrayList<Account> readFile(String fileName)
    {
        
        ArrayList<Account> accounts = new ArrayList<>();
        try
        {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) !=null)
        
        {
            String[] currentAccount = line.split("<>");
            String accNumber = currentAccount[0];
            String fullName = currentAccount[1];
            String openDate = currentAccount[2];
            double balance = Double.parseDouble(currentAccount[3]);
            
            Account acc = new Account(accNumber,fullName,openDate,balance);
            accounts.add(acc);
        
        }
        
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        return accounts;
    
    }
    
    
   
