package subjects;

import enums.SubjectType;

import java.util.List;

public class Japán extends Subject{

    public Japán(String subjectcode, String subjectname, SubjectType subjectType, List<Integer> semester, int kredit, List<String> preSubjectCode) {
        super(subjectcode, subjectname, subjectType, semester, kredit, preSubjectCode);
    }
}
