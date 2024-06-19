public class Enum {
    public static void main(String args[]){
        System.out.println(mobile.motorola);
        Mobile mobile=new Mobile(samsung);
        if(mobile==Mobile.samsung){
            System.out.prointln("matched");
        
        }
        switch (mobile) {
            case samsung:
            System.out.println("samsung");
                break;
            case motorola:
                break;
            case nokia:
                break;
            case iphone;
                break;
        
            default:
                break;
        }
    }
    
}
