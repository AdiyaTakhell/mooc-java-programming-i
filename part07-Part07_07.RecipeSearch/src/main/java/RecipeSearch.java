import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String fileName = inputScanner.nextLine();

        List<Recipe> recipes = readRecipes(fileName);

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = inputScanner.nextLine();

            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = inputScanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(inputScanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = inputScanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        inputScanner.close();
    }

    private static List<Recipe> readRecipes(String fileName) {
        List<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                List<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return recipes;
    }
}
