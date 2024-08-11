public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Клиент 1
        int client_1_money = 1_000;
        int client_1_invoice = 1_000;

        // Клиент 2
        int client_2_money = 100;
        int client_2_invoice = 500;

        // Начисление бонуса
        int bonusMustNoLessThen = 1_000;
        int bonusForEvery = 100;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        // Клиент 1
        int client_1_bonus;
        if (client_1_invoice >= bonusMustNoLessThen) {
            client_1_bonus = client_1_invoice / bonusForEvery;
        } else {
            client_1_bonus = 0;
        }
        int client_1_calc = client_1_invoice + client_1_bonus;
        client_1_money += client_1_calc;

        // Клиент 2
        int client_2_bonus;
        if (client_2_invoice >= bonusMustNoLessThen) {
            client_2_bonus = client_2_invoice / bonusForEvery;
        } else {
            client_2_bonus = 0;
        }
        int client_2_calc = client_2_invoice + client_2_bonus;
        client_2_money += client_2_calc;

        System.out.println();
        System.out.println("Для первого клиента бонус составил:" + client_1_bonus + "рублей");
        System.out.println("Первому клиенту было зачислено:" + client_1_calc + "рублей");
        System.out.println("Теперь у первого клиента на счету:" + client_1_money + "рублей");

        System.out.println();
        System.out.println("Для второго клиента бонус составил:" + client_2_bonus + "рублей");
        System.out.println("Второму клиенту было зачислено:" + client_2_calc + "рублей");
        System.out.println("Теперь у второго клиента на счету:" + client_2_money + "рублей");

        System.out.println();
    }
}