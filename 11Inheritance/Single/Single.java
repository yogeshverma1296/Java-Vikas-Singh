import java.util.Scanner;

class ParentClass{
    int age;
    int height;
    int money;
    void setData(int a, int h, int m){
        age = a;
        height = h;
        money = m;
    }
    void display(){
        System.out.println("Age is = "+ age);
        System.out.println("Height is = "+height);
        System.out.println("Money is = "+money);   
    }
}
class ChildClass extends ParentClass{
    int education;

}

public class Single {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChildClass c1 = new ChildClass();
        System.out.println("Enter the Age = ");
        int a = input.nextInt();
        System.out.println("Enter the Height = ");
        int h = input.nextInt();
        System.out.println("Enter the Money = ");
        int m = input.nextInt();
        // setData
        c1.setData(a, h, m);
        // display
        c1.display();
        input.close();
    }
}
