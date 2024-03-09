public class Solution {

        public String mergeAlternately(String word1, String word2) {

            StringBuilder resultString = new StringBuilder();
            int w1 = word1.length();
            int w2 = word2.length();
            System.out.println("w1...." + w1 + w2);

            int arrayLength = Math.max(w1, w2);


                for(int i = 0; i < arrayLength; i++){
                    // Concatenate characters using String.valueOf() to ensure string concatenation
//                    resultString.append(String.valueOf(word1.charAt(i))).append(w2 >= i ? String.valueOf(word2.charAt(i)) : "");
                    if(i < w1){
                        resultString.append(word1.charAt(i));
                    }
                    if(i < w2){
                        resultString.append(word2.charAt(i));

                    }
                    System.out.println("resultString...." + resultString);
                }



            return resultString.toString();

        }

}
