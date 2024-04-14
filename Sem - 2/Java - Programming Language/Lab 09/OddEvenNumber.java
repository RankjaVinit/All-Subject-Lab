public class OddEvenNumber {
    public static void main(String[] Args){
        Odd o = new Odd();
        Even e = new Even();
        o.start();
        e.start();
    }
}

class Odd extends Thread{
    public void run(){
        for(int i = 1;i <= 20;i+=2){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }   
    }
}

class Even extends Thread{
    public void run(){
        for(int i = 2;i <= 20;i+=2){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }  
    }
}