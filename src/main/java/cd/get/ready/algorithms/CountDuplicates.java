package cd.get.ready.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String,Integer> repeatedWords = new HashMap<String,Integer>();
        for(String str : input){

            if(repeatedWords.containsKey(str)) {
                repeatedWords.put(str,repeatedWords.get(str) + 1);
            }
            else {
                repeatedWords.put(str, 1);
            }
        }

        int count = 0;
        for(int x : repeatedWords.values()){
            if(x > 1) {
                count++;
            }
        }

        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Arrays.sort(input);

        int numberDuplicates = 0;
        int duplicateCount = 0;
        int previousVal = -1;

        for (int i=0; i < input.length; ++i) {
            if (input[i] == previousVal) {
                ++numberDuplicates;
                if (numberDuplicates == 1) {
                    ++duplicateCount;
                }
            }
            else {
                previousVal = input[i];
                numberDuplicates = 0;
            }
        }

        return duplicateCount;
    }
}
