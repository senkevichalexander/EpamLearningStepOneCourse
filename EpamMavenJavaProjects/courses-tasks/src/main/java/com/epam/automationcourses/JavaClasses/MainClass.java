import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Shop shop = new Shop("Abc");
        shop.addCustomerToShopList(new Customer("Сенькевич", "Александр", "Васильевич", "Минск", 2222-0000-1111, 12));
        shop.addCustomerToShopList(new Customer("Архипенко", "Евгений", "Петрович", "Фаниполь", 4444-6666-7777, 56));
        shop.addCustomerToShopList(new Customer("Густовский", "Петр", "Эдуардович", "Зорька", 8888-9999-0000, 11));


        System.out.println("\nsort by Last name:");
        List<Customer> listSortByName = shop.getListByLastName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort by firstname");
        List<Customer> listSortByName2 = shop.getListByFirstName();
        for (Customer c : listSortByName2) {
            System.out.println(c);
        }

        System.out.println("\nprint customers by range credit card:");
        List<Customer> listSortByRangeCreditCard = shop.getListByRangeCreditCard(0, 1111);
        for (Customer c : listSortByRangeCreditCard) {
            System.out.println(c);
        }


    }
}
