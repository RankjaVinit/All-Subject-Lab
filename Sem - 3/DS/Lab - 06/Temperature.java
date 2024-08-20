import java.util.Scanner;

public class Temperature{

    public static double ftoc(int temp){
        return (temp - 32)*(5 / 9.0);
    }

    public static double ctof(int temp){
        return ((temp)*(5/9.0) + 32);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Fahrenhit to celcius and 2 for celcius to fahrenhit = ");
        int decide = sc.nextInt();

        System.out.println("Enter your temperature = ");
        int temp = sc.nextInt();

        if(decide == 1){
            double t = ftoc(temp);
            System.out.println(t);
        }
        else{
             double t = ctof(temp);
            System.out.println(t);
        }
        sc.close();
    }
}