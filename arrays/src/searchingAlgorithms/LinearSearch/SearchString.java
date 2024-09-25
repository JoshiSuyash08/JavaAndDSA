package searchingAlgorithms.LinearSearch;

public class SearchString {
    public static void main(String[] args) {
        String str = "suyash";
        char target = 'a';
        System.out.println(StringSearch(str, target));

    }
    static boolean StringSearch(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }


        }
        return false;
    }

}
