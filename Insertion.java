public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 2, 8, 9, 4 };
        int size = arr.length;
        int j = 0;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
