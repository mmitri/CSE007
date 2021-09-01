// Mark Mitri
// CSE 002
// Homework 2
// 2/1/2020

public class RestaurantTip{
    public static void main(String[] args){

        // Number of dinners ordered
        //int numDinners = 3;
        // Cost per dinner
        double dinnerPrice1 = 34.98;
        double dinnerPrice2 = 29.99;
        double dinnerPrice3 = 15.98;

        double totalDinnerPrice = (dinnerPrice1 + dinnerPrice2 + dinnerPrice3);

        // Number of drinks ordered
        //int numDrinks = 2;
        // Cost per drink
        double drinkPrice1 = 2.99;
        double drinkPrice2 = 1.99;

        double totalDrinkPrice = (drinkPrice1 + drinkPrice2);

        // Number of dessers ordered
        int numDesserts = 3;
        // Cost per dessert
        double dessertPrice = 2.99; // Flat rate for all desserts

        double totalDessertPrice = (dessertPrice * numDesserts);

        // The tip rate
        double stdTip = 0.20;

        // Calculations
        double totalMealPrice = (totalDinnerPrice + totalDrinkPrice + totalDessertPrice);
        double tipForMeal = (totalMealPrice * stdTip);
        double finalCost = (totalMealPrice + tipForMeal);

        // Print the bill
        System.out.printf("Meal 1 Cost: $" + "%2.2f%n", dinnerPrice1);
        System.out.printf("Meal 2 Cost: $" + "%2.2f%n", dinnerPrice2);
        System.out.printf("Meal 3 Cost: $" + "%2.2f%n", dinnerPrice3);
        System.out.printf("Drink 1 Cost: $" + "%2.2f%n", drinkPrice1);
        System.out.printf("Drink 2 Cost: $" + "%2.2f%n", drinkPrice2);
        System.out.printf("3 Orders of desserts costs: $" + "%2.2f per dessert.%n", dessertPrice);
        System.out.printf("The total cost of the dinner is: $" + "%2.2f%n", totalMealPrice);
        System.out.println("20% Tip: $" + tipForMeal);
        System.out.printf("Final Cost: $" + "%2.2f%n", finalCost);
    }
}