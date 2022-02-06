public class BonusServices {
    public int calculate(boolean registered, int amount) {
        // Входные данные

        int saveBonus = 20;

        // Логика
        int percent = registered ? 1 : 0;
        int bonus = amount / saveBonus * percent;
        if (amount < 20) {
            amount = 0;
        }
        return bonus;
    }
}
