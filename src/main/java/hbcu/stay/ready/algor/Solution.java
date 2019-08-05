package hbcu.stay.ready.algor;
import java.util.*;

public class Solution {

    public String countUniqueWords(String input){

        TreeMap<String, Integer> dictionary = createDictionary(input);

        Integer numberOfUniqueWords = countOccurences(dictionary);

        String emptyString = "";
        emptyString += "The " + numberOfUniqueWords + " unique words are:\n";

        Iterator<Map.Entry<String, Integer>> itr = dictionary.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            if (!itr.hasNext()){
                emptyString += entry.getKey() + " (seen " + entry.getValue() + ")";
            }
            else{
                emptyString += entry.getKey() + " (seen " + entry.getValue() + ")";
                emptyString += "\n";
            }

        }


        return emptyString;
    }


    private TreeMap<String, Integer> createDictionary(String input){

        TreeMap<String, Integer> dictionary = new TreeMap<String, Integer>();

        String[] stringList = input.split("\\W+");

        for(String word: stringList){
            if (dictionary.containsKey(word)){
                dictionary.put(word, dictionary.get(word) + 1);
            }
            else{
                dictionary.put(word, 1);
            }
        }
        return dictionary;
    }


    private Integer countOccurences(TreeMap<String, Integer> dictionary){
        Integer count = 0;

        for(Map.Entry<String, Integer> entry: dictionary.entrySet()){
            count ++;
        }

        return count;
    }
}
