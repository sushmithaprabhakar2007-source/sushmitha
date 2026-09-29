public class LargestElement {
    public static void main(String[] args) {
        int[] a = {25, 10, 45, 30, 15};

        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}
