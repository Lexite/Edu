package A1_Programs.V1_DataStructuresAndAlgorithms.P1_SearchingAlgorithms;

public class P3_InterpolationSearch {
    final static int LENGTH  = 20;
    public static void main(String[] args) {
        int target = 36;
        int[] array = new int[LENGTH];
        for (int i = 0; i < array.length; i ++){
            array[i] = (i+1)*(i+1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        int index = interpolationSearch(array, target);


        if(index == -1 ){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at " + index);
        }



    }

    static int interpolationSearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int probeIndex =
                    low + (high - low) * (target - array[low])/(array[high] - array[low]);
            int probeValue = array[probeIndex];
            System.out.println("probe index: " + probeIndex + "; probe value " + probeValue);

            if (target < probeValue){high = probeIndex - 1;}
            else if (target > probeValue){low = probeIndex + 1;}
            else {return probeIndex;}
        }
        return -1;
    }
}
