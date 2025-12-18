package ex_028_Collection_Framework;
import java.util.ArrayList;
import java.util.List;
public class Lab_001_List {
    public static void main(String[] args) {
        List Fruits=List.of("Orange","Mango","Banana");
        System.out.println(Fruits);
        List arraylist=new ArrayList();
        arraylist.add("Mango");
        arraylist.add(12);
        System.out.println(arraylist);
    }

}
