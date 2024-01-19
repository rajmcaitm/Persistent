package program3;

import java.io.IOException;

public class LaunchingExternalApp
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
 
        try
        {
            runtime.exec("notepad C:\\Users\\dharm_chaudhary\\Desktop\\sample.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}