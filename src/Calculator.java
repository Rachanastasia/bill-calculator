public class Calculator {
    public static void main(String[] args){
        System.out.println("The Bill Calculator");
        int numberOfPersons = 4;

        double taxPercent = 8;
        double taxAmount = taxPercent / 100;
        double tipPercent = 20;

        double personOneAppetizerCost = 9.99;
        double personOneMainCost = 23.99;
        double personOneDessertCost = 10.29;
        double personOneDrinkCost = 8.50;

        double personOneSubTotal = personOneAppetizerCost + personOneMainCost
                + personOneDessertCost + personOneDrinkCost;
        double personOneTax = taxAmount * personOneSubTotal;

        double personTwoAppetizerCost = 12.99;
        double personTwoMainCost = 18.99;
        double personTwoDessertCost = 9.99;
        double personTwoDrinkCost = 4.25;

        double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost
                + personTwoDessertCost + personTwoDrinkCost;
        double personTwoTax = taxAmount * personTwoSubTotal;

        double personThreeAppetizerCost = 10.49;
        double personThreeMainCost = 26.79;
        double personThreeDessertCost = 10.29;
        double personThreeDrinkCost = 3.75;

        double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost
                + personThreeDessertCost + personThreeDrinkCost;
        double personThreeTax = taxAmount * personThreeSubTotal;

        double personFourAppetizerCost = 13.79;
        double personFourMainCost = 25.99;
        double personFourDessertCost = 4.49;
        double personFourDrinkCost = 7.50;

        double personFourSubTotal = personFourAppetizerCost + personFourMainCost
                + personFourDessertCost + personFourDrinkCost;
        double personFourTax = taxAmount * personFourSubTotal;

        String personOneName = "Adeline";
        String personOneAppetizer = "Stuffed Ziti Fritta";
        String personOneMain = "Shrimp Scampi";
        String personOneDessert = "Sicilian Cheesecake";
        String personOneDrink = "Raspberry Lemonade x 2";

        String personTwoName = "Brixton";
        String personTwoAppetizer = "Lasagna Fritta";
        String personTwoMain = "Fettuccine Alfredo";
        String personTwoDessert = "Lemon Cream cake";
        String personTwoDrink = "Mango-Strawberry Iced Tea";

        String personThreeName = "Cora";
        String personThreeAppetizer = "Fried Mozzarella";
        String personThreeMain = "Tour of Italy";
        String personThreeDessert = "Zeppoli";
        String personThreeDrink = "Fresh Brewed Iced Tea";

        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke x 2";

        double mealSubTotal = personOneSubTotal + personFourSubTotal
                + personTwoSubTotal + personThreeSubTotal;
        double mealTax = mealSubTotal * taxAmount;
        double mealTip = (tipPercent / 100) * mealSubTotal;

        double mealTotal = mealSubTotal + mealTax + mealTip;

        double evenCostPerPerson = mealTotal / numberOfPersons;

        double personOneTip = (tipPercent / 100) * personOneSubTotal;
        double personOneTotal = personOneSubTotal + personOneTip + personOneTax;

        boolean serviceWasGood = true;
        boolean splitBillEvenly = true;


        System.out.printf("Total cost of meal: $%.2f\n", mealTotal);
        System.out.printf("Amount each person pays if split evenly: $%.2f\n", evenCostPerPerson);
        System.out.printf("If not split evenly:");
        System.out.println(personOneName);
        System.out.println(personOneTotal);
        System.out.println(personTwoName);
        System.out.println(personThreeName);
        System.out.println(personFourName);
    }

}
