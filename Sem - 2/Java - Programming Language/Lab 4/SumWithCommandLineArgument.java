public class SumWithCommandLineArgument {
    public static void main(String[] Args){
        double a = Double.parseDouble(Args[0]);
        double b = Double.parseDouble(Args[1]);
        System.out.println("sum = " + (a + b));
    }
}
