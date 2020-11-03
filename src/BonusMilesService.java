public class BonusMilesService {
    public int calculate(int cost) {
        int summa_one_mile = 20;
        int amount_mile = (int) (cost / summa_one_mile);
        return amount_mile;
    }
}
