package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetPronouns;
    public ListView<Friends> friendList = new ListView<>();
    public Label lblName;
    public Label lblAge;
    public Label lblPronouns;
    public Button btnDelete;

    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int age = Integer.parseInt(textGetAge.getText());
        String pronoun = textGetPronouns.getText();
        Friends temp = new Friends(name, age, pronoun);
        friendList.getItems().add(temp);
        textGetName.clear();
        textGetAge.clear();
        textGetPronouns.clear();
        btnDelete.setDisable(true);
    }


    public void displayFriend(MouseEvent mouseEvent) {
        Friends temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(temp.name);
        lblAge.setText(Integer.toString(temp.getAge()));
        lblPronouns.setText(temp.getPronouns());
        btnDelete.setDisable(false);
    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friends temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        lblPronouns.setText(" ");
        lblAge.setText(" ");
        lblName.setText(" ");
    }
}
