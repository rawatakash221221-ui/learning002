package ex_20_OOPS_PolyMorphism;

public class MethodOverloading {
    public static void main(String[] args) {
Music m1=new Music();
        m1.Guitar();
        m1.Guitar();
        System.out.println(m1.Guitar(4,5));
    }
}
class Music{
    void Guitar(){
        System.out.println("Concert Guitar");
    }
    int Guitar(int a,int b){
        return a+b;

    }
}
