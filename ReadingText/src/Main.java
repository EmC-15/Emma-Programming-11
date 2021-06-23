import java.io.*;
import java.util.ArrayList;

public class Main {

    public static int findStringIndex(ArrayList<String> lines, String word) throws IOException {

        for (int i = 0; i<lines.size(); i++){

            if (lines.get(i).contains(word)){
                System.out.println(word + " is at index: " + i);
            }

        }

        int i = lines.indexOf(word);
        return i;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
            lines.add(line);

        }
        br.close();

        System.out.println("\nfind the word in the file:");
        findStringIndex(lines, "However");

    }
}


