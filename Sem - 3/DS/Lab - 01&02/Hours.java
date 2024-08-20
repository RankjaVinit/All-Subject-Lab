import java.util.*;

public class Hours {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seconds : ");
        int sec = sc.nextInt();
        
        int hours = (int)(sec/3600);
        sec%=3600;
        int min = (int)(sec/60);
        sec%=60;

        System.out.println("H : M : S -> " + hours + " : " + min + " : " + sec + ".");

        sc.close();
    }
}
