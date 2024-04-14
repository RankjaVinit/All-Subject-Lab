import java.util.Scanner;
class Time{
    int hour;
    int minute;
    int second;
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    Time(){
        count++;
        System.out.println("Data of Time : " + count);
        System.out.print("Enter hour : ");
        this.hour = sc.nextInt();
        System.out.print("Enter minute : ");
        this.minute = sc.nextInt();
        System.out.print("Enter second : ");
        this.second = sc.nextInt();
        System.out.println(" ");
    }
    void print(){
        System.out.print("Time t" + count + " :: ");
        System.out.println(this.hour + " : " + this.minute + " : " + this.second);
        System.out.println(" ");
    }
    void addTime(Time T){
        this.hour+=T.hour;
        this.minute+=T.minute;
        this.second+=T.second;
        while ( this.second >= 60 ) {
            this.second-=60;
            this.minute++;
        }
        while ( this.minute >= 60 ) {
            this.minute-=60;
            this.hour++;
        }
        System.out.print("Resulted Time" + " :: ");
        System.out.println(this.hour + " : " + this.minute + " : " + this.second);
        System.out.println(" ");
    }
    static void close(){
        sc.close();
    }
}

public class TimeDemo {
    public static void main(String[] Args){
        Time t1 = new Time();
        t1.print();
        Time t2 = new Time();
        t2.print();
        t1.addTime(t2);
        Time.close();
    }
}
