package program4;

import java.io.File;
 
public class SetReadOnlyMethodExample
{    
    public static void main(String[] args) 
    {
       File anyTextFile = new File("C:\\Users\\dharm_chaudhary\\Desktop\\abc.txt");
         
        boolean result = anyTextFile.setReadOnly();
         
        if(result)
        {
            System.out.println("File is now read-only...!");
        }
        else
        {
            System.out.println("File is still writable...!");
        }
    }    
}