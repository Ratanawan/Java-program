package creatingmyownfolders;

import java.io.File;

public class CreatingMyOwnFolders {

    public static void main(String[] args) {
        //set the folder path into path variable
        String path = new String("C:\\Users\\Admin\\Desktop\\Folder");
        
        //reading the file from path
        File f = new File(path);
        //variable for number of folders
        int num =10;
        //creating string to store name of folders
        String []str = new String[num];
        //checking if the file exist
        if(f.exists())
        {
            for(int i=0; i<=num; i++)
            { 
                f.mkdir();
                f = new File(path + "\\" + "Folder " + (i+1));
            }
            System.out.println("folders created");
        }
    }
    
}
