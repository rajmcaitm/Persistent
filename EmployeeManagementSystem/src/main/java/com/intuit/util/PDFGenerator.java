package com.intuit.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.intuit.entity.Employee;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import static com.lowagie.text.PageSize.A4;


public class PDFGenerator {

    private List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void generate(HttpServletResponse response) throws DocumentException, IOException {

        Document document = new Document(A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(20);

        Paragraph paragraph = new Paragraph("List Of Employee's", fontTiltle);

        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(paragraph);

        PdfPTable table = new PdfPTable(10);

        table.setWidthPercentage(100f);
        table.setTotalWidth(A4.rotate().getWidth() - 25);
        table.setSpacingBefore(5);

        PdfPCell cell = new PdfPCell();

        cell.setBackgroundColor(CMYKColor.MAGENTA);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font.setColor(CMYKColor.WHITE);

        cell.setPhrase(new Phrase("ID", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Employee First Name", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Employee Middle Name", font));
        table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Last Name", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Address", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee mobile No", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Salary", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Dept", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Type", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Gender", font));
		table.addCell(cell);

        for (Employee employee : employeeList) {

            table.addCell(String.valueOf(employee.getEmpId()));
			table.addCell(employee.getEmpFirstName());
			table.addCell(employee.getEmpMiddleName());
			table.addCell(employee.getEmpLastName());
            table.addCell(employee.getEmpAddress());
			table.addCell(String.valueOf(employee.getEmpMobileNo()));
			table.addCell(String.valueOf(employee.getEmpSalary()));
			table.addCell(employee.getEmpDept());
			table.addCell(String.valueOf(employee.getIsEmpPermanent()));
			table.addCell(String.valueOf(employee.getGerder()));
		}
        document.add(table);

        document.close();
    }
}