package FileHandlings;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Fileoutputstream {
    public static void main(String[] args) {
        try {
            byte bwrite[]={65,66,67,68,69};
            OutputStream os=new FileOutputStream("text.txt");
            for(int i=0;i<bwrite.length;i++)
            {
                os.write(bwrite[i]);
            }
            os.close();
            InputStream is=new FileInputStream("text.txt");
            int size =is.available();
            for(int x=0;x<size;x++ ){
                System.out.print((char)is.read()+ " ");
            }
            is.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }
       
    }
    
}
