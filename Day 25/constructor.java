

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
class Student{
    int rollNo=0;
    Student(){
        System.out.println("Constructor is called");
    }
}