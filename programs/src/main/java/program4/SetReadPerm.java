package program4;

import java.io.File;
 
public class SetReadPerm
{   
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\dharm_chaudhary\\Desktop\\abc.txt");
         
        if(file.exists())
        {
            //Setting read permission for owner only
             
            boolean result = file.setReadable(true);
             
            System.out.println("Is read permission for owner set successfully? "+result);
        }
        else
        {
            System.out.println("Sorry...File doesn't exist.");
        }
         
        if(file.exists())
        {
            //Setting read permission for all
             
            boolean result = file.setReadable(true, false);
             
            System.out.println("Is read permission for all set successfully? "+result);
        }
        else
        {
            System.out.println("Sorry...File doesn't exist.");
        }
    }
}