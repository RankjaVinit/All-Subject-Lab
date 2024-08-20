public class Armstrong {
    public static void main(String[] args){
        
        System.out.print("Arm strong numbers are = ");
        for(int i = 1 ; i <= 1000 ; i++){
            int ans = 0;
            int temp = i;
            if(i <= 10){
                while(temp > 0){
                    ans = ans + (int)Math.pow(temp % 10 , 1);
                    temp = temp/10;
                }
            }
            else if(i <= 100){
                while(temp > 0){
                    ans = ans + (int)Math.pow(temp % 10 , 2);
                    temp = temp/10;
                }
            }
            else if(i <= 1000){
                while(temp > 0){
                    ans = ans + (int)Math.pow(temp % 10 , 3);
                    temp = temp/10;
                }
            }
            else{
                while(temp > 0){
                    ans = ans + (int)Math.pow(temp % 10 , 4);
                    temp = temp/10;
                }
            }
            if(ans == i){
                System.out.print(i+" ");
            }
        }

    }
}
