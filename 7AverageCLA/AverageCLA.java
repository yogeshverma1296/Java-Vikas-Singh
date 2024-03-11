public class AverageCLA {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0 ; i < args.length ; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is = "+(sum));
        System.out.println("Elements are = "+(args.length));
        System.out.println("Average = "+ (sum/args.length));
    }    
}