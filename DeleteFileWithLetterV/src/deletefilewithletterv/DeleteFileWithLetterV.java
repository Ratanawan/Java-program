package deletefilewithletterv;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteFileWithLetterV
{
    static String fileName, arrName[];
    public static void main(String[] args) 
    {
        String path = "C:\\Users\\Admin\\Desktop\\Folder";
        File f = new File(path);
        
        if(f.exists())
        {           
            File file[] = f.listFiles();
            
            System.out.println("Folder deleted...");
            
            for(int i=0;i<file.length;i++)
            {
                path = path + file[i];
                f = new File(path);
                System.out.println(f.getName());
                for(int j=0; j<file[i].length() ; i++)
                {
                    
//                    if(file[j] == 'v')
                    {
                        
                   
                    
                    try 
                    {
                        Thread.sleep(2000);
                        file[i].delete();
                        System.out.println(file[i]+" is deleted...");
                    } catch (InterruptedException ex) 
                    {
                    }
                }
            }
            }
            f.delete();
        }
    }
}