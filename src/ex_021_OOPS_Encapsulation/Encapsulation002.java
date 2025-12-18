package ex_021_OOPS_Encapsulation;

public class Encapsulation002 {
    public static void main(String[] args) {
        Wwe w1=new Wwe();
        w1.setName("Edge");
        w1.setAge(45);
        System.out.println("Name of werestler ->"+w1.getName());
        System.out.println("Age is -> " +w1.getAge());
    }
}
class Wwe{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}