import java.io.FileReader;
import java.io.IOException;
public class ThrowChecked {
    public static void readerfile() throws IOException
    {
    FileReader file=new FileReader("abc.txt");
    }
    public static void main(Strings args[])
    {
        try{
    readerfile();
    }catch(IOException e){
        System.out.println("Error Reading file"+e.getMessage());
    }
}
    }
