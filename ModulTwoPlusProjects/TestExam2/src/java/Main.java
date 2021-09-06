import FileReader.Mapping;
import FileReader.Reading;
import enums.Major;
import enums.SubjectType;
import subject.Subject;

import java.io.IOException;
import java.util.*;

public class Main {
    Mapping map = new Mapping();


    /**
     * Olvasd be a fájlt szak szerint rendezve!
     */
    private Map<Major, List<Subject>> Task1() throws IOException {
        return map.subjectInMap(map.setAllSubject(Reading.readAllSubject()));

    }

    /**
     * Írj metódust, amely visszaadja (adatszerkezetben) azoknak a tanegységeket, amelyeknek van gyenge előfeltétele.
     */
    private List<String> Task2(Map<Major, List<Subject>> listedMap) {
        List<String> easyPreSub = new ArrayList<>();

        for (List<Subject> subject : listedMap.values()) {
            for (Subject ezPre : subject) {
                for (int i = 0; i < ezPre.getPreSubjectCode().size(); i++) {
                    if (ezPre.getPreSubjectCode().get(i).contains("*")) {
                        easyPreSub.add(ezPre.getSubjectname());
                    }
                }
            }
        }
        System.out.println(easyPreSub);
        System.out.println(easyPreSub.size());
        return easyPreSub;
    }

    /**
     * Írj metódust, amely két bemeneti paramétert kap: a szakhoz tartozó tanegységek listáját és egy félévet
     * (a félév számát), és visszaadja (adatszerkezetben) azokat a tanegységeket, amelyek arra a félévre vannak ajánlva.
     */
    private List<String> Task3(Map<Major, List<Subject>> map, int semester) throws IOException {
        List<String> names = new ArrayList<>();

        for (List<Subject> subjects : map.values()) {
            for (Subject currentSub : subjects)
                for (int i = 0; i < currentSub.getSemester().size(); i++) {
                    if (currentSub.getSemester().get(i) == semester) {
                        names.add(currentSub.getSubjectname());
                    }
                }
        }
        System.out.println(names);
        System.out.println(names.size());

        return names;
    }

    /**
     * Írj metódust, amely visszaadja az első legtöbb előfeltétellel rendelkező tanegységet szakokra lebontva!
     */
    private Map<Major, Subject> Task4(Map<Major, List<Subject>> map) throws IOException {
        Map<Major, Subject> maxByMajor = new HashMap<>();

        for (Map.Entry<Major, List<Subject>> current : map.entrySet()) {
            int max = 0;
            Subject maxSubject = null;
            for (Subject currentPreSub : current.getValue()) {
                if (currentPreSub.getPreSubjectCode().size() > max) {
                    max = currentPreSub.getPreSubjectCode().size();
                    maxSubject = currentPreSub;
                }
            }
            maxByMajor.put(current.getKey(), maxSubject);

            System.out.println(current.getKey());
            System.out.println(maxSubject.getSubjectname() + " - " + maxSubject.getPreSubjectCode().size());
        }
        return maxByMajor;
    }

    /**
     * Írj metódust, amely visszaadja, hogy szakonként mekkora a K (kollokvium) és a G (gyakorlat) tanegységek aránya!
     */
    public void Task5(Map<Major, List<Subject>> map) {


        for (List<Subject> subject : map.values()) {
            double k = 0;
            double elsek = 0;
            double g = 0;
            for (Subject rate : subject) {
                if (rate.getSubjectType() == SubjectType.K) {
                    k++;
                }
                if (rate.getSubjectType() == SubjectType.G) {
                    g++;
                } else {
                    elsek++;
                }
            }


            System.out.println(subject.get(0).getMajor() + ": " + String.format("%.2f", k / (k + g + elsek) * 100) + "% kollo" +
                    "kvium és " + String.format("%.2f", g / (k + g + elsek) * 100) + "% gyak");
        }
    }

    /**
     * Írj metódust, amely visszaadja az összes olyan tanegységet, amelynek megnevezésében szerepel a “nyelv” szó!
     * (Akár szóelemként is. Tehát a metódus keresi és megtalálja a tanegységet,
     * amelynek megnevezésében akár a “nyelv”, akár a “nyelvismeret”, akár a “nyelvtudomány” stb. szerepel.)
     */
    public void Task6(Map<Major, List<Subject>> map) {
        List<String> names = new ArrayList<>();

        for (List<Subject> subjects : map.values()) {
            for (Subject currentSub : subjects)
                if (currentSub.getSubjectname().contains("nyelv")) {
                    names.add(currentSub.getSubjectname());
                }
        }
        System.out.println(names);
    }

    public List<String> PreTask1(Map<Major, List<Subject>> map) {
        List<String> names = new ArrayList<>();
        for (List<Subject> subjects : map.values()) {
            for (Subject currentSub : subjects)
                if (currentSub.getPreSubjectCode().get(0).equals("NULL")) {
                    names.add(currentSub.getSubjectcode());
                }
        }
        System.out.println(names);
        return names;
    }

    public List<String> PreTask2(Map<Major, List<Subject>> map, SubjectType type) {
        List<String> names = new ArrayList<>();
        for (List<Subject> subjects : map.values()) {
            for (Subject currentSub : subjects)
                if (currentSub.getSubjectType().equals(type)) {
                    names.add(currentSub.getSubjectcode());
                }
        }
        System.out.println(names);
        System.out.println(names.size());
        return names;
    }

    public String PreTask3(Map<Major, List<Subject>> map) {
        int max = 0;
        String name = null;
        for (List<Subject> subjects : map.values()) {
            for (Subject currentSub : subjects) {
                if (currentSub.getPreSubjectCode().size() > max) {
                    max = currentSub.getPreSubjectCode().size();
                    name = (currentSub.getSubjectname() +" (" + currentSub.getSubjectcode()+") ");
                }
            }
        }
        System.out.println(name +"- "+ max +" előfeltétel");
        return name;
    }

    public void PreTask4(Map<Major, List<Subject>> map){


    }


    public static void main(String[] args) {

        try {
            Main main = new Main();
            Map<Major, List<Subject>> listedMap = main.Task1();

            main.Task1();
            main.Task2(listedMap);
            System.out.println("__________");
            main.Task3(listedMap, 1);
            System.out.println("__________");
            main.Task4(listedMap);
            System.out.println("__________");
            main.Task5(listedMap);
            System.out.println("__________");
            main.Task6(listedMap);
            System.out.println("__________");
            main.PreTask1(listedMap);
            System.out.println("__________");
            main.PreTask2(listedMap, SubjectType.EF);
            System.out.println("__________");
            main.PreTask3(listedMap);
            System.out.println("__________");
            main.PreTask4(listedMap);


        } catch (IOException e) {
            System.out.println("Error");
        }


    }
}

