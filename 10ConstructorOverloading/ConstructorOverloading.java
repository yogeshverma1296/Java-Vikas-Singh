class Overloading{
    private int x;
    private int y;
    // Overloading Constructor that is Default
    Overloading(){
        x = 5;
        y = 9;
        System.out.println("Constructor with no Parameters invoked, Default");
        System.out.println(x);
        System.out.println(y);
    }
    // Overloading Constructor that is Parameterised
    Overloading(int num1, int num2){
        x = num1;
        y = num2;
        System.out.println("Constructor with Parameters invoked, Parameterised");
        System.out.println(x);
        System.out.println(y);
    }
}
/**
 * ConstructorOverloading
*/

public class ConstructorOverloading {
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(12,34);
    }
}