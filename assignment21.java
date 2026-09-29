public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }

            if (index1 != -1) {
                break;
            }
        }

        System.out.println("[" + index1 + ", " + index2 + "]");
    }
}
