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
        char a = (36);

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
        short oneMilliliterOfMilkInGrams = 105 / 100;
        byte numberOfIceCream = 2;
        byte weightOfIceCream = 100;
        byte numberOfEggs = 4;
        byte weightOfEggs = 70;
        float weightOfAllIngredientsInGrams = numberOfBananas * weightOfOneBanana + milkWeightInMilliliters * oneMilliliterOfMilkInGrams + numberOfIceCream * weightOfIceCream + numberOfEggs * weightOfEggs;
        float weightOfAllIngredientsInKilograms = weightOfAllIngredientsInGrams / 1000;
        System.out.println("Общий вес ингридиентов в кг " + weightOfAllIngredientsInKilograms);

        // Задание 4
        short overweightInKg = 7 * 1000;
        short minimalWeightLossInGramsOfDay = 250;
        short maxWeightLossInGramsOfDay = 500;
        int maxDayToWeightLoss = overweightInKg / minimalWeightLossInGramsOfDay;
        System.out.println("Максимальное количество дней " + maxDayToWeightLoss);
        int minDayToWeightLoss = overweightInKg / maxWeightLossInGramsOfDay;
        System.out.println("Минимальное количество дней " + minDayToWeightLoss);
        int daysOnAverage = (minDayToWeightLoss + maxDayToWeightLoss) /2;
        System.out.println("дней в среднем " +daysOnAverage);

        // Задание 5
    int mashaMonthlySalary = 67760;
    int denisMonthlySalary = 83690;
    int kristinaMonthlySalary = 76230;
    int masha10OfSalary = mashaMonthlySalary / 100 * 10;
    int denis10OfSalary = denisMonthlySalary / 100 * 10;
    int kristina10OfSalary = kristinaMonthlySalary / 100 *10;
    int mashaNewSalary =mashaMonthlySalary + masha10OfSalary;
    int denisNewSalary = denisMonthlySalary + denis10OfSalary;
    int kristinaNewSalary = kristinaMonthlySalary + kristina10OfSalary;
    int mashaDifferenceInSalaryForYear = (mashaNewSalary * 12) - ( mashaMonthlySalary * 12);
    int denisDifferenceInSalaryForYear = (denisNewSalary * 12) - ( denisMonthlySalary * 12);
    int kristinaDifferenceInSalaryForYear =(kristinaNewSalary * 12) - ( kristinaMonthlySalary * 12);
    System.out.println("Теперь Маша получает " +mashaNewSalary + " рублей. Годовой доход вырос на  "+mashaDifferenceInSalaryForYear +" рублей.");
    System.out.println("Теперь Денис получает " +denisNewSalary + " рублей. Годовой доход вырос на  "+denisDifferenceInSalaryForYear + " рублей." );
    System.out.println("Теперь Кристина получает " +kristinaNewSalary + " рублей. Годовой доход вырос на "+kristinaDifferenceInSalaryForYear + " рублей.");}}