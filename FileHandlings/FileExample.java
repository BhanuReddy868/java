package FileHandlings;
import java.io.File;

public class FileExample {
    public static void main(String args[]){
        File f=null;
        String [] str={"a.txt","b.txt"};
        try {
            for(String s:str){
                f=new File(s);
                boolean bo=f.canExecute();
                String st=f.getAbsolutePath();
                System.out.println(st);
                System.out.println("is executable  " +bo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
