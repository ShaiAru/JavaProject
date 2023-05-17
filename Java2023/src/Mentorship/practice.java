package Mentorship;

public class practice {

    public static  boolean checkPalindrome(String word){

        String result = "";
        for(int i =word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        if(result.equals(word)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("pup"));
        System.out.println(checkPalindrome("momm"));
        System.out.println(checkPalindrome("car"));

    }

}
