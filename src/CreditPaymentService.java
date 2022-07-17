public class CreditPaymentService {

    //creditTotal - сумма кредита
    public double calculate(double creditTotal, int years) {

        double creditPercent = 9.99; // фиксированная процентная ставка
        double monthPercent = creditPercent / 100 / 12; //из процента превращаем в число + делим на число месяцев

        int minCredit = 100_000; //кредит не меньше 100 000
        int maxCredit = 5_000_000; //кредит не больше 100 000
        int minYears = 1; //минимальный срок кредита 1 год
        int middleYears = 2; //вариант срока кредита 2 года
        int maxYears = 3; //минимальный срок кредита 3 года
        int monthsLast = years * 12; //месяцев кредита осталось

        int result; //сумма ежемесячного платежа

        if (creditTotal >= minCredit && creditTotal <= maxCredit) {
            boolean creditRight = true;
        } else {
            result = 0;
        }
        if (years == minYears || years == middleYears || years == maxYears) {
            result = (int) (creditTotal * (monthPercent / (1 - Math.pow(1 + monthPercent, -monthsLast))));
        } else {
            result = 0;
        }
        return result;
    }
}

