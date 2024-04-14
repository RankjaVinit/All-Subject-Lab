class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.14 * this.radius * this.radius;
    }
    double para(){
        return 2 * 3.14 * this.radius;
    }
    
}
public class CircleDemo {
    public static void main(String[] Args){
        Circle C1 = new Circle(10);
        System.out.println("Radius of C1 = " + C1.radius); 
        System.out.println("Area of C1 = " + C1.area()); 
        System.out.println("Parameter of C1 = " + C1.para()); 
        System.out.println(" "); 
        Circle C2 = new Circle(20);
        System.out.println("Radius of C2 = " + C2.radius); 
        System.out.println("Area of C2 = " + C2.area()); 
        System.out.println("Parameter of C2 = " + C2.para()); 
    }
}
