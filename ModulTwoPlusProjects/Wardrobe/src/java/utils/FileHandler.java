package utils;

import cloth.*;
import clothAttribute.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandler {
    private static final String sourceDirectory = "src/resource/";
    public static Set<String> classesInWardrobe = new HashSet<>();


    public static List<String> readFile(String fileName) throws IOException {
        List<String> myList = new ArrayList<>();
        File file = new File(fileName);
        Scanner sc;
        if (file.exists()) {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                myList.add(line);
            }
        }
        return myList;
    }




    public static List<Cloth> readAllClothes() throws IOException {
        String fileClothes = sourceDirectory + "clothes.txt";
        List<String> allClothes = readFile(fileClothes);
        List<Cloth> clothes = new ArrayList<>();

// mindegyik 0. eleme maga a class típus legyen

        for (String cloths : allClothes) {
            String[] split = cloths.split(",");
            if(split[0].equals("póló")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                String color = split[3];
                String design = split[4];
                Cloth tshirt = new TShirt(wearer,quality,color,design);
                clothes.add(tshirt);
            }
            if(split[0].equals("ing")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                String sleeved = split[3].toUpperCase();
                Cloth shirt = new Shirt(wearer,quality,sleeved);
                clothes.add(shirt);
            }
            if(split[0].equals("nadrág")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                PantLongness longness = PantLongness.valueOf(split[3].toUpperCase());
                Cloth pant = new Pant(wearer,quality,longness);
                clothes.add(pant);
            }
            if(split[0].equals("kabát")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                JacketStyle style = JacketStyle.valueOf(split[3].toUpperCase());
                Cloth jacket = new Jacket(wearer,quality,style);
                clothes.add(jacket);
            }
            if(split[0].equals("cipő")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                int size = Integer.parseInt( split[3]);
                Cloth shoe = new Shoe(wearer,quality,size);
                clothes.add(shoe);
            }
            if(split[0].equals("zokni")){
                classesInWardrobe.add(split[0]);
                Wearer wearer = Wearer.valueOf(split[1].toUpperCase());
                Quality quality =Quality.values()[Integer.parseInt(split[2])-1];
                SocksStyle style = SocksStyle.valueOf(split[3].toUpperCase());
                Cloth sock = new Sock(wearer,quality,style);
                clothes.add(sock);


        }

    }
        return clothes;

    // külön típusonként feltölteni? Tehát, hogy írni 1 if-et, hogy ha
    // split[0].equals póló ->akkor tegye be a póló típusú list-ba.
    // ezt lehet vajon 1 függvénnyel? vagy annyi függvény ahány ruhanem? sok if-fel?
}}
