class Mahesh{
    int x,y;
    void fun1(){
        System.out.println("fun1");
    }
    void fun2(){
        System.out.println("fun2");
    }
}
public class InstanceClass {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();
        Mahesh m2 = new Mahesh();
        m1.x=5;
        m2.x=51;
        System.out.println(m1.x);
        System.out.println(m2.x);
    }   
}