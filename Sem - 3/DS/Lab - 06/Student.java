import java.util.Scanner;

class StudentDetail{
    int enrollmentNo, sem;
    Double CPI;
    String name = new String();

    void takeDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine(); 
        System.out.print("Enter Sem : ");
        sem = sc.nextInt();
        System.out.print("Enter enrollmentNo : ");
        enrollmentNo = sc.nextInt(); 
        System.out.print("Enter CPI : ");
        CPI = sc.nextDouble(); 
        sc.close(); 
    }

    void printDetail(){
        System.out.println("");
        System.out.println("Enrollment No. : " + enrollmentNo);
        System.out.println("Sem : " + sem);
        System.out.println("Name : " + name);
        System.out.println("CPI : " + CPI);
    }
} 

public class Student{
    public static void main(String[] A){
        StudentDetail[] std = new StudentDetail[5];
        for(int i = 0;i < 5;i++){
            std[i] = new StudentDetail();
            std[i].takeDetail();
        }
        for(int i = 0;i < 5;i++) std[i].printDetail();
    }
}

