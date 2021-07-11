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


    //when button is pressed, a new object it added to the list and is written to the food.txt file
    public void saveFood(ActionEvent actionEvent) throws IOException {

        listFood.getItems().clear();
        String name = txtGetName.getText();
        int quant = Integer.parseInt(txtGetQuantity.getText());
        Food temp = new Food(name, quant);

        if(txtGetName.getText().length() > 0 && txtGetQuantity.getText().toString().length() > 0){
            listFood.getItems().add(temp);
        }

        txtGetName.clear();
        txtGetQuantity.clear();


        ObservableList<Food> myList = listFood.getItems();

        for(Food f : myList){
            f.writeToFile("Food.txt");
        }
        listFood.getItems().clear();

        btnLoad.setDisable(false);
    }



    //takes the information from the food.txt file and then loads the list into the listView
    public void loadInventory(ActionEvent actionEvent) throws IOException {

        listFood.getItems().clear();
        CreateFood.getFoods().clear();

        ArrayList<Food> foods = CreateFood.createAllFoods("Food.txt");


        for (Food f : foods){
            listFood.getItems().add(f);
        }


        btnLoad.setDisable(true);


    }


    //when an object is selected in the listView and the delete button is pressed, the list is cleared, the item gets removed from the listView
    //and then the food.txt file is cleared, then gets rewritten without the removed item.
    public void deleteFood(ActionEvent actionEvent) throws IOException {
        Food temp;
        temp = (Food) listFood.getSelectionModel().getSelectedItem();

        ObservableList<Food> myList = listFood.getItems();

        for(Food f : myList){
            f.removeFromFile("Food.txt");
        }

        listFood.getItems().remove(temp);
        CreateFood.getFoods().remove(temp);

        for(Food f : myList){
            f.writeToFile("Food.txt");
        }

    }

}
