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

    private Map<Integer,Commande> commandeMap;

    public LireFichierexcel(){
        this.commandeMap = new HashMap<>();
        String cvsFilePath="C:\\Users\\lens\\Desktop\\progconcurentiel\\javaTp2\\files\\sales.csv";
        BufferedReader LineRead;
        try {
            LineRead = Files.newBufferedReader(Paths.get(cvsFilePath));
            CSVParser records = CSVParser.parse(LineRead,CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            for (CSVRecord record:records){
                Commande commande = new Commande();
                commande.setStudentId(Integer.parseInt(record.get(0)));
                commande.setStudentName(record.get(1));

                commandeMap.put(Integer.parseInt(record.get(0)),commande);

                System.out.println(commandeMap);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

   Integer[] liste1_1 = {10,null,30,40,50};
   Integer[] liste1_2 = {110,120,130,140,150};
   Integer resultat = getPremierSinonDeuxieme(liste1_1,liste1_2,1);

   public static <T> T getPremierSinonDeuxieme(T []tab1,T[] tab2,int index) {
        if (tab1[index] == null)
            return tab2[index];
        return tab1[index];
   }

    String[] liste2_1 = {"cerise",null,null,"Pomme","Orange"};
    String[] liste2_2 = {"Navet","Tomate","Carotte","Concombre","Patate"};
    String resultat2 = getPremierSinonDeuxieme(liste2_1,liste2_2,1);

}


