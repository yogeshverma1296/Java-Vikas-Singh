class Demo{
    private static int x;
    void f1(){
        x = 5;
    }
}

public class PrivateStaticAccess {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.f1();
    }
}
