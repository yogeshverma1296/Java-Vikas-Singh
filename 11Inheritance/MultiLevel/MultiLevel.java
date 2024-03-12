import java.util.Scanner;

class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
    void setData(int num1, int num2, int num3){
        a = num1;
        b = num2;
        c = num3;
    }
    void display(){
        System.out.println("C's Display Function Running = ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        // Input using Scanner
        Scanner sc = new Scanner(System.in);
        C c1 = new C();
        System.out.println("Enter Value of Three Numbers = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        c1.setData(n1, n2, n3);
        c1.display();

        sc.close();
    }
}
