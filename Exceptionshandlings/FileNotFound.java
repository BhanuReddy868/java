
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFound {
    public static void main(String args[]){
        PrintWriter pw;
        try{
            pw=new PrintWriter("jtp.txt");
            pw.println("saved");
        }catch(FileNotFoundException e){
            System.out.println(e);


        }
        System.out.println("File Saved Successfully");
    

    }
}
