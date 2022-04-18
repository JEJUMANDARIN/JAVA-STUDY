// Java 프로그래밍 - 변수와 자료형_4

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class practice_04 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();


//      1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0,1);
        System.out.println("l1 = " + l1);


//      1-2. get
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));


//      1-3. size
        System.out.println(l1.size());
        

//      1-4. remove
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println("l1 = " + l1);


//      1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1);


//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);

        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);


//      1-7. contains
        System.out.println(l2.contains((1)));
        System.out.println(l2.contains((3)));


//      2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();


//      2-1. put


//      2-2. get


//      2-3. size

//      2-4. remove


//      2-5. containsKey



//      3. Generics
        System.out.println("== Generics ==");


    }

}


