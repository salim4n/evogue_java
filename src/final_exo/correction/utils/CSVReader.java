package final_exo.correction.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

    public List<String> readCsv(String path) {

        String csvFile = path;
        String line;
        String csvSplitBy = ",";

        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(csvSplitBy);
                data.add(Arrays.toString(rowData));

            }

            return data;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
