package com.punto_rojo.nosavvy.ubereats.repositories;

import com.punto_rojo.nosavvy.ubereats.models.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nosavvy on 3/27/18.
 */

public class FoodRepository {
    private static List<Food> food = new ArrayList<>();
//(int id, String name, String time, String picture)
    static{
        food.add(new Food(1,"Pan con Chicharrón","10-15 MIN","chicharron"));
        food.add(new Food(2,"Butifarra","10-15 MIN","butifarra"));
        food.add(new Food(3,"Papa con huevo","10-15 MIN","papa"));
        food.add(new Food(4,"Pan con pollo","10-15 MIN","pollo"));
    food.add(new Food(5,"Pan con Chicharrón","10-15 MIN","chicharron"));
    food.add(new Food(6,"Butifarra","10-15 MIN","butifarra"));
    food.add(new Food(7,"Papa con huevo","10-15 MIN","papa"));
    food.add(new Food(8,"Pan con pollo","10-15 MIN","pollo"));
    }

    public static List<Food> getList(){
        return food;
    }
}
