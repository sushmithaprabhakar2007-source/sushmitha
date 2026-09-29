public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}
