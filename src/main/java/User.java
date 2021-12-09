public abstract class User {
    private String name;
    private AccountType accountType;
    private String mailAddress;

    public User(String name, AccountType typeOfUser){
        this.name = name;
        this.accountType = typeOfUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", accountType=" + accountType +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
