package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblUnknownNum;
    public Label lblGivenNum;
    public Button btnHigher;
    public Button btnLower;
    public Label gameResult;
    public Button btnNewGame;
    public Label lblPoints;


    public void createNewGame(MouseEvent mouseEvent) {
        int givenNum;
        givenNum = (int) (Math.random() * 100);
        lblGivenNum.setText(Integer.toString(givenNum));
        lblUnknownNum.setText("???");
        gameResult.setText("  ");
        btnLower.setDisable(false);
        btnHigher.setDisable(false);
        btnNewGame.setDisable(true);

    }


    public void selectHigher(MouseEvent mouseEvent) {
        int unknownNum;
        unknownNum = (int) (Math.random() * 100);
        lblUnknownNum.setText(Integer.toString(unknownNum));
        btnLower.setDisable(true);
        btnHigher.setDisable(true);
        btnNewGame.setDisable(false);


        if (unknownNum> Integer.parseInt(lblGivenNum.getText())){
            gameResult.setText("You Win!");
        }
        if (unknownNum < Integer.parseInt(lblGivenNum.getText())|| unknownNum == Integer.parseInt(lblGivenNum.getText())){
            gameResult.setText("You Lose!");
        }

    }


    public void selectLower(MouseEvent mouseEvent) {
        int unknownNum;
        unknownNum = (int) (Math.random() * 100);
        lblUnknownNum.setText(Integer.toString(unknownNum));
        btnLower.setDisable(true);
        btnHigher.setDisable(true);
        btnNewGame.setDisable(false);

        if (unknownNum < Integer.parseInt(lblGivenNum.getText())){
            gameResult.setText("You Win!");
        }

        if (unknownNum > Integer.parseInt(lblGivenNum.getText()) || unknownNum == Integer.parseInt(lblGivenNum.getText())){
            gameResult.setText("You Lose!");
        }

    }

}
