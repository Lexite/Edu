package A1_Programs.V1_DataStructuresAndAlgorithms.P4_MapsAndDictionaries;

public class P1_TEST {
    public static void main(String[] args) {


        String phrase = "LookAtMeIamBeautiful";
        int[] numbers = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println(new P1_TEST().countLetters(phrase,'a'));
        System.out.println(new P1_TEST().countSum(numbers,25));



    }

    int countLetters(String word, char letter){

        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    int countSum(int[] array, int sum){
        int count = 0;
        for (int i = 0; i < array.length; i ++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i]+array[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }





    }








        /*





        int[] array = new int[] {0,9,1,8,2,7,3,6,4,5};
        String word = "Establishment";

        int one = new P1_TEST().countChars(word,'e');
        int two = new P1_TEST().countSum(array,10);

        System.out.println(one + " " + two);

    }
    public long count(String string, char charToCount) {
        string = string.toLowerCase();
        //charToCount = (charToCount + "").toLowerCase().charAt(0);

        long count = 0;

        for (int i = 0; i < string.length(); i ++){
            char ch = string.charAt(i);

            if (ch == charToCount) {
                count++;
            }

        }

        return count;
    }
    public int count(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i ++){
            for (int j = i+1; j < array.length; j ++){
                int sum = array[i] + array[j];

                if (sum == number){
                    count++;
                }

            }
        }


        return count;
    }


    public int countChars(String word, char character){
        word = word.toLowerCase();
        int count = 0;

        for (int i = 0; i < word.length(); i ++){
            if (word.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
    public int countSum(int[] array, int number){
        int sum = 0;
        int count = 0;


        for (int i = 0; i < array.length; i ++){
            for (int j = i+1; j < array.length; j ++){
                for (int k = j+1; k < array.length; k++) {
                    sum = array[i] + array[j] + array[k];
                    if (sum == number) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

         */
