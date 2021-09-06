package utils;

import grade.Grade;
import kids.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileReader {

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

    public static List<Student> allStudent() throws IOException {
        String fileStudents = sourceDirectory + "student.txt";
        List<String> allStudent = readFile(fileStudents);
        List<Student> students = new ArrayList<>();


        for (String student : allStudent) {
            String[] split = student.split(":");
            String name = split[0];

            String[] gradesString = split[1].split(",");
            List<Grade> grades = new ArrayList<>();
            for (int i = 0; i < gradesString.length; i++) {
                grades.add(Grade.values()[Integer.parseInt(gradesString[i])-1]);
            }
            Student kido = new Student(name, grades);
            students.add(kido);
        }
        return students;
    }
}

