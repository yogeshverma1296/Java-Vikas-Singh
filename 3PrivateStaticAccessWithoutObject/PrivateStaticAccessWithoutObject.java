import java.util.Scanner;

class Demo{
    private static int x;
    static int fun1(int num){
        x = num;
        return x;
    } 
}

public class PrivateStaticAccessWithoutObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Val of Num = ");
        int num = sc.nextInt();
        int test = Demo.fun1(num);
        System.out.println("Test is = "+test);
        sc.close();
    }
}
