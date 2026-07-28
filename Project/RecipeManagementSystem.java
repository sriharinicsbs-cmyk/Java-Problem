package service;

import model.Recipe;
import java.util.ArrayList;
import java.util.Arrays;

public class RecipeDatabase {

    public ArrayList<Recipe> getRecipes() {

        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe(
                "Egg Fried Rice",
                new ArrayList<>(Arrays.asList(
                        "rice",
                        "egg",
                        "onion",
                        "oil",
                        "salt"
                ))
        ));

        recipes.add(new Recipe(
                "Tomato Rice",
                new ArrayList<>(Arrays.asList(
                        "rice",
                        "tomato",
                        "onion",
                        "oil",
                        "salt"
                ))
        ));

        recipes.add(new Recipe(
                "Vegetable Fried Rice",
                new ArrayList<>(Arrays.asList(
                        "rice",
                        "carrot",
                        "beans",
                        "onion",
                        "oil",
                        "salt"
                ))
        ));

        recipes.add(new Recipe(
                "Omelette",
                new ArrayList<>(Arrays.asList(
                        "egg",
                        "oil",
                        "salt"
                ))
        ));

        recipes.add(new Recipe(
                "Maggi",
                new ArrayList<>(Arrays.asList(
                        "maggi",
                        "water",
                        "masala"
                ))
        ));

        return recipes;
    }
}