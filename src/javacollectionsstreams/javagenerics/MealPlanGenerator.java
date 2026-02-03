package javacollectionsstreams.javagenerics;

// MealPlan interface
interface MealPlan {
    String getType();
}

// Meal types
class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan Meal";
    }
}

// Generic utility
class MealService {
    static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getType());
    }
}

// Main class
public class MealPlanGenerator {
    public static void main(String[] args) {

        VeganMeal meal = new VeganMeal();
        MealService.generateMeal(meal);
    }
}
