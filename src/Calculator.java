public  class Calculator {
    public static void main(String[] args) {
        System.out.println("Rachel's Bill Calculator");
        System.out.println("-------------------\n");

        Calculator calculator = new Calculator();
        int numberOfPersons = 4;

        double taxPercent = 8.5;
        double tipPercent = 22;

        double[] personOneMealCost = {9.99, 23.99, 10.29, 8.50, 0, 0};
        double[] personTwoMealCost = {12.99, 18.99, 9.99, 4.25, 0, 0};
        double[] personThreeMealCost = {10.49, 26.79, 10.29, 3.75, 0, 0};
        double[] personFourMealCost = {13.79, 25.99, 4.49, 7.50, 0, 0};

        String[] personOneMealItems = {"Adeline", "Stuffed Ziti Frittata", "Shrimp Scampi", "Cheesecake", "Lemonade"};
        String[] personTwoMealItems = {"Brixton", "Lasagna", "Fettuiccine Alfredo", "Lemon Cream cake", "Iced Tea"};
        String[] personThreeMealItems = {"Cora", "Fried Mozzerella", "Tour of Italy", "Zeppoli", "Iced Tea"};
        String[] personFourMealItems = {"Dean", "Classic Shrimp Scampi", "Seafood Alfredo", "Solcini", "Coke"};


        boolean splitBillEvenly = false;

        double personOneSubTotal = calculator.calculateMealCost(personOneMealCost);
        double personTwoSubTotal = calculator.calculateMealCost(personTwoMealCost);
        double personThreeSubTotal = calculator.calculateMealCost(personThreeMealCost);
        double personFourSubTotal = calculator.calculateMealCost(personFourMealCost);


        double personOneTax = calculator.calculateTax(taxPercent, personOneSubTotal);
        double personTwoTax = calculator.calculateTax(taxPercent, personTwoSubTotal);
        double personThreeTax = calculator.calculateTax(taxPercent, personThreeSubTotal);
        double personFourTax = calculator.calculateTax(taxPercent, personFourSubTotal);

        personOneMealCost[4] = personOneTax;
        personTwoMealCost[4] = personTwoTax;
        personThreeMealCost[4] = personThreeTax;
        personFourMealCost[4] = personFourTax;

        double mealSubTotal = personOneSubTotal + personTwoSubTotal
                + personThreeSubTotal + personFourSubTotal;

        double mealTax = calculator.calculateTax(taxPercent, mealSubTotal);;
        double mealTip = calculator.calculateTip(mealSubTotal, tipPercent);
        double personOneTip = calculator.calculateTip(personOneSubTotal, tipPercent);
        double personTwoTip = calculator.calculateTip(personTwoSubTotal, tipPercent);
        double personThreeTip =  calculator.calculateTip(personThreeSubTotal, tipPercent);
        double personFourTip = calculator.calculateTip(personFourSubTotal, tipPercent);

        personOneMealCost[5] = personOneTip;
        personTwoMealCost[5] = personTwoTip;
        personThreeMealCost[5] = personThreeTip;
        personFourMealCost[5] = personFourTip;


        double mealTotal =  mealSubTotal + mealTax + mealTip;
        double personOneTotal = personOneSubTotal + personOneTip + personOneTax;
        double personTwoTotal = personTwoSubTotal + personTwoTip + personTwoTax;
        double personThreeTotal = personThreeSubTotal + personThreeTip + personThreeTax;
        double personFourTotal = personFourSubTotal + personFourTip + personFourTax;

        double evenCostPerPerson = mealTotal / numberOfPersons;


        calculator.printMealData(personOneMealCost, personOneMealItems);
        calculator.printMealData(personTwoMealCost, personTwoMealItems);
        calculator.printMealData(personThreeMealCost, personThreeMealItems);
        calculator.printMealData(personFourMealCost, personFourMealItems);

        double diffPersonOne = Math.abs(personOneTotal - evenCostPerPerson);
        double diffPersonTwo = Math.abs(personTwoTotal - evenCostPerPerson);
        double diffPersonThree = Math.abs(personThreeTotal - evenCostPerPerson);
        double diffPersonFour = Math.abs(personFourTotal - evenCostPerPerson);

        splitBillEvenly = (diffPersonOne < 5) && (diffPersonTwo < 5)
                && (diffPersonThree < 5) && (diffPersonFour < 5);

        if(splitBillEvenly) {
            System.out.println("The bill should be split evenly!");
        } else {
            System.out.println("Each person should pay for their own meal.");
        }

    }
    public double calculateTip(double mealCost, double tipPercent){
        double cost = (tipPercent / 100) * mealCost;
        return cost;
    }
    public double calculateMealCost(double[] mealCost){
        double cost = mealCost[0] + mealCost[1] + mealCost[2] + mealCost[3];
        return cost;
    }
    public double calculateTax(double taxPercent, double mealTotal){
        double taxAmount = taxPercent / 100;
        double tax = taxAmount * mealTotal;
        return tax;
    }
    public void printMealData(double[] mealCost, String[] mealInfo){
        double total = 0;
        for(double i : mealCost){
            total = total + i;
        }
        System.out.printf("%s's Meal\n", mealInfo[0]);
        System.out.printf("%s\t\t$%.2f\n", mealInfo[1], mealCost[0]);
        System.out.printf("%s\t\t$%.2f\n", mealInfo[2], mealCost[1]);
        System.out.printf("%s\t\t$%.2f\n", mealInfo[3], mealCost[2]);
        System.out.printf("%s\t\t$%.2f\n", mealInfo[4], mealCost[3]);
        System.out.printf("Tax\t\t$%.2f\n",mealCost[4]);
        System.out.printf("Tip\t\t$%.2f\n",mealCost[5]);
        System.out.printf("%s's meal costs: $%.2f\n\n",mealInfo[0], total);
    }
}