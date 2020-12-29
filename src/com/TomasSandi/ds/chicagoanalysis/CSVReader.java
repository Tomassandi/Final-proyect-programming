package com.TomasSandi.ds.chicagoanalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.TomasSandi.ds.chicagoanalysis.models.Worker;
import com.TomasSandi.ds.chicagoanalysis.models.ElasticWorkerArray;

public class CSVReader {
    
    public static void main (String[] args){
        
        String csvPath = "C:\\Users\\TOMMY\\Downloads\\Final-project-programming-1-Ulead-main\\Final-project-programming-1-Ulead-main\\ChicagoEmployeeData.csv";
        String csvSeparator = ",";
        String line;
        
        ElasticWorkerArray workers = new ElasticWorkerArray();
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvPath))){
            while((line = bufferedReader.readLine()) != null){
                line += ", ";
                String[] person = line.split(csvSeparator);
                Worker personObj = new Worker(person[1], person[0], person[2],
                        person[3], person[4],person[5], person[6], person[7],
                        person[8]
                );
                workers.addWorker(personObj);
                //System.out.println(personObj.toString());
            }
            
            Facts fact = new Facts(workers.getWorkerArray());
            
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file path provided is not valid");
        } 
        
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
