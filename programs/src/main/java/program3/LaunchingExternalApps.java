package program3;

import java.io.IOException;

public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
 
        try
        {
            runtime.exec("notepad.exe");
 
            //OR runtime.exec("notepad");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}