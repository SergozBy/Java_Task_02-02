public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int clientMoney = 1_000;
        int clientInvoice = 1_000;

        // Начисление бонуса
        int bonusMustNoLessThen = 1_000;
        int bonusForEvery = 100;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int clientBonus;
        if (clientInvoice >= bonusMustNoLessThen) {
            clientBonus = clientInvoice / bonusForEvery;
        } else {
            clientBonus = 0;
        }
        int clientCalc = clientInvoice + clientBonus;
        clientMoney += clientCalc;

        System.out.println();
        System.out.println("Бонус составил:" + clientBonus + "рублей");
        System.out.println("К зачислению:" + clientCalc + "рублей");
        System.out.println("Теперь у клиента на счету:" + clientMoney + "рублей");
        System.out.println();
    }
}