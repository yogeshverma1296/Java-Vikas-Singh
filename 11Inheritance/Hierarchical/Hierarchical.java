// Hierarchical

import java.util.Scanner;

class ParentClass{
    int age;
    int height;
    int weight;
}
class Child1 extends ParentClass{
    int rollNumber;
    void setData(int a, int h, int w, int r){
        age = a;
        height = h;
        weight = w;
        rollNumber = r;
    }
    void display(){
        System.out.println("Child 1 is executing = ");
        System.out.println("Age = "+age);
        System.out.println("Height = "+height);
        System.out.println("Weight = "+weight);
        System.out.println("Roll Number = "+rollNumber);
    }
}
class Child2 extends ParentClass{
    int uniRoll;
    void setData(int a, int h, int w, int u){
        age = a;
        height = h;
        weight = w;
        uniRoll = u;
    }
    void display(){
        System.out.println("Child 2 is executing = ");
        System.out.println("Age = "+age);
        System.out.println("Height = "+height);
        System.out.println("Weight = "+weight);
        System.out.println("University Roll Number = "+uniRoll);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Child1 ch1 = new Child1();
        System.out.println("Enter Details of Child 1 = ");
        System.out.println("Enter Age = ");
        int ch1a = input.nextInt();
        System.out.println("Enter Height = ");
        int ch1h = input.nextInt();
        System.out.println("Enter Weight = ");
        int ch1w = input.nextInt();
        System.out.println("Enter Roll Number = ");
        int ch1r = input.nextInt();
        ch1.setData(ch1a, ch1h, ch1w, ch1r);
        ch1.display();
        // Child 2
        System.out.println("Enter Details of Child 2 = ");
        System.out.println("Enter Age = ");
        int ch2a = input.nextInt();
        System.out.println("Enter Height = ");
        int ch2h = input.nextInt();
        System.out.println("Enter Weight = ");
        int ch2w = input.nextInt();
        System.out.println("Enter University Roll Number = ");
        int ch2r = input.nextInt();
        Child2 ch2 = new Child2();
        ch2.setData(ch2a, ch2h, ch2w, ch2r);
        ch2.display();
        input.close();
    }
}
