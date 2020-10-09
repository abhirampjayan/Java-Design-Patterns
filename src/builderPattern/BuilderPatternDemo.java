package builderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBulder mealBulder=new MealBulder();

        Meal vegMeal=mealBulder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        Meal nonVegMeal = mealBulder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
