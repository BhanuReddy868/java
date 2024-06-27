import java.io.FileReader;
import java.io.IOException;
public class ThrowChecked1
{
    public static void readerfile() throws IOException
    {
    FileReader file=new FileReader("C:/Users/BhanuPrasad/Desktop/core java/Exceptionshandlings/abc.txt");
    }
    public static void main(String args[])
    {
        try{
    readerfile();
    }catch(IOException e){
        System.out.println("Error Reading file"+e.getMessage());
    }
}
    }
