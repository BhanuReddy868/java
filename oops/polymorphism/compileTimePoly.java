

 class Calculate {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    } 
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class CompileTimePoly{
    public static void main(String args[]){
    Calculate c=new Calculate();
   int sum1 = c.add(10,20);
   double sum2 = c.add(1.0,2.0);
   int sum3 = c.add(1,2,3);
    System.out.println("sum of a,b : "+sum1);
    System.out.println("sum of a,b : "+sum2);
    System.out.println("sum of a,b,c : "+sum3);

    }
}
