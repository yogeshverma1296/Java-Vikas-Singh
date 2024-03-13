class Example{
    int x,y;
    void f1(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("x is = "+x);
        System.out.println("y is = "+y);
    }
}
class Example1 extends Example{
    int x,y;
    void f3(int x, int y){
        super.x = x;
        super.y = y;
    }
    void display(){
        System.out.println("x is = "+super.x);
        System.out.println("y is = "+super.y);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.f3(7, 9);
        e1.display();
    }
}
