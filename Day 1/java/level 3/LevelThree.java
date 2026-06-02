public class LevelThree {

    public static int[] flatten(int[][] array){

        int total = 0;

        for(int[] row : array){
            total += row.length;
        }

        int[] result = new int[total];

        int index = 0;

        for(int[] row : array){

            for(int number : row){

                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static int[] rotate(int[] array, int k){

        int[] result = new int[array.length];

        k = k % array.length;

        for(int count = 0; count < array.length; count++){

            int newIndex = (count + k) % array.length;

            result[newIndex] = array[count];
        }

        return result;
    }

    public static int[] mergeSorted(int[] first, int[] second){

        int[] merged = new int[first.length + second.length];

        int index = 0;

        for(int number : first){

            merged[index] = number;
            index++;
        }

        for(int number : second){

            merged[index] = number;
            index++;
        }

        for(int count = 0; count < merged.length; count++){

            for(int countTwo = count + 1; countTwo < merged.length; countTwo++){

                if(merged[countTwo] < merged[count]){

                    int temp = merged[count];

                    merged[count] = merged[countTwo];

                    merged[countTwo] = temp;
                }
            }
        }

        return merged;
    }
}