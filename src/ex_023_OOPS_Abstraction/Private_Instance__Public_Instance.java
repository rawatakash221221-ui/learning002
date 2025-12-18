package ex_023_OOPS_Abstraction;

public class Private_Instance__Public_Instance {
    public static void main(String[] args) {
CAB C1=new CAB();
C1.Display();
    }
}
class Car1{
    protected String name="Akash";

}
class CAB extends Car1{
    void Display(){
        System.out.println(super.name);
    }
}