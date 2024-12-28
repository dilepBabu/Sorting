public class Quick {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 4, 5 };

        qs(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partion(arr, low, high);

            qs(arr, low, pi - 1);
            qs(arr, pi + 1, high);
        }
    }

    private static int partion(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}