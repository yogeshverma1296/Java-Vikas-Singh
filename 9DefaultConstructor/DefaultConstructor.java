class Demo{
    private int x;
    private int y;

    Demo(){
        x = 5;
        y = 9;
        System.out.println(x);
        System.out.println(y);
    }

}
public class DefaultConstructor {
    public static void main(String[] args) {
        Demo d1 = new Demo();
    }
}