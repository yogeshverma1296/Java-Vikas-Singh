import java.util.Scanner;

class Sum{
    void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum is = "+(sum));
    }
    void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("Sum is = "+(sum));
    }
}
/**
 * FunctionOverloading
 */
public class FunctionOverloading {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println("Hello, Sum Calculator is here = ");
        System.out.println("You want to sum 2 values or 3 values ?");
        System.out.println("Enter 2 for 2 Values, 3 for 3 Values = ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value == 2){
            System.out.println("Enter Value of 2 Numbers = ");
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            s1.sum(val1, val2);
        }
        else if(value == 3){
            System.out.println("Enter Value of 3 Numbers = ");
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            int val3 = sc.nextInt();
            s1.sum(val1, val2, val3);
        }
        else{
            System.out.println("Enter either 2 or 3 only !!");
        }

        sc.close();
    }
}