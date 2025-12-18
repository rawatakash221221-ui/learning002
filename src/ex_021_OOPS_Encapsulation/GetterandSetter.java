package ex_021_OOPS_Encapsulation;

public class GetterandSetter {
    public static void main(String[] args) {
Gaw g1=new Gaw();
g1.setName("Akash");
        System.out.println(g1.getName());
    }
}
class Gaw{
    private String name;
    public void setName(String n){
name=n;
    }
    public String getName(){
return name;
    }
}