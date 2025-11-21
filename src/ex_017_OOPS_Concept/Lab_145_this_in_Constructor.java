package ex_017_OOPS_Concept;

public class Lab_145_this_in_Constructor {
    public static void main(String[] args) {
       Cat c1=new Cat("Lucy");
        System.out.println(c1.name);
        Cat c2=new Cat("Spicy");
        System.out.println(c2.name);
        Cat c3=new Cat("Mirchi");
        System.out.println(c3.name);
c2.running();
    }
}
class Cat{
    String name;
    Cat(String nameParameter) {
        this.name = nameParameter;
    }
void running(){
            System.out.println("Who is running -> "+this.name);
        }
    }


