import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount(new Person("Alanos", "Bergos", "alanos.bergos@gmail.com"),
                "DE111222333", 1000.00));
        bankAccounts.add(new BankAccount(new Person("Barbyy", "Cimmer", "barbyy.cimmer@gmail.com"),
                "DE222333444", 2000.00));
        bankAccounts.add(new BankAccount(new Person("Celine", "Dionis", "celine.dionis@gmail.com"),
                "DE333444555", 700000.00));
        bankAccounts.add(new BankAccount(new Person("Dirkos", "Einzel", "dirkos.einzel@gmail.com"),
                "DE444555666", 3000.00));

        bankAccounts.forEach(bankAccount -> {
            System.out.println(bankAccount);
        });

        System.out.println("--------- Experiments ---------------");

        List<String> emails = transform(bankAccounts, bankAccount -> bankAccount.getOwner().getEmail());
        emails.forEach(email -> System.out.println(email));

        List<Person> owners = transform(bankAccounts, bankAccount -> bankAccount.getOwner());
        owners.forEach(owner -> System.out.println(owner));

        List<String> custom = transform(bankAccounts, bankAccount ->
                bankAccount.getOwner().getlName()
                        + " "
                        + bankAccount.getOwner().getfName().substring(0, 1)
                        + ". ; IBAN: "
                        + bankAccount.getIban()
                        + " ; "
                        + bankAccount.getOwner().getEmail()
        );
        custom.forEach(c -> System.out.println(c));


    }

    //------------------------ Methods ---------------------------

    public static <R, T> List<R> transform(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }

    public static <R, T> List<R> transform1(List<T> tList, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        Iterator<T> tIterator = tList.iterator();
        while (tIterator.hasNext()) {
            T element = tIterator.next();
            result.add(function.apply(element));
        }
        return result;
    }


}