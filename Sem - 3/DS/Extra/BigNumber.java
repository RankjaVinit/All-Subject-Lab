

import java.util.*;

public class BigNumber {

    public static String add(String n1, String n2){
        StringBuffer ret = new StringBuffer();
        int a = n1.length() - 1;
        int b = n2.length() - 1;
        int c = 0;
        while(a >= 0 && b >= 0){
            int total = Integer.parseInt(n1.charAt(a) + "") + Integer.parseInt(n2.charAt(b) + "") + c;
            ret.append(""+((total)%10));
            if(total >= 10){
                c = 1;
            }
            else{
                c = 0;
            }
            a--;
            b--;
        }
        while(a >= 0){
            int total = Integer.parseInt(n1.charAt(a) + "") + c;
            ret.append(""+((total)%10));
            if(total >= 10){
                c = 1;
            }
            else{
                c = 0;
            }
            a--;
        }
        while(b >= 0){
            int total = Integer.parseInt(n1.charAt(b) + "") + c;
            ret.append(""+((total)%10));
            if(total >= 10){
                c = 1;
            }
            else{
                c = 0;
            }
            b--;
        }

        return ret.reverse().toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number - 1 : ");
        String n1 = new String(sc.next());
        System.out.print("Enter Number - 2 : ");
        String n2 = new String(sc.next());

        String ans = add(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + ans);

        sc.close();
    }       
}
