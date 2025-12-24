package ex_22_OOPS_Super;

public class SuperUsed {
    public static void main(String[] args) {
B b=new B();
        b.show();
    }
}
 class A{
    int x=10;

 }
 class B extends A{
    int x=20;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }

 }