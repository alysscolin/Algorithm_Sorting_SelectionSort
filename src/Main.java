import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {64, 25, 12, 22, 11};

        SelectionSort.sort(a);

        System.out.println(Arrays.toString(a));
    }
}