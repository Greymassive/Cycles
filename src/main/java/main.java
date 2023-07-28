import ru.netology.services.javacycles.services.CalcMoneyService;

public class main {
    public static void main(String[] args) {
        CalcMoneyService service = new CalcMoneyService();
        int count = service.calcMoney(10000, 3000, 20000);
        System.out.println(count);
    }
}


