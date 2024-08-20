import java.util.Scanner;

class EmployeeDetail{
    int employeeID, salary;
    String name = new String();
    String designation = new String();
    void takeDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine(); 
        System.out.print("Enter Designation : ");
        designation = sc.nextLine();
        System.out.print("Enter Employee ID : ");
        employeeID = sc.nextInt(); 
        System.out.print("Enter Salary : ");
        salary = sc.nextInt(); 
        sc.close(); 
    }

    void printDetail(){
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Enter Salary : " + salary);
        System.out.println("Enter Name : " + name);
        System.out.println("Enter Designation : " + designation);
    }
} 

public class Employee{
    public static void main(String[] A){
        EmployeeDetail e = new EmployeeDetail();
        e.takeDetail();
        e.printDetail();
    }
}

