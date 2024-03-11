// Program to show parseInt() and valueOf() in Java
public class ParseIntValueOf {
    public static void main(String[] args) {
        // parseInt(); is static
        int x = Integer.parseInt("12345");
        System.out.println(x);

        // valueOf() is static and intValue() is Instance
        Integer i1 = Integer.valueOf("543234");
        int y = i1.intValue();
        System.out.println(y);
        System.out.println("Type of i1 is -> "+i1.getClass());
    }
}