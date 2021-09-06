import java.util.*;


public class TamásCollections {
    public static void main(String[] args) {
        String[] array = {"egy", "egy", "ketto", "harom", "negy", "ot"};

        List<String> arrayList = new ArrayList<>();
        Set<String> hashSet = new HashSet<>();
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
            hashSet.add(array[i]);
            hashMap1.put(i, array[i]);
            hashMap2.put(array[i], i);
        }
        printArrayList(arrayList);
        printSerapator();
        printArrayListWithLambda(arrayList);
        printSerapator();
        printHashSet(hashSet);
        printSerapator();
        printHashSetWithLambda(hashSet);
        printSerapator();
        printHashMap(hashMap1);
        printSerapator();
        printHashMapKeys(hashMap1);
        printSerapator();
        printHashMapValues(hashMap1);

    }

    private static void printArrayList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void printArrayListWithLambda(List<String> list) {
        list.forEach(element -> {
            System.out.println(element);
        });
    }

    private static void printHashSet(Set<String> set) {
        for (String str : set) {
            System.out.println(str);
        }
    }

    private static void printHashSetWithLambda(Set<String> set) {
        set.forEach(element -> {
            System.out.println(element);
        });
    }

    private static void printHashMap(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " value: " + map.get(key));
        }
    }

    private static void printHashMapKeys(Map<Integer, String> map) {
        for (Integer keys : map.keySet()) {
            System.out.println(keys);
        }
    }

    private static void printHashMapValues(Map<Integer, String> map) {
        for (String values : map.values()) {
            System.out.println(values);
        }
    }


    private static void printSerapator() {
        System.out.println("--------------");
    }
}
