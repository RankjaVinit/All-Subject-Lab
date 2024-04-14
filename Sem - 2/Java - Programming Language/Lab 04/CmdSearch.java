public class CmdSearch {
    public static void main(String[] Args){
        int i;
        double d;
        System.out.print("'" + Args[0].charAt(0) + "'");
        for(d = 0;d < 1000;d+=0.01) System.out.print("  \b\b");
        if(Args[0].charAt(0) >= 65 && Args[0].charAt(0) <= (65 + 26)){
            System.out.println(" -> Correct.... ##-DONE-##");
            for(i = 1;i < Args[0].length();i++){
                System.out.print("'" + Args[0].charAt(i) + "'");
                for(d = 0;d < 1000;d+=0.01) System.out.print("  \b\b");
                if(Args[0].charAt(i) >= 97 && Args[0].charAt(0) <= (97 + 26)){
                    System.out.println(" -> Correct.... ##-DONE-##");
                }
                else{
                    System.out.println(" -> Incorrect.... ##-ERROR-##");
                    return;
                }
            }            
        }
        else{
            System.out.println(" -> Incorrect.... ##-ERROR-##");
        }
    }
}
