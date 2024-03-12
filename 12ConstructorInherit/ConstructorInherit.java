class Nokia {
    Nokia(String model){
        System.out.println("Nokia Parent Executed");
        System.out.println("Model Name of Parent = "+model);
    }
}
class Nokia1 extends Nokia{
    Nokia1(){
        super("Model Nokia passed using super()");
        System.out.println("Nokia1 Child Executed");
        String model = "Nokia1";
        System.out.println("Model of Child = "+model);
    }
}
public class ConstructorInherit {
    public static void main(String[] args) {
        Nokia1 n1 = new Nokia1();
    }
}
