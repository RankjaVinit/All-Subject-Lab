class ComplexNumber {
    int real, imaginary;
    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber(this.real + c2.real, this.imaginary + c2.imaginary);
        return c3;
    }
    public void print(){
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexNumberDemo {    
    public static void main(String[] Args){
        ComplexNumber c1 = new ComplexNumber(10, 4);
        ComplexNumber c2 = new ComplexNumber(5, 8);
        ComplexNumber c3 = c1.add(c2);
        c3.print();
    }
}
