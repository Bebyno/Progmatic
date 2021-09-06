package exam;

import modell.Major;
import modell.MajorEnum;
import modell.UnitType;
import util.DocumentReader;

import java.io.IOException;
import java.util.*;

public class Exam {
    /**
     * Olvasd be a fájlt szak szerint rendezve! (szak.txt)
     */
    public static Map<MajorEnum, List<Major>> runFirst() throws IOException {
        DocumentReader.read();
        Map<MajorEnum, List<Major>> firstResult = DocumentReader.majorMap;
        System.out.println();
        return firstResult;
    }

    /**
     * Írj egy metódust, amely megkapja a beolvasott
     *     Map<MajorEnum, List<Major>> majorMap collection-t
     *     majd visszaadja (List<Major>) azokat a tanegységeket
     *     amelyeknek nincs semmilyen előfeltétele.
     */
    public static List<Major> runSecond(Map<MajorEnum, List<Major>> majorMap) {
        List<Major> resultList = new ArrayList<>();
        List<String> resultNames = new ArrayList<>();
        for (List<Major> majorList : majorMap.values()) {
            for (Major major : majorList) {
                if (major.getPrecondition().contains("NULL")) {
                    resultList.add(major);
                    resultNames.add(major.getUnitName());
                }
            }
        }
        System.out.println(resultNames);
        return resultList;
    }

    /**
     * Írj metódust, amely két bemeneti paramétert kap:
     * a szakhoz tartozó tanegységek listáját
     * (List<Major> majorList collection)
     * és egy típust (UnitType),
     * és visszaadja (List<String>) az összes olyan típusú tanegységet
     * a bemeneti paraméterként kapott listából.
     */
    public static List<String> runThird(
            List<Major> majorList,
            UnitType unitType) {
        List<String> majorNames = new ArrayList<>();
        for (Major major : majorList) {
            if (major.getUnitType().equals(unitType)) {
                majorNames.add(major.getUnitName());
            }
        }
        return majorNames;
    }

    /**
     * Írj metódust, amely visszaadja az első legtöbb
     * előfeltétellel rendelkező tanegységet
     * (az összes tanegység közül, és nem szakonként)!
     */
    public static Major runFourth(Map<MajorEnum, List<Major>> majorMap) {
        Major result = new Major();
        for (List<Major> majorList : majorMap.values()) {
            for (Major currentMajor : majorList) {
                if (currentMajor.getPrecondition().size()
                        > result.getPrecondition().size()) {
                    result = currentMajor;
                }
            }
        }
        return result;
    }

    /**
     * Írj metódust, amely visszaadja azt a tanegységet (vagy tanegységeket),
     * ahol a legtöbb egymásra épülő előfeltétel van!
     */
    public static List<Major> runFifth(Map<MajorEnum, List<Major>> majorMap) {

        return null;
    }
}
