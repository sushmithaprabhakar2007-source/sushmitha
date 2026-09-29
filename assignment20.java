import java.util.HashSet;

public class DistinctAbsolute {
    public static void main(String[] args) {
        int[] a = {-5, 5, -3, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(Math.abs(x));
        }

        System.out.println("Distinct absolute values = " + set.size());
    }
}
