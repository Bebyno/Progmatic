package excelHandler;

import modell.Employee;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHandler {
    private static final String PATH = "java/resources/ExcelToJava.xlsx";


    private Object getCellValue(Cell cell) {

        switch (cell.getCellType()) {

            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();

            case Cell.CELL_TYPE_BOOLEAN:
                return cell.getBooleanCellValue();

            case Cell.CELL_TYPE_NUMERIC:
                return cell.getNumericCellValue();
        }

        return null;
    }

            public List<Employee> readFile(String path) throws IOException{


            List<Employee> listEmployees = new ArrayList<>();

            FileInputStream inputStream = new FileInputStream(new File(path));


            Workbook workbook = new XSSFWorkbook(inputStream);


            Sheet firstSheet = workbook.getSheetAt(0);


            Iterator<Row> iterator = firstSheet.iterator();


            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator
                        = nextRow.cellIterator();
                Employee emp = new Employee();
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();

                    int columnIndex = nextCell.getColumnIndex();

                    switch (columnIndex) {

                        case 0:
                            emp.setName((String) getCellValue(nextCell));
                            break;

                        case 1:
                            emp.setGender((String) getCellValue(nextCell));
                            break;

                        case 2:

                            emp.setAge((Double) getCellValue(nextCell));
                            break;

                    }
                }
                listEmployees.add(emp);
            }

            workbook.close();
            inputStream.close();

            return listEmployees;
        }
    }



