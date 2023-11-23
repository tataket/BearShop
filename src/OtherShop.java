import java.util.ArrayList;

public class OtherShop extends Shop {
    int counterBears = 0;
    ArrayList<String> bearTwoArrayList = new ArrayList<>();

    public void openShop() {
        for (int i = 0; i < 10; i++) {
            int numbRandom = (int) (Math.random() * (100 - 1)) + 1;
            if (numbRandom % 2 == 0) {
                bearTwoArrayList.add("SIMPLE BEAR");
                counterBears++;
            }
            if (numbRandom % 5 == 0) {
                bearTwoArrayList.add("CRANKY BEAR");
                counterBears++;
            } else {
                bearTwoArrayList.add("DRUNK BEAR");
                counterBears++;
            }
        }
    }
    public void checkShop(){
        System.out.println("List the OTHERSHOP the Bears");
        for (int i = 0; i < bearTwoArrayList.size(); i++) {
            System.out.println(i+1+" "+ bearTwoArrayList.get(i));

        }
    }
}

