public class Main {
    public static void main(String[] args) {
        System.out.println("Мобильный кошелек");

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
