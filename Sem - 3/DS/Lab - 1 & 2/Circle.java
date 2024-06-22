import java.util.*;

public class Circle{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();
        System.out.println("Area of Circle of Radius " + r + " is " + (Math.PI*r*r));
        sc.close();
    }
}