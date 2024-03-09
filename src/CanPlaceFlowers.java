public class CanPlaceFlowers {

        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int plot = 0;
            boolean result = false;
            int plotLength = flowerbed.length;

            for(int i = 0; i < plotLength; i++){
                if(flowerbed[i] == 0){
                    if(i == 0){
                        if (flowerbed[i + 1] == 0){
                            plot = plot + 1;
                            flowerbed[i] = 1;
                        }
                    } else if(i == plotLength){
                        if (flowerbed[i - 1] == 0){
                            plot = plot + 1;
                            flowerbed[i] = 1;
                        }
                    }else {
                        if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                            plot = plot + 1;
                            flowerbed[i] = 1;
                        }
                    }
                }
            }

            if(plot >= n){
                result  = true;
            }

            return result;
        }
}
