public class SmallestArray
{
public static void main(String args[])
{
int arr[] ={3,4,1,6,5,8,2};
int result=arr[0];// result =3
for(int i=0;i<arr.length;i++)//i=0;true;           i=1;true;                       i=2;true;                    i=3;true;
{
if(arr[i]<result)//arr[i]3 <result 3 false ->i++   arr[i]=4< result 3 false ->i++  arr[i]=1 <result 3 true;i++  arr[i]=6<result 1 false ;i++ 
{
result=arr[i];                                                                     //result=1; 
}
}
System.out.println("smallest number is " +result);
}
}
