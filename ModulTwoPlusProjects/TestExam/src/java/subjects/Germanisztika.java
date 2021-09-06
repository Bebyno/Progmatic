package subjects;

import enums.SubjectType;

import java.util.List;

public class Germanisztika extends Subject{

    public Germanisztika(String subjectcode, String subjectname, SubjectType subjectType, List<Integer> semester, int kredit, List<String> preSubjectCode) {
        super(subjectcode, subjectname, subjectType, semester, kredit, preSubjectCode);
    }
}
