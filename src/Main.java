public class Main {
    public static void main(String[] args) {
        int start_balance = 300;
        int refill = 1200;
        int bonus;
        if (refill > 100) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total = start_balance + refill + bonus;
        System.out.println("Клиент пополнил баланс на сумму " + refill + " рублей - бонус составил " + bonus + " рублей, итоговая сумма на счету клиента - " + total + " рублей");

    }
}
