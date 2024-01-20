package com.intuit.util;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.intuit.entity.Employee;
import com.intuit.enums.Gerder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelGenerator {

    private List<Employee> employeeList;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public ExcelGenerator(List<Employee> employeeList) {
        this.employeeList = employeeList;
        workbook = new XSSFWorkbook();
    }

    private void writeHeader() {
        sheet = workbook.createSheet("Employee");
        Row row = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        createCell(row, 0, "Emp_ID", style);
        createCell(row, 1, "Emp_First_Name", style);
        createCell(row, 2, "Emp_Middle_Name", style);
        createCell(row, 3, "Emp_Last_Name", style);
        createCell(row, 4, "Emp_Address", style);
        createCell(row, 5, "Emp_Mobile_No", style);
        createCell(row, 6, "Emp_Salary", style);
        createCell(row, 7, "Emp_Dept", style);
        createCell(row, 8, "Emp_Type", style);
        createCell(row, 9, "Emp_Gender", style);

    }

    private void createCell(Row row, int columnCount, Object valueOfCell, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (valueOfCell instanceof Integer) {
            cell.setCellValue((Integer) valueOfCell);
        } else if (valueOfCell instanceof Long) {
            cell.setCellValue((Long) valueOfCell);
        } else if (valueOfCell instanceof String) {
            cell.setCellValue((String) valueOfCell);
        } else if (valueOfCell instanceof Double) {
            cell.setCellValue((Double) valueOfCell);
        } else if (valueOfCell instanceof Boolean) {
            cell.setCellValue((Boolean) valueOfCell);
        } else {
            cell.setCellValue(String.valueOf((Gerder) valueOfCell));
        }
        cell.setCellStyle(style);
    }

    private void write() {
        int rowCount = 1;
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
        for (Employee record : employeeList) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
            createCell(row, columnCount++, record.getEmpId(), style);
            createCell(row, columnCount++, record.getEmpFirstName(), style);
            createCell(row, columnCount++, record.getEmpMiddleName(), style);
            createCell(row, columnCount++, record.getEmpLastName(), style);
            createCell(row, columnCount++, record.getEmpAddress(), style);
            createCell(row, columnCount++, record.getEmpMobileNo(), style);
            createCell(row, columnCount++, record.getEmpSalary(), style);
            createCell(row, columnCount++, record.getEmpDept(), style);
            createCell(row, columnCount++, record.getIsEmpPermanent(), style);
            createCell(row, columnCount++, record.getGerder(), style);

        }
    }

    public void generateExcelFile(HttpServletResponse response) throws IOException {
        writeHeader();
        write();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}