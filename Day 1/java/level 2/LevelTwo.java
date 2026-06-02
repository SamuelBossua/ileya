public class LevelTwo {

    public static int[] getRepeatedValues(int[] array) {

        int total = 0;

        for (int count = 0; count < array.length; count++) {

            boolean repeatedNum = false;

            for (int countTwo = count + 1; countTwo < array.length; countTwo++) {
                if (array[count] == array[countTwo]) {
                    repeatedNum = true;
                    break;
                }
            }

            boolean alreadyAdded = false;

            for (int countThree = 0; countThree < count; countThree++) {
                if (array[countThree] == array[count]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (repeatedNum && !alreadyAdded) {
                total++;
            }
        }

        int[] repeatedNumbers = new int[total];

        int index = 0;

        for (int count = 0; count < array.length; count++) {

            boolean repeatedNum = false;

            for (int countTwo = count + 1; countTwo < array.length; countTwo++) {
                if (array[count] == array[countTwo]) {
                    repeatedNum = true;
                    break;
                }
            }

            boolean alreadyAdded = false;

            for (int countThree = 0; countThree < count; countThree++) {
                if (array[countThree] == array[count]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (repeatedNum && !alreadyAdded) {
                repeatedNumbers[index] = array[count];
                index++;
            }
        }

        return repeatedNumbers;
    }

    public static int[][] getRepeatedValuesAndIndexes(int[] array) {

        int total = 0;

        for (int count = 0; count < array.length; count++) {

            boolean repeatedNum = false;

            for (int countTwo = count + 1; countTwo < array.length; countTwo++) {
                if (array[count] == array[countTwo]) {
                    repeatedNum = true;
                    break;
                }
            }

            boolean alreadyAdded = false;

            for (int countThree = 0; countThree < count; countThree++) {
                if (array[countThree] == array[count]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (repeatedNum && !alreadyAdded) {
                total++;
            }
        }

        int[][] result = new int[total][3];

        int row = 0;

        for (int count = 0; count < array.length; count++) {

            boolean repeatedNum = false;

            for (int countTwo = count + 1; countTwo < array.length; countTwo++) {
                if (array[count] == array[countTwo]) {

                    repeatedNum = true;

                    result[row][0] = array[count];
                    result[row][1] = count;
                    result[row][2] = countTwo;

                    break;
                }
            }

            boolean alreadyAdded = false;

            for (int countThree = 0; countThree < count; countThree++) {
                if (array[countThree] == array[count]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (repeatedNum && !alreadyAdded) {
                row++;
            }
        }

        return result;
    }

    public static int[] moveZerosToEnd(int[] array) {

        int[] result = new int[array.length];

        int index = 0;

        for (int number : array) {
            if (number != 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }
}