package modell;

import util.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Major {
    private MajorEnum major;
    private String unitCode;
    private String unitName;
    private UnitType unitType;             // TODO Enum? pipa
    private List<Integer> recommendedSemesters;   // TODO List? pipa
    private int credit;
    private List<String> precondition = new ArrayList<>();           // TODO List? pipa
    private int maxPreconditionCount = 0;

    public Major() {

    }

    public Major(String[] parts) {
        this(
                parts[0],
                parts[1],
                parts[2],
                UnitType.valueOf(parts[3]),
                Utils.parseIntegerList(Arrays.asList(parts[4].split("\\|"))),
                Integer.parseInt(parts[5]),
                Arrays.asList(parts[6].split("\\|"))
        );
    }

    public Major(String major,
                 String unitCode,
                 String unitName,
                 UnitType unitType,
                 List<Integer> recommendedSemesters,
                 int credit,
                 List<String> precondition) {
        this.major = MajorEnum.getEnumByLabel(major);
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.unitType = unitType;
        this.recommendedSemesters = recommendedSemesters;
        this.credit = credit;
        this.precondition = precondition;
    }

    public int getMaxPreconditionCount() {
        return maxPreconditionCount;
    }

    public void setMaxPreconditionCount(int maxPreconditionCount) {
        this.maxPreconditionCount = maxPreconditionCount;
    }

    public void incrementMaxPreconditionCount() {
        maxPreconditionCount++;
    }

    public MajorEnum getMajor() {
        return major;
    }

    public void setMajor(MajorEnum major) {
        this.major = major;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public List<Integer> getRecommendedSemesters() {
        return recommendedSemesters;
    }

    public void setRecommendedSemesters(List<Integer> recommendedSemesters) {
        this.recommendedSemesters = recommendedSemesters;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<String> getPrecondition() {
        return precondition;
    }

    public void setPrecondition(List<String> precondition) {
        this.precondition = precondition;
    }
}
