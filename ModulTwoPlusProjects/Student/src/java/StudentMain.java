import kids.Student;
import utils.FileReader;

import java.io.IOException;
import java.util.List;

public class StudentMain {
    public void logBookPrint(List<Student> student) throws IOException {
        for (Student kido : student) {
            System.out.println(kido.getName() + "'s grades are: " + kido.getGradeAsNumber() + ". His avarage " +
                    "are: "+ (kido.getAvarage()/kido.getGrade().size()) );
        }

    }


    public static void main(String[] args) throws IOException {
        StudentMain studentMain = new StudentMain();
        studentMain.logBookPrint(FileReader.allStudent());

    }
}
