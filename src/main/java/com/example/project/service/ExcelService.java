package com.example.project.service;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Component
public class ExcelService {
    public void excelLogic(File file) {
        System.out.println("File Belong to Excel Extention");
        System.out.println(file.getName());
        System.out.println();

        try (InputStream excelFile = new FileInputStream(file)){

            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    System.out.print(row.getCell(j) + " ");
                }
                System.out.println("");

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}