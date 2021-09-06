import book.Books;
import util.Mapping;
import util.Reader;

import java.io.IOException;
import java.util.*;

public class BooksMain {
    Mapping map = new Mapping();
    Reader reader = new Reader();
    Map<String, List<Books>> loadedMap = fillTheMapp();
    List<String> helpForTask13 = Reader.helpForTask13;


    public Map<String, List<Books>> fillTheMapp() {
        try {
            return map.mappLoad(Reader.bookReader());
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return null;
    }


    public Map<String, List<Books>> Task1() {
        return fillTheMapp();
    }

    public List<String> Task2(Map<String, List<Books>> loadedMap) {
        List<String> names = new ArrayList<>();

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getTitle().contains("Arab")) {
                    names.add(currentBook.getTitle());
                }
            }
        }
        System.out.println(names);
        return names;
    }

    public List<String> Task3(Map<String, List<Books>> loadedMap) {
        List<String> names = new ArrayList<>();

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getTitle().contains("100")) {
                    names.add(currentBook.getTitle());
                }
            }
        }
        System.out.println(names);
        return names;
    }

    public int Task4(Map<String, List<Books>> loadedMap, String authors) {
        int howManyBookHeOrTheWrote = 0;
        List<String> booksName = new ArrayList<>();

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getAutors().contains(authors)) {
                    howManyBookHeOrTheWrote++;
                    booksName.add(currentBook.getTitle());
                }
            }
        }
        System.out.println("The number how many books " + authors + " wrote: " + howManyBookHeOrTheWrote);
        // System.out.println(booksName);
        return howManyBookHeOrTheWrote;
    }

    public Map<String, Integer> Task5(Map<String, List<Books>> loadedMap) {
        Map<String, Integer> allAuthor = new HashMap<>();
        Map<String, Integer> theMostPopular = new HashMap<>();
        int max = 0;
        String key;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                for (int i = 0; i < currentBook.getAutors().size(); i++) {
                    if (!allAuthor.containsKey((currentBook.getAutors().get(i)))) {
                        allAuthor.put(currentBook.getAutors().get(i), 0);
                    }
                    if (allAuthor.keySet().contains(currentBook.getAutors().get(i))) {

                        int counter = allAuthor.get(currentBook.getAutors().get(i));
                        allAuthor.put(currentBook.getAutors().get(i), counter + 1);
                        if (counter > max) {
                            max = counter + 1;
                        }
                    }
                }

            }
        }
        for (Map.Entry<String, Integer> famous : allAuthor.entrySet()) {
            if (famous.getValue() == max) {
                key = famous.getKey();
                theMostPopular.put(key, max);
            }

        }
        System.out.println(theMostPopular);
        // System.out.println();
        //System.out.println("The most famous author is: "+key+ ". Selling " + max + " books of his.");
        return theMostPopular;
    }

    public Map<String, Integer> Task6(Map<String, List<Books>> loadedMap) {
        Map<String, Integer> allPublisher = new HashMap<>();
        Map<String, Integer> theMostPopularPublisher = new HashMap<>();
        int max = 0;
        String key;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {

                if (!allPublisher.containsKey((currentBook.getPublisher()))) {
                    allPublisher.put(currentBook.getPublisher(), 0);
                }
                if (allPublisher.keySet().contains(currentBook.getPublisher())) {

                    int counter = allPublisher.get(currentBook.getPublisher());
                    allPublisher.put(currentBook.getPublisher(), counter + 1);
                    if (counter > max) {
                        max = counter + 1;
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> famous : allPublisher.entrySet()) {
            if (famous.getValue() == max) {
                key = famous.getKey();
                theMostPopularPublisher.put(key, max);
            }

        }
        System.out.println(theMostPopularPublisher);

        return theMostPopularPublisher;
    }

    public String Task7(Map<String, List<Books>> loadedMap) {

        String earliestPublish = null;
        int min = 3000;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getPublished() < min) {
                    min = currentBook.getPublished();
                    earliestPublish = currentBook.getTitle();
                }
            }
        }
        System.out.println("Earlist publish: " + earliestPublish);
        return earliestPublish;
    }

    public String Task8(Map<String, List<Books>> loadedMap) {

        String earliestPublish = null;
        int max = 0;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getPublished() > max) {
                    max = currentBook.getPublished();
                    earliestPublish = currentBook.getTitle();
                }
            }
        }
        System.out.println("Latest publish: " + earliestPublish);
        return earliestPublish;
    }

    public Map<String, Integer> Task9(Map<String, List<Books>> loadedMap) {
        Map<String, Integer> allType = new HashMap<>();
        Map<String, Integer> theMostPopularType = new HashMap<>();
        int counterType = 0;
        String key;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {

                if (!allType.containsKey((currentBook.getCategory()))) {
                    allType.put(currentBook.getCategory(), 0);
                }
                if (allType.keySet().contains(currentBook.getCategory())) {

                    int counter = allType.get(currentBook.getCategory());
                    allType.put(currentBook.getCategory(), counter + 1);
                    if (counter > counterType) {
                        counterType = counter + 1;
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> famous : allType.entrySet()) {
            if (famous.getValue() == counterType) {
                key = famous.getKey();
                theMostPopularType.put(key, counterType);
            }

        }
        System.out.println(theMostPopularType);

        return theMostPopularType;
    }

    public Map<String, Integer> Task10(Map<String, List<Books>> loadedMap) {
        Map<String, Integer> allType = new HashMap<>();
        Map<String, Integer> theMostPopularType = new HashMap<>();
        int counterType = 100;
        String key;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {

                if (!allType.containsKey((currentBook.getCategory()))) {
                    allType.put(currentBook.getCategory(), 0);
                }
                if (allType.keySet().contains(currentBook.getCategory())) {

                    int counter = allType.get(currentBook.getCategory());
                    allType.put(currentBook.getCategory(), counter + 1);
                    if (counter < counterType) {
                        counterType = counter + 1;
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> lessFamous : allType.entrySet()) {
            if (lessFamous.getValue() == counterType) {
                key = lessFamous.getKey();
                theMostPopularType.put(key, counterType);
            }

        }
        System.out.println(theMostPopularType);

        return theMostPopularType;
    }

    public List<String> Task11(Map<String, List<Books>> loadedMap) {
        List<String> booksNoInStorage = new ArrayList<>();

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {
                if (currentBook.getBookcode().contains("*")) {
                    booksNoInStorage.add(currentBook.getTitle());
                }
            }
        }
        System.out.println(booksNoInStorage);
        return booksNoInStorage;
    }

    public void Task12(Map<String, List<Books>> loadedMap) {
        Map<Character, Integer> allfirstChar = new HashMap<>();
        Map<Character, Integer> mostCommonChar = new HashMap<>();
        int counterChar = 0;
        char key;

        for (List<Books> book : loadedMap.values()) {
            for (Books currentBook : book) {

                if (!allfirstChar.containsKey((currentBook.getTitle().charAt(0)))) {
                    allfirstChar.put((currentBook.getTitle().charAt(0)), 0);
                }
                if (allfirstChar.keySet().contains(currentBook.getTitle().charAt(0))) {

                    int counter = allfirstChar.get(currentBook.getTitle().charAt(0));
                    allfirstChar.put(currentBook.getTitle().charAt(0), counter + 1);
                    if (counter > counterChar) {
                        counterChar = counter + 1;
                    }
                }

            }
        }
        for (Map.Entry<Character, Integer> famous : allfirstChar.entrySet()) {
            if (famous.getValue() == counterChar) {
                key = famous.getKey();
                mostCommonChar.put(key, counterChar);
            }

        }
        System.out.println(mostCommonChar);

        // return theMostPopularType;
    }

    public void Task13(List<String> title) {
        List<String> sortedByTittle = new ArrayList<>();
        /*java.util.Collections.sort(title);
        System.out.println(title);*/
        for (int y = 0; y < title.size(); y++) {

            for (int maxIndex = title.size() - 1; maxIndex >= 0; maxIndex--) {
                for (int i = 0; i < maxIndex; i++) {
                    if (title.get(i).charAt(0)< title.get(i + 1).charAt(0)) {
                        String temp = title.get(i);
                        title.set(i, title.get(i + 1));
                        title.set(i + 1, temp);
                        sortedByTittle.add(title.get(i));
                    }
                }

            }
        }
        System.out.println(sortedByTittle);
    }
public void Task14(Map<String, List<Books>> loadedMap) {

}




    public static void main(String[] args) {
        BooksMain main = new BooksMain();
        main.Task1();
        main.Task2(main.loadedMap);
        System.out.println("--------");
        main.Task3(main.loadedMap);
        System.out.println("--------");
        main.Task4(main.loadedMap, "Danielle Steel");
        System.out.println("--------");
        main.Task5(main.loadedMap);
        System.out.println("--------");
        main.Task6(main.loadedMap);
        System.out.println("--------");
        main.Task7(main.loadedMap);
        System.out.println("--------");
        main.Task8(main.loadedMap);
        System.out.println("--------");
        main.Task9(main.loadedMap);
        System.out.println("--------");
        main.Task10(main.loadedMap);
        System.out.println("--------");
        main.Task11(main.loadedMap);
        System.out.println("--------");
        main.Task12(main.loadedMap);
        System.out.println("--------");
        main.Task13(main.helpForTask13);
        System.out.println("--------");
        main.Task14(main.loadedMap);
        System.out.println("--------");
    }
}
