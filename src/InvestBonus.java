public class InvestBonus extends CalcInvest{
    double bonus = 1.1;

    InvestBonus(int time, int percent, int sum) {
        super(time, percent, sum);
    }

    void addBonus() {
        double total = calcIncome() * bonus;
        System.out.println("З бонусом ви отримали - " + total);
    }
}
