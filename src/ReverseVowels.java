import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int length = s.length();
        int left = 0;
        int right = length -1;
        StringBuilder result = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
//        List<String> vowels = new ArrayList<>(Collections.singleton("aeiouAEIOU"));

        while (left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if((vowels.indexOf(leftChar) != -1) && (vowels.indexOf(rightChar) != -1)){
                result.setCharAt(left, rightChar);
                result.setCharAt(right, leftChar);
                left++ ;
                right--;
            } else if ((vowels.indexOf(leftChar) == -1)) {
                left++;
            } else if (vowels.indexOf(rightChar) == -1) {
                right--;
            }
        }

 return result.toString();
    }
}
