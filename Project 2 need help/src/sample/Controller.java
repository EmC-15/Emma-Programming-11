package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField txtGetName;
    public TextField txtGetQuantity;
    public ListView listFood;
    public Button btnSave;
    public Button btnLoad;
    public Button btnDelete;



    public void saveFood(ActionEvent actionEvent) throws IOException {

        listFood.getItems().clear();
        String name = txtGetName.getText();
        int quant = Integer.parseInt(txtGetQuantity.getText());
        Food temp = new Food(name, quant);
        listFood.getItems().add(temp);
        txtGetName.clear();
        txtGetQuantity.clear();


        ObservableList<Food> myList = listFood.getItems();

        for(Food f : myList){
            f.writeToFile("Food.txt");
        }

        listFood.getItems().clear();
        btnLoad.setDisable(false);
    }


    //NEED TO MAKE IT SO THAT WHEN LOAD BTN IS PRESSED, NO DUPLICATE OBJECTS ARE LISTED
    //after deleting items, they still appear even when they are deleted from the text file, they appear when pressed load
    public void loadInventory(ActionEvent actionEvent) throws IOException {

        listFood.getItems().clear();
        ArrayList<Food> foods = CreateFood.createAllFoods("Food.txt");



        for (Food f : foods){
            listFood.getItems().add(f);
        }

        //if(!listFood.contains(f)){}

        //ObservableList<Food> myList = listFood.getItems();
        //Food.removeDuplicates((ArrayList<Food>) myList);


        btnLoad.setDisable(true);


    }


    //IT WORKS NOW!!!!
    //deletes from the file, but load button pressed, it still appears in the list
    public void deleteFood(ActionEvent actionEvent) throws IOException {
        Food temp;
        temp = (Food) listFood.getSelectionModel().getSelectedItem();


        ObservableList<Food> myList = listFood.getItems();

        listFood.getItems().remove(temp);
        CreateFood.foods.remove(temp);

        for(Food f : myList){
            f.removeFromFile("Food.txt");
        }


        for(Food f : myList){
            f.writeToFile("Food.txt");
        }


    }


}
