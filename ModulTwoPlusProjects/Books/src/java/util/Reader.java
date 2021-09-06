package util;

import book.Books;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static final String PATH = "src/resources/";
    public static List<String> helpForTask13 = new ArrayList<>();

    public static List<String> fileReader(String file) throws IOException {
        List<String> doc = new ArrayList<>();

        FileReader fileReader = new FileReader(PATH + file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null; ) {

            doc.add(line);
        }
        return doc;
    }

    public static List<Books> bookReader() throws IOException {
        String bookfile = "books.txt";
        List<String> allBooks = fileReader(bookfile);
        List<Books> books = new ArrayList<>();


        for (String book : allBooks) {
            String[] split = book.split(";");
            String category = null;

            switch (split[0]) {
                case "1":
                    category = "regény";
                    break;
                case "2":
                    category = "ismeretterjesztő";
                    break;
                case "3":
                    category = "mese";
                    break;
                case "4":
                    category = "kalandregény";
                    break;
                case "5":
                    category = "romantikus";
                    break;
                case "6 ":
                    category = "ifjúsági ismeretterjesztő";
                    break;
                case "7 ":
                    category = "ismeretterjesztő kisregény";
                    break;
                case "8":
                    category = "sci-fi";
                    break;
                case "9":
                    category = "önéletrajzi";
                    break;
                case "10":
                    category = "krimi";
                    break;
            }
            String[] splitAuthor = split[1].split(",");
            List<String> authors = new ArrayList<>();
            for (int i = 0; i < splitAuthor.length; i++) {
                authors.add(splitAuthor[i].trim());
            }
            String title = split[2].trim();
            helpForTask13.add(split[2]);
            String publisher = split[3].trim();
            int published = Integer.parseInt(split[4].trim());
            String bookCode = split[5].trim();

            Books currentBook = new Books(category, authors, title, publisher, published, bookCode);
            //System.out.println(currentBook.getAutors());
            books.add(currentBook);
        }
return books;
    }
}
