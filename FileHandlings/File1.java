import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        if(file.exists()){
            System.out.println("file exists");
        }
        else {
            System.out.println("file doesn't exists");
        }
        try{
        if(file.createNewFile())
        {
            System.out.println("file created :"+file.getName());

        }
        else{
            System.out.println("file alraedy exists");
        }
    }
    catch(IOException e){
        System.out.println("IOexception found");
        e.printStackTrace();
}
if(file.delete()){
    System.out.println("Deleted file :"+file.getName());
}
else{
    System.out.println("Failed to delete");
}
}
}
