package ex_028_Collection_Framework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_002_Array_List {
    public static void main(String[] args) {
        List array=new ArrayList<>();
        array.add(1);
        array.add("ram");
        System.out.println(array.contains(1));
        System.out.println("-----");
        Iterator iterator=array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("------");
            for(Object o:array){
                System.out.println(o);
            }

        }
    }
}
