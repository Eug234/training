public class Store {

    public static void main(String[] args) {
        Phones samsung = new Phones(500,"Samsung");
        samsung.price = 10_000;
        samsung.brand = "Samsung";
        //samsung.diagonal = 6.50f;
        //samsung.miniJackYes = true;
        //samsung.model = 'Y';

        samsung.showPrice();
        samsung.showBrand();

    }

}
