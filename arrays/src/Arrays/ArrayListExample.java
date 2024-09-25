package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner in = new Scanner(System.in);

//        list.add(77);
//        list.add(67);
//        list.add(100);
//        list.add(23);
//        list.add(54);
//        list.add(32);
//        list.add(11);
//
//        System.out.println(list.contains(32));//true
//        System.out.println(list.contains(22));//false
//        System.out.println(list);
//
//        list.set(0, 99);//updating zeroth index to 99
//        System.out.println(list);
//
//        list.remove(2);// removing index no. 2 i.e. 100
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++ ){
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++ ){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

        //System.out.println(list);

    }
}
