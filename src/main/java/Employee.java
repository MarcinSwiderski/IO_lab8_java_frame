public class Employee extends User implements IManagable{
    public Employee(String name, AccountType typeOfUser) {
        super(name, typeOfUser);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void addTaxInvoice() {

    }

    @Override
    public void manageTaxList() {

    }
}
