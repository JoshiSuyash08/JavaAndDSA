package searchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class SearchString2 {
    public static void main(String[] args) {
        String name = "suyash";
        char target = 'a';
        System.out.println(Arrays.toString((name.toCharArray())));

    }

    static boolean search2(String str, char key){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
           if (ch == key){


                return true;
           }
        }
        return false;
    }


}
