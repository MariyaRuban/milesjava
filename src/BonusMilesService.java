public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int bonusmili = price / bonus;
        return bonusmili;
    }
}
