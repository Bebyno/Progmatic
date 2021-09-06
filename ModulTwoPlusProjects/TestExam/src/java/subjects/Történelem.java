package subjects;

import enums.SubjectType;

import java.util.List;

public class Történelem extends Subject{

    public Történelem(String subjectcode, String subjectname, SubjectType subjectType, List<Integer> semester, int kredit, List<String> preSubjectCode) {
        super(subjectcode, subjectname, subjectType, semester, kredit, preSubjectCode);
    }
}
