import excelHandler.ExcelHandler;
import modell.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class main {

    public static final String PATH = "src/main/resources/ExcelToJava.xlsx";

    public static void main(String[] args) {


        ExcelHandler excelHandler = new ExcelHandler();

        List<Employee> extractedEmployeeData = new ArrayList<>();

        try {

            extractedEmployeeData = excelHandler.readFile(PATH);
        }

        catch (IOException e) {

            e.printStackTrace();
        }

        for (int i = 0; i < extractedEmployeeData.size(); i++) {

            System.out.println(
                    extractedEmployeeData.get(i).toString());
        }
    }


}
