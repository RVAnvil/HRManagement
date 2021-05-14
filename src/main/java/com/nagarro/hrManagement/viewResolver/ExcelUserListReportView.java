package com.nagarro.hrManagement.viewResolver;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nagarro.hrManagement.constant.Constant;
import com.nagarro.hrManagement.model.EmployeeDetails;

@Component
public class ExcelUserListReportView extends AbstractXlsView {

 @Override
 @SuppressWarnings("unchecked")
 protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  
  response.setHeader("Content-disposition", "attachment; filename=\"employee_list.xls\"");
  
  
  List<EmployeeDetails> empList = (List<EmployeeDetails>) model.get(Constant.EMPLOYEE_LIST);
  
  Sheet sheet = workbook.createSheet("Employee List");
  
  Row header = sheet.createRow(0);
  header.createCell(0).setCellValue(Constant.CODE);
  header.createCell(1).setCellValue(Constant.NAME);
  header.createCell(2).setCellValue(Constant.LOCATION);
  header.createCell(3).setCellValue(Constant.EMAIL);
  header.createCell(4).setCellValue(Constant.DATE_OF_BIRTH);
  int rowNum = 1;
  
  for(EmployeeDetails emp : empList){
   Row row = sheet.createRow(rowNum++);
   row.createCell(0).setCellValue(emp.getEmpCode());
   row.createCell(1).setCellValue(emp.getEmpName());
   row.createCell(2).setCellValue(emp.getEmpLocation());
   row.createCell(3).setCellValue(emp.getEmpEmail());
   row.createCell(4).setCellValue(emp.getEmpDOB());
  }
  
 }

}