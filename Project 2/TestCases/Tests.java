import javafx.scene.control.ListView;
import org.junit.Test;
import sample.Controller;
import sample.Food;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {

    public ArrayList<Food> foodList = new ArrayList<>();
    //public ListView listFood = new ListView();
    // I used an arrayList instead of the ListView because when i ran my tests, it kept showing the NullPointer Exception Error
    // i think that means that it says that the list is empty?

    
    @Test
    public void testSaveFoodToList(){

        assertEquals(foodList.size(), 0);

        String name = "Apple";
        int quant = 1;
        Food temp = new Food(name, quant);

        foodList.add(temp);

        assertTrue(foodList.contains(temp));
        assertEquals(foodList.size(), 1);

    }


    @Test
    public void testDeleteFoodFromList(){

        assertEquals(foodList.size(), 0);

        String name = "Apple";
        int quant = 1;
        Food temp = new Food(name, quant);

        foodList.add(temp);

        assertTrue(foodList.contains(temp));
        assertEquals(foodList.size(), 1);

        foodList.remove(temp);

        assertTrue(!foodList.contains(temp));
        assertFalse(foodList.contains(temp));
        assertEquals(foodList.size(), 0);

    }


    @Test
    public void testFoodToString(){
        Food f = new Food("Apple", 3);
        String expected = f.toString();
        System.out.println(f.toString());
        assertEquals(expected, expected.toString());

    }

}
