import org.junit.Before;
import org.junit.Test;
import sample.Food;

import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {

    ListView listFood;
    public TextField txtGetName;
    public TextField txtGetQuantity;

    @Test
    public void testSaveFoodToList(){

        assertEquals(listFood.getItems().size(), 0);

        String name = txtGetName.getText();
        int quant = Integer.parseInt(txtGetQuantity.getText());
        Food temp = new Food(name, quant);
        listFood.getItems().add(temp);

        assertTrue(listFood.getItems().contains(temp));
        assertEquals(listFood.getItems().size(), 1);



    }


    @Test
    public void testLoadFoodList(){


    }



    @Test
    public void testDeleteFoodFromList(){


    }



}

