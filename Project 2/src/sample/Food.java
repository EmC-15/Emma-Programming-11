package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Food {
    public String name;
    private int quantity;

    //constructor:
    public Food(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }


    //returns the item in the list as a string
    public String toString(){
        return "Food Name: " + name + "\t\tQuantity: " + quantity;
    }



    //writes the added food to the file
    public void writeToFile(String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(name + ",\r");
        bw.write(quantity + "\r");
        bw.write(";\r");
        bw.close(); //must always close file
    }


    //clears the file (so that the new list can be written)
    public void removeFromFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("");
        bw.close();


    }


    // Function to remove duplicates from an ArrayList
    public static ArrayList<Food> removeDuplicates(ArrayList<Food> list){

        // Create a new ArrayList
        ArrayList<Food> newList = new ArrayList<Food>();

        // Traverse through the first list
        for (Food element : list) {

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

