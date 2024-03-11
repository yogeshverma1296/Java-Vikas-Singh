import java.util.Scanner;

/**
 * PrivateAccess
 */
class Arithmetic{
    // private member variables
    private int num1,num2;
    // instance (object) member methods
    int add(int n1,int n2){
        num1 = n1;
        num2 = n2;
        return (num1+num2);
    }
    int sub(int n1,int n2){
        num1 = n1;
        num2 = n2;
        return (num1-num2);
    }
    int mult(int n1,int n2){
        num1 = n1;
        num2 = n2;
        return (num1*num2);
    }
    int div(int n1,int n2){
        num1 = n1;
        num2 = n2;
        return (num1/num2);
    }
    int mod(int n1,int n2){
        num1 = n1;
        num2 = n2;
        return (num1%num2);
    }
}
public class PrivateAccess {
    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic();
        System.out.println("Enter the Value of Two Numbers = ");
        int number1 = input();
        int number2 = input();
        System.out.println("Add = "+(a1.add(number1, number2)));
        System.out.println("Sub = "+(a1.sub(number1, number2)));
        System.out.println("Mult = "+(a1.mult(number1, number2)));
        System.out.println("Div = "+(a1.div(number1, number2)));
        System.out.println("Mod = "+(a1.mod(number1, number2)));
    }
    public static int input(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        return number;
    }
}