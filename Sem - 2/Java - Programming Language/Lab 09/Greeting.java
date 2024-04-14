public class Greeting {
    public static void  main(String[] Args){
        GoodMorning gm = new GoodMorning();
        GoodAfternoon ga = new GoodAfternoon();
        ga.start();
        gm.start();
    }    
}

class GoodMorning extends Thread{
    public void run(){
        for(int i = 0;i < 15;i++){
            System.out.println("Good Morning.");
            try{
                sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }   
    }
}

class GoodAfternoon extends Thread{
    public void run(){
        for(int i = 0;i < 5;i++){
            System.out.println("Good Afternoon.");
            try{
                sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        } 
    }
}