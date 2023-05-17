package Mentorship;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static HashMap<String, Integer> countWords(String sentence){
        HashMap<String, Integer> words = new HashMap<String,Integer>();
        String [] strings = sentence.split(" ");
        for(int i=0; i< strings.length;i++){
            if(words.containsKey(strings[i])){
                int newValue = words.get(strings[i])+1;
                words.put(strings[i],newValue);
            }else{
                words.put(strings[i],1);
            }
        } return words;
    }


    public static void main(String[] args) {
        String str = "It is so hot outside";
        HashMap<String, Integer> sentence1 = countWords(str);
        for(Map.Entry result: sentence1.entrySet()){
            System.out.println(result.getKey()+ " "+ result.getValue());
        }
    }
}
