public class Merge {
    static void mergesort(int[] ar, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesort(ar, l, mid); // Sort the left half
            mergesort(ar, mid + 1, r); // Sort the right half
            merge(ar, l, mid, r); // Merge the sorted halves
        }
    }

    static void merge(int[] ar, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lar = new int[n1];
        int[] rar = new int[n2];

        for (int i = 0; i < n1; i++) {
            lar[i] = ar[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rar[i] = ar[mid + 1 + i];
        }

        int s = 0, t = 0, u = l;

        while (s < n1 && t < n2) {
            if (lar[s] <= rar[t]) {
                ar[u] = lar[s];
                s++;
            } else {
                ar[u] = rar[t];
                t++;
            }
            u++;
        }

        while (s < n1) {
            ar[u] = lar[s];
            u++;
            s++;
        }

        while (t < n2) {
            ar[u] = rar[t];
            u++;
            t++;
        }
    }

    public static void main(String[] args) {
        int[] ar = { 4, 1, 9, 7, 3 };

        mergesort(ar, 0, ar.length - 1);

        System.out.println("\nSorted array:");
        for (int e : ar) {
            System.out.print(e + " ");
        }
    }
}