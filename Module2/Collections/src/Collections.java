import java.util.*;

public class Collections {

        public static void main(String[] args) {
            String[] array = {"dog", "cat", "mouse", "horse", "butterfly", "horse"};

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

            System.out.println(arrayList);
            System.out.println("____");
            System.out.println(hashSet);
            System.out.println("____");
            System.out.println(hashMap1);
            System.out.println("____");
            System.out.println(hashMap2);
            System.out.println("");
        }
    }

