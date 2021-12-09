public class Client extends User implements ITaxable{

    public Client(String name, AccountType typeOfUser) {
        super(name, typeOfUser);
    }

    @Override
    public void startTaxingSequence() {

    }

    @Override
    public void showStatusOfTransaction() {

    }

    public void showArchiveMaps() {

    }

}
