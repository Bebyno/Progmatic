package FileReader;

import enums.Major;
import subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {
    private List<Subject> allSubject;

    public List<Subject> setAllSubject(List<Subject> allSubjects) {
       return this.allSubject = allSubjects;
    }
    public  Map<Major, List<Subject>> subjectInMap(List<Subject> allSubject) {
        Map<Major, List<Subject>> major = new HashMap<>();
        for (Subject subject : allSubject) {
            /*Major key = subject.getClass();*/
           // System.out.println(key);
            if (!major.containsKey(subject.getMajor())) {
                major.put(subject.getMajor(), new ArrayList<>());
            }
            List<Subject> currentMajor = major.get(subject.getMajor());
            currentMajor.add(subject);

        }
        return major;
    }
}
