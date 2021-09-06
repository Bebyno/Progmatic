package modell;

public enum MajorEnum {
    ANG("anglisztika"),
    INF("informatikus könyvtáros"),
    HIS("történelem"),
    OTHER("opsz");

    public final String label;

    MajorEnum(String str) {
        label = str;
    }

    public static MajorEnum getEnumByLabel(String label) {
        for (MajorEnum currentEnum : values()) {
            if (currentEnum.label.equals(label)) {
                return currentEnum;
            }
        }
        return MajorEnum.OTHER;
    }
}
