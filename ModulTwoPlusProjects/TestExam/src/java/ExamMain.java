import enums.SubjectType;
import subjects.Subject;
import utils.ReadFile;

import java.io.IOException;
import java.util.*;

public class ExamMain {


    public List<String> TaskOne(List<Subject> subjectList) {
        List<String> noPreSub = new ArrayList<>();
        for (Subject subject : subjectList) {
            if (subject.getPreSubjectCode().get(0).equals("NULL")) {
                noPreSub.add(subject.getSubjectname());
            }


        }
        System.out.println(noPreSub);
        // System.out.println(noPreSub.size());
        return noPreSub;
    }

    public List<String> TaskTwo(List<Subject> subjectList, SubjectType subjectType) {
        List<String> allThatKindOfType = new ArrayList<>();
        for (Subject subject : subjectList) {
            if (subject.getSubjectType().equals(subjectType)) {
                allThatKindOfType.add(subject.getSubjectname());
            }
        }
        System.out.println(allThatKindOfType);
        //System.out.println(allThatKindOfType.size());
        return allThatKindOfType;
    }

    public String TaskThree(List<Subject> subjectList) {
        int max = 0;

        Map<String, Integer> map = new HashMap<>();
        for (Subject subject : subjectList) {
            if (max < subject.getPreSubjectCode().size()) {
                max = subject.getPreSubjectCode().size();
                map.put(subject.getSubjectname(), subject.getPreSubjectCode().size());
            }
        }

        String key = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                key = entry.getKey();
            }
        }
        System.out.println("Tantárgy: "+key);
        System.out.println("Előfeltételek száma: "+max);
        return key;
    }

    public void Taskfour(){

    }


    public static void main(String[] args) throws IOException {
        ExamMain examMain = new ExamMain();
        examMain.TaskOne(ReadFile.readAllSubject());
        System.out.println("__");
        examMain.TaskTwo(ReadFile.readAllSubject(), SubjectType.V);
        System.out.println("--");
        examMain.TaskThree(ReadFile.readAllSubject());


    }
}
