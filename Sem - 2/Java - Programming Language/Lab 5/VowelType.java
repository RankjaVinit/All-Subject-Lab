import java.util.Scanner;

public class VowelType {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int vowels[] = {0,0,0,0,0}, i;
        while(true){
            System.out.print("Write any line : ");
            String line = sc.nextLine();
            if(line.equals("quit")) break;
            for(i = 0;i < 5;i++) vowels[i] = 0;
            for(i = 0;i < line.length();i++){
                if ( line.charAt(i) == 'a' || line.charAt(i) == 'A'  ) vowels[0]++;
                else if ( line.charAt(i) == 'e' || line.charAt(i) == 'E'  ) vowels[1]++;
                else if ( line.charAt(i) == 'i' || line.charAt(i) == 'I'  ) vowels[2]++;
                else if ( line.charAt(i) == 'o' || line.charAt(i) == 'O'  ) vowels[3]++;
                else if ( line.charAt(i) == 'u' || line.charAt(i) == 'U'  ) vowels[4]++;
            }
            System.out.println("A = " + vowels[0] + ", E = " + vowels[1] + ", I = " + vowels[2] + ", O = " + vowels[3] + ", U = " + vowels[4] + ".");
        }
    }
}
