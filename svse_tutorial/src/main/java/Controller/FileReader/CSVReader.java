package Controller.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public List<List<String>> CSVReader(String filePath){
        List<List<String>> lines = new ArrayList<>();
        try {
            Scanner inputStream = new Scanner(new File(filePath));

            while(inputStream.hasNextLine()){
                String line = inputStream.nextLine();

                String[] values = line.split(",");
//                 this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    } // Controller.FileReader.CSVReader()
} // class Controller.FileReader.CSVReader
