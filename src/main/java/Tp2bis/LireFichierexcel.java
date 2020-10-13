package Tp2bis;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

@SuppressWarnings("unused")
public class LireFichierexcel {

    String cvsFilePath="C:\\Users\\lens\\Desktop\\progconcurentiel\\javaTp2\\files\\sales.csv";
    BufferedReader LineRead;

    {
        try {
            LineRead = Files.newBufferedReader(Paths.get(cvsFilePath));
           CSVParser records = CSVParser.parse(LineRead,CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            Map<Integer,Aide> AideMap = new HashMap<>();
            for (CSVRecord record:records){
                Aide aide = new Aide();
                aide.setStudentId(Integer.parseInt(record.get(0)));
                aide.setStudentName(record.get(1));

                AideMap.put(Integer.parseInt(record.get(0)),aide);

                System.out.println(AideMap);
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}


