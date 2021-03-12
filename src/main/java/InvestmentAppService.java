public class InvestmentAppService {
    int calculate(float percent, int investSum) {
        int income = (int) (investSum * 100 * (percent / 100));
        return income / 100;
    }
}
