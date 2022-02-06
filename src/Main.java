public class Main {

    public static void main(String[] args) {

        BonusServices services = new BonusServices();

        //Тест-кейс 1
        int bonusBelowLimitForRegistered = services.calculate(true, 25);
        System.out.println("Ваш Бонус составляет " + bonusBelowLimitForRegistered + " рублей");
        //Тест-кейс 2
        int bonusLowLimitForRegistered = services.calculate(true, 15);
        System.out.println("Ваш Бонус составляет " + bonusLowLimitForRegistered + " рублей");
        //Тест-кейс 3
        int bonusBelowLimitForUnregistered = services.calculate(false, 25);
        System.out.println("Ваш Бонус составляет " + bonusBelowLimitForUnregistered + " рублей");
        //Тест-кейс 4
        int BonusintegerRegistered = services.calculate(true, 1255);
        System.out.println("Ваш Бонус составляет " + BonusintegerRegistered + " рублей");

    }
}
