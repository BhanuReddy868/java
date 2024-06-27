public class Finals {
    static  int a = 101;

    void mymethod() {
        a = 100;
    }

    public static void main(String args[]) {
        Finals f = new Finals();
        f.mymethod();
    }
}