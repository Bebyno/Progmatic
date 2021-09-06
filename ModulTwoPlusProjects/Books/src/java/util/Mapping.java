package util;

import book.Books;
import enums.Categorys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {

    public Map<String, List<Books>> mappLoad(List<Books> lista) {
        Map<String, List<Books>> map = new HashMap<>();
        for (Books book : lista) {
            if (!map.containsKey((book.getCategory()))) {
                map.put(book.getCategory(), new ArrayList<>());
            }
            List<Books> currentBook = map.get(book.getCategory());
            currentBook.add(book);
        }
        return map;

    }
}


