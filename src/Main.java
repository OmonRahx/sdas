public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int income = 1400;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }
        int totalbalance = income + balance + bonus;

        System.out.println("На счету: " + totalbalance + " руб." + " с учетом бонусов " + bonus + " руб.");

    }
}