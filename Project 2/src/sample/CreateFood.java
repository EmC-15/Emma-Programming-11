package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFood {
    private static String name;
    private static int quantity;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Food> foods = new ArrayList<>();



    public static ArrayList createAllFoods(String fileName) throws IOException {


        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String foodString = "";

        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                foodString += line;

            }else{
                parseFood(foodString);
                foodString = "";
            }
        }
        return foods;
    }



    private static void parseFood(String string) throws IOException {
        int pos = 0;
        String name = "";
        int quantity = 0;

        for(int i = 0; i<string.length(); i++){
            if(string.substring(i, i+1).equals(",")){
                pos = i;
                name = string.substring(0, pos);
                quantity = Integer.parseInt(string.substring(pos + 1));
            }
        }

        Food temp = new Food(name, quantity);
        foods.add(temp);
        Food.removeDuplicates(foods);

    }

    public static ArrayList<Food> getFoods() {
        return foods;
    }
}