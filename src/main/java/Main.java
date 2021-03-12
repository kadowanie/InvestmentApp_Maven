public class Main {
    public static void main(String[] args) {
        InvestmentAppService service = new InvestmentAppService();
        float percent = 3;
        int investSum = 1000;
        int income = service.calculate(percent, investSum);
        System.out.println(income);
    }
}
