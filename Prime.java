public class Prime{
public static void main(String args[])
{
int number=53;
boolean flag=true;
for(int i=2;i<=number/2;++i)
{
if(number%i==0)
{
flag=true;
break;
}
}
if(flag==true)
System.out.println(number +"it is prime");
else
System.out.println(number +"not a prime");
}
}