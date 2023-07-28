package ru.netology.services.javacycles.services;
public class CalcMoneyService {
    public int calcMoney(int income, int expences, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expences) / 3;
            } else {
                money = money + income - expences;
            }

        }
        return count;
    }
}


