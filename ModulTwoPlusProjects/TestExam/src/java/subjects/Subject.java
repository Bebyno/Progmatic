package subjects;

import enums.SubjectType;

import java.util.List;

public abstract class Subject {

    private String subjectcode;
    private String subjectname;
    private SubjectType subjectType;
    private List<Integer> semester;
    private int kredit;
    private List<String> preSubjectCode;


    public Subject(String subjectcode, String subjectname, SubjectType subjectType, List<Integer> semester, int kredit, List<String> preSubjectCode) {
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
        this.subjectType = subjectType;
        this.semester = semester;
        this.kredit = kredit;
        this.preSubjectCode = preSubjectCode;
    }




    public String getSubjectcode() {
        return subjectcode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public List<Integer>  getSemester() {
        return semester;
    }

    public int getKredit() {
        return kredit;
    }

    public List<String> getPreSubjectCode() {
        return preSubjectCode;
    }
}
