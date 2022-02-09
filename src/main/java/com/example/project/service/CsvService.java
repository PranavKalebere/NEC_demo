package com.example.project.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CsvService {


    public void csvLogic(File file)
    {
        System.out.println("File Belong to Csv Extention");
        System.out.println(file.getName());
        System.out.println();
        try (CSVReader reader = new CSVReader(new FileReader(file)))
        {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
