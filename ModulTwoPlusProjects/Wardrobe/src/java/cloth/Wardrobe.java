package cloth;

import utils.FileHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wardrobe {
    private List<Cloth> allCloth;
    private Map<Class, List<Cloth>> allGroupedCloth;
    List<Cloth> removedClothes = new ArrayList<>();
    List<Cloth> giftedClothes = new ArrayList<>();


    public void setAllCloth(List<Cloth> allCloths) {
        this.allCloth = allCloths;
        this.allGroupedCloth = groupCloths(allCloths);

    }

    public Map<Class, List<Cloth>> groupCloths(List<Cloth> allCloths) {
        Map<Class, List<Cloth>> groups = new HashMap<>();
        for (Cloth cloth : allCloths) {
            Class key = cloth.getClass();
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<Cloth>());
            }
            List<Cloth> currentGroup = groups.get(key);
            currentGroup.add(cloth);
        }
        return groups;
    }


    public void wardrobeChecker() {
        wardrobeBeforeSorting();
        sorting();
        wardrobeAfterSorting();
        howManyThrowedOut(removedClothes);
        howManyGifted(giftedClothes);
    }

    public void sorting() {
        for (Cloth quality : allCloth) {
            if (quality.getQuality().NUMBER == 5) {
                removedClothes.add(quality);
            }
            if (quality.getQuality().NUMBER < 5 && quality.getQuality().NUMBER > 2) {
                giftedClothes.add(quality);
            }
        }
        allCloth.removeAll(removedClothes);
        for (Map.Entry<Class, List<Cloth>> group : allGroupedCloth.entrySet()) {
            group.getValue().removeAll(removedClothes);
        }
        System.out.println("Thorwed out: " + removedClothes.size() + " pieces");
        //System.out.println("Wardrobe after: "+ allCloth.size());
        allCloth.removeAll(giftedClothes);
        for (Map.Entry<Class, List<Cloth>> group : allGroupedCloth.entrySet()) {
            group.getValue().removeAll(giftedClothes);
        }
        System.out.println("Gifted: " + giftedClothes.size() + " pieces");
        // System.out.println("Wardrobe after: "+ allCloth.size());

    }

    public HashMap<String, Integer> wardrobePieces() {
        HashMap<String, Integer> wardrobeSortedByType = new HashMap<>();
        for (Map.Entry<Class, List<Cloth>> group : allGroupedCloth.entrySet()) {
            wardrobeSortedByType.put(group.getValue().get(0).type(),group.getValue().size());
        }
        System.out.println(wardrobeSortedByType);
        return wardrobeSortedByType;
    }

    public HashMap<String, Integer> wardrobePieces22(Map<Class, List<Cloth>> groupedClothes) {
        HashMap<String, Integer> wardrobeSortedByType = new HashMap<>();
        for (Map.Entry<Class, List<Cloth>> group : groupedClothes.entrySet()) {
            wardrobeSortedByType.put(group.getValue().get(0).type(),group.getValue().size());
        }
        return wardrobeSortedByType;
    }

    public HashMap<String, Integer> wardrobePieces2() {
        HashMap<String, Integer> wardrobeSortedByType = new HashMap<>();
        int jacket = 0;
        int pant = 0;
        int shirt = 0;
        int shoe = 0;
        int sock = 0;
        int thsirt = 0;
        for (int i = 0; i < allCloth.size(); i++) {
            if (allCloth.get(i) instanceof Jacket) {
                jacket++;
                String name = "kabát";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, jacket);
            }

            if (allCloth.get(i) instanceof Pant) {
                pant++;
                String name = "nadrág";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, pant);
            }
            if (allCloth.get(i) instanceof Shirt) {
                shirt++;
                String name = "ing";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, shirt);

            }
            if (allCloth.get(i) instanceof Shoe) {
                shoe++;
                String name = "cipő";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, shoe);
            }
            if (allCloth.get(i) instanceof Sock) {
                sock++;
                String name = "zokni";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, sock);
            }
            if (allCloth.get(i) instanceof TShirt) {
                thsirt++;
                String name = "póló";
                // System.out.println(allCloth.get(i));
                wardrobeSortedByType.put(name, thsirt);
            }
        }
        System.out.println(wardrobeSortedByType);
        return wardrobeSortedByType;

    }

    public void wardrobeBeforeSorting() {

        System.out.println("All clothes in my wardrobe before sorting are: " + allCloth.size());
        System.out.print("All clothes sorted by type in my wardrobe" +
                " are: " + FileHandler.classesInWardrobe.size() + ". These are: ");
        wardrobePieces();
        // Class type szerinti mennyi ruha . Hogy kell rendesen megcsinánli ?
        // sorting();

    }

    public void wardrobeAfterSorting() {
        System.out.println("All clothes in my wardrobe after sorting are: " + allCloth.size());
        System.out.print("All clothes sorted by type in my wardrobe" +
                " are: " + FileHandler.classesInWardrobe.size() + ". These are: ");
        wardrobePieces();
    }

    public void howManyGifted(List<Cloth> list) {
        int number = 0;
Map<Class,List<Cloth>> groupedClothes = groupCloths(list);
HashMap<String,Integer> wardrobePieces = wardrobePieces22(groupedClothes);
       // var groupedClothes = groupCloths(list);
       // var wardrobePieces = wardrobePieces22(groupedClothes);

        System.out.println("Ajéndékba: ");
        System.out.println(wardrobePieces);
    }

    public void howManyThrowedOut(List<Cloth> list) {

        Map<Class,List<Cloth>> groupedClothes = groupCloths(list);
        HashMap<String,Integer> wardrobePieces = wardrobePieces22(groupedClothes);
       // var groupedClothes = groupCloths(list);
       // var wardrobePieces = wardrobePieces22(groupedClothes);
        System.out.println("Kidobott: ");
        System.out.println(wardrobePieces);

}}
