public class RestaurantTest {
    public static void main(String[] args) {
        // Test Restaurant1 class
        Restaurant1 pastaRestaurant = new Restaurant1("Spoletto", "Orlando", "Lasagna");
        pastaRestaurant.printDetails();
        System.out.println(pastaRestaurant.describeSpecialtyDish());

        //test restaurant2 class

        Restaurant2 sitDownRestaurant = new Restaurant2("twenty", "Dana", "booth");
        sitDownRestaurant.printRest();
        System.out.println(sitDownRestaurant.printTablesAvailable());

    }
}
