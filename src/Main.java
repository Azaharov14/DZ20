public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        double total = 0;
        int deposite = 15000;
        double percentPerMounth = 1.01;
        int month = 1;

        while (total < 2_459_000) {
            total = (total + deposite) * percentPerMounth;
            System.out.printf("«Месяц %s , сумма накоплений равна %.2f рублей»%n", month, total);
            month++;
        }
        System.out.println();


        System.out.println("Task 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }


        System.out.println("Task 3");
        int birthRate;
        int deathRate;
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population += birthRate - deathRate;
            System.out.printf("Год %s,численность населения состовляет %s%n", year, population);
        }


        System.out.println("Task 4");
        double vasyaPercent = 1.07;
        double vasyaDeposite = 15000;
        int vasyaMounth = 1;
        while (vasyaDeposite < 12_000_000) {
            vasyaDeposite *= vasyaPercent;
            System.out.printf("Month: %s, deposite: %.2f%n", vasyaMounth, vasyaDeposite);
            vasyaMounth++;
        }

        System.out.println("Task 5");
        double vasyaPercent1 = 1.07;
        double vasyaDeposite1 = 15000;
        int vasyaMounth1 = 1;
        while (vasyaDeposite1 < 12_000_000) {
            vasyaDeposite1 *= vasyaPercent1;
            if (vasyaMounth1 % 6 == 0) {
                System.out.printf("Month: %s, deposite: %.2f%n", vasyaMounth1, vasyaDeposite1);
            }
            vasyaMounth1++;
        }

        System.out.println("Task 6");
        vasyaPercent = 1.07;
        vasyaDeposite = 15000;
        int target = 9 * 12;
        for (int i = 1; i < target; i++) {
            vasyaDeposite *= vasyaPercent;
            if (i % 6 == 0) {
                System.out.printf("Month: %s, deposite: %.2f%n", i, vasyaDeposite);
            }
        }

        System.out.println("Task 7");
        int firstFriday = 2;
        for (int i = firstFriday; i < 31; i += 7) {
            System.out.printf("«Сегодня пятница, %s-е число. Необходимо подготовить отчет»%n", i);
        }

        System.out.println("Task 8");
        int period = 79;
        int currentYear = 2024;
        int lowerBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        int iterAmount = 0;
        for (int i = 0; i < upperBorder; i += period, iterAmount++) {
            if (i > lowerBorder) {
                System.out.println(i);
            }
        }
        System.out.println("iter amount: " + iterAmount);
    }
}