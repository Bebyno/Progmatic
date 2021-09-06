
import exam.Exam;
import modell.Major;
import modell.MajorEnum;
import modell.UnitType;
import util.DocumentReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class University {
    public static void main(String[] args) {
        try {
            Map<MajorEnum, List<Major>> majorMap = Exam.runFirst();
            List<Major> secondResult = Exam.runSecond(majorMap);
            List<String> thirdResult =
                    Exam.runThird(majorMap.get(MajorEnum.ANG), UnitType.K);
            Major fourthResult =
                    Exam.runFourth(majorMap);
            List<Major> fifthResult = Exam.runFifth(majorMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println("Jó volt?");
    }


}
