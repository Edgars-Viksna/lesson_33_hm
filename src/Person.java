public class Person {
    private String fName;
    private String lName;
    private String email;

    public Person(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person" +
                " fName " + fName +
                ",   lName " + lName +
                ",    email " + email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }
}
