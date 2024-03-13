class Example{
    void f1(){

    }
}
class Example1 extends Example{
    void f1(){
        
    }
}
public class FunctionOverriding {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.f1();
    }
}
