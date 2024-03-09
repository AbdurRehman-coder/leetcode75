import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class KidsWithCandies {

        public List<Boolean> kidsWithMoreCandies(int[] candies, int extraCandies) {

            int maxValue = 0;
            List<Boolean> resultList = new ArrayList(candies.length);



            // find the max number in the list
            for(int i = 0; i < candies.length; i++){

                if(maxValue < candies[i]){
                    maxValue = candies[i];
                }
            }
            System.out.println(maxValue);

            for(int i = 0; i < candies.length; i++){
                int candiesSumUp = candies[i] + extraCandies;
                if( candiesSumUp >= maxValue){
                    resultList.add(true);
                }else{
                    resultList.add( false);
                }
            }




            //lets fir
            return resultList;
        }

}
