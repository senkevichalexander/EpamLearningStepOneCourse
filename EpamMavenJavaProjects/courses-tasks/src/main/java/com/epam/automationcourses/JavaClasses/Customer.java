public class Customer {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int creditCardId;
    private int bankNumberCard;

    Customer(String fname, String lName, String patronymic, String address, int creditCardId, int bankNumberCard) {
        this.firstName = fname;
        this.lastName = lName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    public String getName() {
        return firstName;
    }

    public String getName2() {
        return lastName;
    }

    public String getName3() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d",
                id, firstName, lastName, patronymic, address, creditCardId, bankNumberCard);
    }
}
