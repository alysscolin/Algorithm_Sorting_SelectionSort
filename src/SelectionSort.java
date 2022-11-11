public class SelectionSort {
    static public void sort(int [] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int minValue = arr[i];
            int minIndex = i;  //this step is very important, it could not be 0 here.
            int j;
            for (j = i+1; j < length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
                if (j == length -1)
                    break;
            }

            //swap the minimum value with current value
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
