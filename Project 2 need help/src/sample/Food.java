package sample;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Food {

    public String name;
    private int quantity;

    public Food(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }


    public String toString(){
        return "Food Name: " + name + "\t\tQuantity: " + quantity;
    }


    public void writeToFile(String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(name + ",\r");
        bw.write(quantity + "\r");
        bw.write(";\r");
        bw.close(); //must always close file
    }


    public void removeFromFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("");
        bw.close();


    }


    public boolean compareFood(Food f){
        if(this.name.equals(f.name)){
            return true;
        }
        else{
            return false;
        }
    }

/*
    public static void deleteDuplicates(Food f) throws IOException {

        if(f.equals(this.name)){
            f.removeFromFile("Food.txt");

        }

    }
*/


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
