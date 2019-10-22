package com.javastat;
import com.sun.org.apache.xpath.internal.operations.Bool;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        Bill bill1 = new Bill();
        bill1.BillNomber=1;
        bill1.Money=1000;

        Bill bill2 = new Bill();
        bill2.BillNomber=2;
        bill2.Money=1000;

        Persone persone1 = new Persone();
        persone1.setName("Захар");

        Persone persone2 = new Persone();
        persone2.setName("Максим");

        Account account1 = new Account();
        account1.setBill(bill1);
        account1.setPersone(persone1);

        Account account2 = new Account();
        account2.setBill(bill2);
        account2.setPersone(persone2);


        OperasionLogic payment = new OperasionLogic();
        payment.payment(account1, account2, 500);
       


    }
}
