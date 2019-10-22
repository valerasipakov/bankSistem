package com.javastat;
import  java.util.Scanner;
public class OperasionLogic {



    public String payment(Account account1, Account account2, int sum) {
        Scanner in = new
                Scanner(System.in);

        if (account1.bill.Money >= sum) {

            account1.bill.Money =account1.bill.Money - sum;
            account2.bill.Money = account2.bill.Money + sum;

            System.out.println(account1.bill.Money);
            System.out.println(account2.bill.Money);

            String a = ("Пользователь " + account1.persone.name +" перевел со счета " + account1.bill.BillNomber +" сумму "+ sum + " пользователю " + account2.persone.name +" на счет " + account2.bill.BillNomber+".");
            account1.bill.LastOperashion = (a);
            System.out.println(bill1.Money);
            System.out.println(account1.bill.LastOperashion);


        } else {
            System.out.println("Недостаточно средств");

        }

        return null;
    }

}


