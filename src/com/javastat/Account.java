package com.javastat;

public class Account {
    public String AccountLogin;

    public String getAccountLogin() {
        return AccountLogin;

    }

    public void setAccountLogin(String accountLogin) {
        AccountLogin = accountLogin;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String Password;
    public Persone persone;

    public Persone getPersone() {
        return persone;
    }

    public void setPersone(Persone persone) {
        this.persone = persone;
    }
    public   Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
