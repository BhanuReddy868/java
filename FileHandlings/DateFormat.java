import java.io.*;
import java.text.SimpleDateFormat;
import java.io.File;
public class DateFormat{
    public static void main(String args[]){
        File f=new File("C:/Users/BhanuPrasad/Desktop/core java/FileHandlings/output.txt");
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("last modified date and time is : "+sdf.format(f.lastModified()));
    }
        }