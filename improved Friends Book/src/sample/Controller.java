package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField textGetName;
    public TextField textGetPronouns;
    public ListView friendList;
    public Button btnSaveCloseFriend;
    public Button btnLoadCLoseFriend;
    public Button btnAddFriend;
    public Button btnSaveToFamilyFriend;
    public Button btnLoadFamilyFriend;
    public Button btnSaveToSchoolFriends;
    public Button btnLoadSchoolFriend;
    public Button btnLoadAllFriends;


    public void addFriend(ActionEvent actionEvent) throws IOException {

        friendList.getItems().clear();
        String name = textGetName.getText();
        String pronouns = textGetPronouns.getText();
        Friend temp = new Friend(name, pronouns);

        if(textGetName.getText().length() > 0 && textGetPronouns.getText().length() > 0){
            friendList.getItems().add(temp);
        }

        textGetName.clear();
        textGetPronouns.clear();



        ObservableList<Friend> myList = friendList.getItems();

        for(Friend f : myList){
            f.writeToFile("AllFriends.txt");
        }
        friendList.getItems().clear();



        btnSaveToSchoolFriends.setDisable(false);
        btnSaveToFamilyFriend.setDisable(false);
        btnSaveCloseFriend.setDisable(false);
        
    }



    //improving the friends book
    //SAVE BUTTONS:
    //writes the displayed friends into the close friends txt file and the ALL FRIENDS TXT FILE
    public void saveFriendToCloseFriends(ActionEvent actionEvent)throws IOException{
        ObservableList<Friend> myList = friendList.getSelectionModel().getSelectedItems();


        for(Friend f : myList){
            if(!myList.contains(f)){
                f.writeToFile("AllFriends.txt");
            }
        }

        for(Friend f : myList){
            if(myList.contains(f)){
                f.writeToFile("CloseFriends.txt");
            }
        }
        friendList.getItems().clear();


    }


    //writes the displayed friends into the family friends txt file and the ALL FRIENDS TXT FILE
    public void saveFriendToFamilyFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getSelectionModel().getSelectedItems();


        for(Friend f : myList){
            if(!myList.contains(f)){
                f.writeToFile("AllFriends.txt");
            }
        }

        for(Friend f : myList){
            if(myList.contains(f)){
                f.writeToFile("FamilyFriend.txt");
            }
        }
        friendList.getItems().clear();

    }


    //writes the displayed friends into the school friends txt file and the ALL FRIENDS TXT FILE
    public void saveFriendToSchoolFriends(ActionEvent actionEvent) throws IOException{
        ObservableList<Friend> myList = friendList.getSelectionModel().getSelectedItems();


        for(Friend f : myList){
            if(!myList.contains(f)){
                f.writeToFile("AllFriends.txt");
            }
        }

        for(Friend f : myList){
            if(myList.contains(f)){
                f.writeToFile("SchoolFriend.txt");
            }
        }
        friendList.getItems().clear();


    }



    //LOAD BUTTONS:
    public void loadCloseFriend(ActionEvent actionEvent)throws IOException{

        friendList.getItems().clear();
        CreateFriend.getFriends().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("CloseFriends.txt");

        for (Friend f : friends){
            friendList.getItems().add(f);
        }

    }


    public void loadFamilyFriend(ActionEvent actionEvent) throws IOException {

        friendList.getItems().clear();
        CreateFriend.getFriends().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("FamilyFriend.txt");

        for (Friend f : friends){
            friendList.getItems().add(f);
        }
    }


    public void loadSchoolFriend(ActionEvent actionEvent) throws IOException{

        friendList.getItems().clear();
        CreateFriend.getFriends().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("SchoolFriend.txt");

        for (Friend f : friends){
            friendList.getItems().add(f);
        }
    }


    public void loadAllFriends(ActionEvent actionEvent) throws IOException {

        friendList.getItems().clear();
        CreateFriend.getFriends().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("AllFriends.txt");

        for (Friend f : friends){
            friendList.getItems().add(f);
        }


        btnSaveToSchoolFriends.setDisable(false);
        btnSaveToFamilyFriend.setDisable(false);
        btnSaveCloseFriend.setDisable(false);



    }


}
