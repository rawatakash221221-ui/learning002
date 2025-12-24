package ex_017_OOPS_Concept;

public class Lab_144_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student("Akash");
        Student s4=new Student("Ravi" ," rampal");

    }
}
class Student{
Student(){
    System.out.println(" Hi I am non Parameter Constructor");

}
Student(String name){
    System.out.println("Hi my name is " +   name);

}
Student(String name,String name2){
    System.out.println("  "+name +name2);

}
}