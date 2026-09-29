public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6};

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}

