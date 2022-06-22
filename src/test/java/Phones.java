public class Phones {
    int price;
    String brand;
    //float diagonal;
    //boolean miniJackYes;
    //char model;

    Phones(int price, String brand) {
        this.price = price;
        this.brand = brand;
        //this.diagonal = diagonal;
        //this.miniJackYes = miniJackYes;
        //this.model = model;
    }
    void showPrice() {
        System.out.println(price);
    }
    void showBrand(){
        System.out.println(brand);
    }
}