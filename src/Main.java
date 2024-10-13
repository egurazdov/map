import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<>();
        colours.put(1, "Red");
        colours.put(2, "Green");
        colours.put(3, "Black");
        System.out.println(setOfIndexes(colours));

        TreeMap<Integer, String> coloursLong = new TreeMap<>();
        coloursLong.put(1, "Red");
        coloursLong.put(2, "Green");
        coloursLong.put(3, "Black");

        System.out.println(SetForLongNames(coloursLong));


    }

    private static HashSet<Integer> setOfIndexes(HashMap<Integer, String> maps) {
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, String> map : maps.entrySet()) {
            set.add(map.getKey());
        }
        return set;
    }

    private static TreeMap<Integer, String> SetForLongNames(TreeMap<Integer, String> set) {
        TreeMap<Integer, String> maps = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : set.entrySet()) {
            if (entry.getValue().length() > 3) {
                maps.put(entry.getKey(), entry.getValue());
            }
        }
        return maps;

    }
}