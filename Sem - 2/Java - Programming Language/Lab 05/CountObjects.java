public class CountObjects {
    private static int numOfStudents = 0;
    private String name;
    private int age;
    
    public CountObjects(String name, int age) {
        numOfStudents++;
        this.name = name;
        this.age = age;

    }
    
    public static int getNumOfStudents() {
        return numOfStudents;
    }
    
    public static void main(String[] args) {
        CountObjects s1 = new CountObjects("Alice", 20);
        CountObjects s2 = new CountObjects("Bob", 22);
        CountObjects s3 = new CountObjects("Charlie", 21);
        
        System.out.println("Number of students: " + CountObjects.getNumOfStudents());
    }
}

