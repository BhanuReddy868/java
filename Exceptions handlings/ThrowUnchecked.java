public class ThrowUnchecked {
    public static void validate(int age){
        if(age<18)
        {
            throw new ArithmeticException("the person is not eligible for the vote");
        }
        else{
            System.out.println("The person is Eligible for the vote");
        }
    }
    public static void main(String args[]){
        validate(19);
        System.out.println("Thankyou");
    }
    
}
