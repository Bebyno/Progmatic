package FileReader;

import enums.Major;
import enums.SubjectType;
import subject.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reading {

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

        String fileSubjects = sourceDirectory + "szak.txt";
        List<String> allSubject = readFile(fileSubjects);
        List<Subject> subjects = new ArrayList<>();

        for (String subject : allSubject) {
            String[] split = subject.split(";");

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
            for(Major major : Major.values()) {
                MajorHelper.registerMajor(major);
            }
            Major major = MajorHelper.majorByName.get(split[0]);
    if(major == null)
        System.out.println("unkonw major");

                Subject subject1 = new Subject(major,subjectCode, subjectName, subjectType, semester, kredit, preSubjectCode);
                subjects.add(subject1);

        }
        return subjects;

    }
}
