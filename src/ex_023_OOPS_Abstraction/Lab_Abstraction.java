package ex_023_OOPS_Abstraction;

public class Lab_Abstraction {
    public static void main(String[] args) {
        Car newcar=new Car();
        newcar.StartEngine();
        newcar.Tyre();
        newcar.Break();
    }

}








class Car extends Engine implements Tyre,Break{
    @Override
  public   void StartEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    public void Tyre() {
        System.out.println("Tyre are Rotating");

    }

    @Override
    public void Break() {
        System.out.println("Car is Stopped");
    }
}
abstract class Engine{
    abstract void StartEngine();
}
interface Tyre{
    void Tyre();

}
interface Break{
    void Break();
}