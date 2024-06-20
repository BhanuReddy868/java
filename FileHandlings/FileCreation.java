package FileHandlings;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreation {
    public static void main(String args[]){
        File file=new File("test1.txt");
        try{
        if(file.createNewFile()){
            System.out.println("File created");
        }
        else {
            System.out.println("File already exists");
        }
        FileWriter writer=new FileWriter(file);
        writer.write("Test Data");
        writer.close();
        FileReader reader=new FileReader(file);
        int r;
        while((r=reader.read())!=-1){
            char ch=(char) r;
            System.out.print(ch);
        }
    }catch(Exception e){
        System.out.println("Execption");
    }
}
    
}
