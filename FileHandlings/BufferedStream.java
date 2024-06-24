import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.text.SimpleDateFormat;

public class BufferedStream{
    public static void main(String args[]){
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:/Users/BhanuPrasad/Desktop/core java/FileHandlings/text.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:/Users/BhanuPrasad/Desktop/core java/FileHandlings/output.txt"));)
        {
            File f=new File("C:/Users/BhanuPrasad/Desktop/core java/FileHandlings/text.txt");
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY HH/mm/ss");
            byte[] buffer=new byte[1024];
            int bytesRead;
            System.out.println("lastModified date and time is "+sdf.format(f.lastModified()));
            while((bytesRead = bis.read(buffer))!= -1){
                bos.write(buffer,0,bytesRead);
                System.out.write(buffer,0,bytesRead);
            }
            System.out.println(buffer);
            System.out.println(bytesRead);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}