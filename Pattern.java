public class Pattern{
public static void main(String args[])
{
int n=4;
/*for(int i=1;i<=n;i++)// i=0;0<4; true        i++ ->i=1;i<4; true 
{
for(int j=1;j<i;j++)// j=0;0<=0; true      j=0;0<=1; true
{
System.out.print(j); //*
}
System.out.println("");//() 
}*/
for(int i=n; i>0; i--){
for(int j=1; j<=i;j++){
System.out.print(j);
}
System.out.println("");
}
}
}