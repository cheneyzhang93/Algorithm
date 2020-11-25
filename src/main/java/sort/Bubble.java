package sort;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        Bubble.bubbleSort(arr);
        Common.print(arr);

    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



}
