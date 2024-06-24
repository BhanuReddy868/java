public class CopyArray {
    public static void main(String args[]){
        final char[] copyFrom = new char{'b','h','a','n','u','r','e','d','d','y'};
        char[] copyTo=new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(String.valueOf(copyTo));
    }
    
}
