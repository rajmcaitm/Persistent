package program4;

import java.io.File;
 
public class SetWritableMethodExample
{    
    public static void main(String[] args) 
    {
        File anyTextFile = new File("C:\\Users\\dharm_chaudhary\\Desktop\\abc.txt");
         
        anyTextFile.setWritable(false);
         
        if(anyTextFile.canWrite())
        {
            System.out.println("File is still writable...!");
        }
        else
        {
            System.out.println("File is now read-only...!");
        }
    }    
}