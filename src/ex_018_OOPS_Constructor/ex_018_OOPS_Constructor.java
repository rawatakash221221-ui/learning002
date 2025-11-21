package ex_018_OOPS_Constructor;

public class ex_018_OOPS_Constructor {
    public static void main(String[] args) {
Car c1=new Car();

    }
}
class Car{
    String name;
    int year;
    String model;

    Car(){
        name="Alto";
        year=0;
        model="800";
        System.out.println("DC");


    }
}
