import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] words = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        HashSet<String> groups = new HashSet<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            groups.add(key);
        }

        System.out.println("Number of anagramic groups = " + groups.size());
    }
}
