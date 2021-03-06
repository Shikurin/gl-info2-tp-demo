package demo;

public class Money {

    int amount;
    String currency;

    // Constructeur
    public Money() {
        this.amount = 0;
        this.currency = "non renseigné";
    }

    // Constructeur avec paramètres
    public Money(int pAmount, String pCurrency) {
        this.amount = pAmount;
        this.currency = pCurrency;
    }


    public Money add(Money that) {
        return new Money(this.amount+that.amount,this.currency);
    }


    public String toString() {
        return "Le montant est de " + this.amount + " " + this.currency + ".";
    }

}
