package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Friend {
    public String name;
    private String pronouns;

    //constructor:
    Friend(String name, String pronouns){
        this.name = name;
        this.pronouns = pronouns;
    }


    //getters and setters:
    public String toString(){
        return "Name: " + name + "\t\tPronouns: " + pronouns;
    }



    //writes the added friend to the file
    public void writeToFile(String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter((fw));

        bw.write(name + ",\r");
        bw.write(pronouns + "\r");
        bw.write(";\r");
        bw.close(); //must always close file
    }


    // Function to remove duplicates from an ArrayList
    public static ArrayList<Friend> removeDuplicates(ArrayList<Friend> list){

        // Create a new ArrayList
        ArrayList<Friend> newList = new ArrayList<Friend>();

        // Traverse through the first list
        for (Friend element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

}
