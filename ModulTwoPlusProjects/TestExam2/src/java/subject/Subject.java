package subject;

import enums.Major;
import enums.SubjectType;

import java.util.List;

public class Subject {

    private Major major;
    private String subjectcode;
    private String subjectname;
    private SubjectType subjectType;
    private List<Integer> semester;
    private int credit;
    private List<String> preSubjectCode;

    public Subject(Major major,String subjectcode, String subjectname, SubjectType subjectType, List<Integer> semester, int credit, List<String> preSubjectCode) {
        this.major = major;
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
        this.subjectType = subjectType;
        this.semester = semester;
        this.credit = credit;
        this.preSubjectCode = preSubjectCode;
    }

    public Major getMajor() {
        return major;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public List<Integer> getSemester() {
        return semester;
    }

    public void setSemester(List<Integer> semester) {
        this.semester = semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<String> getPreSubjectCode() {
        return preSubjectCode;
    }

    public void setPreSubjectCode(List<String> preSubjectCode) {
        this.preSubjectCode = preSubjectCode;
    }
}
