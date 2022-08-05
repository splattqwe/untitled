public class Main {
    public static void main(String[] args) {
        // ЗАдание 1
        byte z = 1;
        short x = 1000;
        int c = 100000;
        long v = 100000000l;
        double b = 3.14;
        float n = 3.1415f;
        boolean m = x > 2000;
        char a =(36);

        // Задание 2
double boxer1 = 78.2;
double boxer2 = 82.7;
double weightOfAll = boxer1 + boxer2;
double weightDifference = boxer2 - boxer1;
System.out.println("Разница в весе " + weightDifference);
System.out.println("Общий вес " + weightOfAll);

        // Задание 3
    byte numberOfBananas = 5;
    short weightOfOneBanana = 80;
    short milkWeightInMilliliters = 200;
    short oneMilliliterOfMilkInGrams = 105/100;
    byte numberOfIceCream = 2;
    byte weightOfIceCream = 100;
    byte numberOfEggs = 4;
    byte weightOfEggs = 70;
    float weightOfAllIngredientsInGrams = numberOfBananas * weightOfOneBanana + milkWeightInMilliliters *oneMilliliterOfMilkInGrams + numberOfIceCream * weightOfIceCream +numberOfEggs * weightOfEggs;
   float weightOfAllIngredientsInKilograms = weightOfAllIngredientsInGrams / 1000;
   System.out.println("Общий вес ингридиентов в кг " +weightOfAllIngredientsInKilograms);}}