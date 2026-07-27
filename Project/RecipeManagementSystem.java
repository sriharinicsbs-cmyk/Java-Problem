import java.util.ArrayList;
import java.util.Scanner;

class Recipe {
    String name;
    String ingredients;

    Recipe(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
}

public class RecipeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Recipe Management System =====");
            System.out.println("1. Add Recipe");
            System.out.println("2. View Recipes");
            System.out.println("3. Search Recipe");
            System.out.println("4. Delete Recipe");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Recipe Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Ingredients: ");
                    String ingredients = sc.nextLine();

                    recipes.add(new Recipe(name, ingredients));
                    System.out.println("Recipe Added Successfully!");
                    break;

                case 2:
                    if (recipes.isEmpty()) {
                        System.out.println("No Recipes Available.");
                    } else {
                        for (Recipe r : recipes) {
                            System.out.println("----------------------");
                            System.out.println("Recipe Name : " + r.name);
                            System.out.println("Ingredients : " + r.ingredients);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Recipe Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (Recipe r : recipes) {
                        if (r.name.equalsIgnoreCase(search)) {
                            System.out.println("Recipe Found");
                            System.out.println("Name : " + r.name);
                            System.out.println("Ingredients : " + r.ingredients);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Recipe Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Recipe Name to Delete: ");
                    String delete = sc.nextLine();

                    boolean deleted = false;

                    for (int i = 0; i < recipes.size(); i++) {
                        if (recipes.get(i).name.equalsIgnoreCase(delete)) {
                            recipes.remove(i);
                            System.out.println("Recipe Deleted Successfully!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Recipe Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
