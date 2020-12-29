package com.tomas.ds.chicagoanalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.tomas.ds.chicagoanalysis.models.Worker;

public class CSVReader {
    
    /**
     * 
     * @param args 
     */
    
    public static void main (String[] args){
        
        String csvPath = "C:\\Users\\TOMMY\\Downloads\\Current_Employee_Names__Salaries__and_Position_Titles (3).csv";
        String csvSeparator = ",";
        String line;
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvPath))){
            
            while((line = bufferedReader.readLine()) != null){
                
                String[] person = line.split(csvSeparator);
                 Worker personObj = new Worker(person[1], person[0], person[2], 
                         person[3], person[4], person[5], person[6]);
                 
                System.out.println(personObj.toString());
                System.out.println("");
            }
            
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file path provided is not valid");
        } 
        
        catch (IOException ioException){
            ioException.printStackTrace();
        }
        
    }
    
}
