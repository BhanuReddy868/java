class FinalBlank{
    final int rollno;
    FinalBlank(int rno){
        rollno=rno;
    }
    void display(){
        System.out.println("rollno is :"+rollno);
    }
    public static void main(String args[]){
        FinalBlank f=new FinalBlank(100);
        FinalBlank s=new FinalBlank(101);

        f.display();
    }
}