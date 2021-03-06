package utils;

import enums.SubjectType;
import subjects.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    private static final String sourceDirectory = "src/resources/";

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

    public static List<Subject> readAllSubject() throws IOException {
        String fileSubjects = sourceDirectory + "szakok.txt";
        List<String> allSubject = readFile(fileSubjects);
        List<Subject> subjects = new ArrayList<>();

        for (String subject : allSubject) {
            String[] split = subject.split(";");
            if (split[0].equals("anglisztika")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }


                Subject anglisztika = new Anglisztika(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(anglisztika);
            }
            if (split[0].equals("germanisztika")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject germanistika = new Germanisztika(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(germanistika);
            }
            if (split[0].equals("germanisztika")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject germanistika = new Germanisztika(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(germanistika);
            }
            if (split[0].equals("informatikus k??nyvt??ros")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject informatikusKonyvtaros = new InformatikusK??nyvt??ros(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(informatikusKonyvtaros);
            }
            if (split[0].equals("jap??n")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject japan = new Jap??n(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(japan);
            }
            if (split[0].equals("klasszika filol??gia")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject klasszikaFilologia = new KlasszikaFilol??gia(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(klasszikaFilologia);
            }
            if (split[0].equals("magyar")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject magyar = new Magyar(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(magyar);
            }
            if (split[0].equals("skandinavisztika")) {
                String subjectCode = split[1];
                String subjectName = split[2];
                SubjectType subjectType = SubjectType.valueOf(split[3].toUpperCase());

                String[] semesterString = split[4].split("\\|");
                List<Integer> semester = new ArrayList<>();
                for (int i = 0; i < semesterString.length; i++) {
                    semester.add(Integer.parseInt(semesterString[i]));
                }
                int kredit = Integer.parseInt(split[5]);
                List<String> preSubjectCode = new ArrayList<>();

                String[] preSubString = split[6].split("\\|");
                for (int i = 0; i < preSubString.length; i++) {
                    preSubjectCode.add(preSubString[i]);
                }

                Subject skandinavisztika = new Skandinavisztika(subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(skandinavisztika);
            }


        }
        return subjects;

    }
}
