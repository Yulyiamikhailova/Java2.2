public class Main {
    public static void main(String[] args) {
        System.out.println("Мобильный кошелек");

        System.out.println("Пополнение от 07.05.2022 г.");

        int amount1 = 100;
        int add1 = 100;
        int total = amount1 + add1;
        int bonus1 = add1 / 100;
        if (add1 > 1000) {
            add1 = 1000;
        } else {
            bonus1 = 0;
        }

        System.out.println("Бонуc: " + bonus1);
        System.out.println("Итоговый счет: " + total + " рубль(ей)");


        System.out.println("Пополнение от 09.05.2022 г.");

        int amount2 = 100;
        int add2 = 1100;
        int total2 = amount2 + add2;
        int bonus2 = add2 / 100;
        if (add2 > 1000) {
            add2 = 1000;
        } else {
            bonus2 = 0;
        }

        System.out.println("Бонуc: " + bonus2);
        System.out.println("Итоговый счет: " + (total2 + bonus2) + " рубль(ей)");
    }
}