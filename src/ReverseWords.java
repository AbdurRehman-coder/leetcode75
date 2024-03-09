import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        String trimedString = s.trim();
        String[] splittedStrings = trimedString.split("\\s+");

        for(int i = splittedStrings.length -1 ; i >= 0 ; --i){
            result.append(splittedStrings[i] + " ");
            System.out.println("splitted length:"+ result);

        }


        return result.toString();
    }
}
