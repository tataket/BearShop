public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.shop();
        shop.check();

        OtherShop otherShop = new OtherShop();
        otherShop.openShop();
        otherShop.checkShop();

        if (otherShop.bearTwoArrayList.size() > shop.bearArrayList.size()) {
            System.out.println("e isso ai parsa");
        } else if (otherShop.bearTwoArrayList.size() == shop.bearArrayList.size()) {
            System.out.println("Tamo junto");
        } else {
            System.out.println("nao foi dessa vez parsa");
        }
    }
}
