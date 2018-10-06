package creatingfiles;

import java.io.File;

public class DeletingFilesAndFolders {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\demo";
        File f = new File(path);
        
        f.delete(); //trying to delete the file but can't coz it contains files inside
        
        String arr[] = new String[];
        if(f.exists())
        {
            
        }
    }
}
