class Demo{
    private int x, y;
    Demo(int num1, int num2){
        x = num1;
        y = num2;
        System.out.println(x);
        System.out.println(y);
    }
}
// ConstructorinJava class
public class ConstructorinJava {
    public static void main(String[] args) {
        Demo d1 = new Demo(50, 90);
    }
}
