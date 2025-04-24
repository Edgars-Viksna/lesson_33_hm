public class BankAccount {

    private Person owner;
    private String iban;
    private Double balance;

    public BankAccount(Person owner, String iban, Double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                " owner " + owner +
                ",   iban " + iban + '\'' +
                ",  balance " + balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    public Double getBalance() {
        return balance;
    }
}
