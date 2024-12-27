public class Selection {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 2, 8, 9, 4 };
        int size = arr.length;
        int min = -1;
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;

                }

            }
            // System.out.println();

            // for (int k = 0; k < size; k++) {
            // System.out.print(arr[k] + " ");
            // }
            // System.out.println();
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
