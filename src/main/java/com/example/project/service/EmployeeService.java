package com.example.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class EmployeeService
{
    @Autowired
    public CsvService csvService;

    @Autowired
    public ExcelService excelService;

    public void getFile(MultipartFile file) throws Exception
    {
        String nameFile=file.getOriginalFilename();
        File dataFile=new File("C:\\java\\SaveFile\\csv\\"+nameFile);
        if (!dataFile.exists())
        {
            dataFile.createNewFile();
        }
        write(file, Path.of(dataFile.getPath()));
        if(null!=nameFile&&nameFile.endsWith(".csv"))
        {
            csvService.csvLogic(dataFile);
        }
        else if(null!=nameFile&&(nameFile.endsWith((".xlsx"))||nameFile.endsWith(".xls")))
        {
            excelService.excelLogic(dataFile);
        }
        else
        {
            throw new Exception("File Extention is Different");
        }
    }
    public void write(MultipartFile file, Path dir)
    {
        try (OutputStream os = Files.newOutputStream(dir))
        {
            os.write(file.getBytes());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
