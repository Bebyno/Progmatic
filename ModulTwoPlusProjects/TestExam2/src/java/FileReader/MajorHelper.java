package FileReader;

import enums.Major;

import java.util.HashMap;
import java.util.Map;

public class MajorHelper {
    public static Map<String, Major> majorByName = new HashMap<>();

    public static void registerMajor(Major major) {
        majorByName.put(major.NAME, major);
    }
}
