import java.util.ArrayList;

public class Shop {

    int countBear = 0;
    ArrayList<String> bearArrayList = new ArrayList<>();

    public void shop() {
        int numbRandom = (int) (Math.random() * (100 - 1)) + 1;
        if (numbRandom % 2 == 0) {
            createSimpleBear();
            bearArrayList.add("SIMPLE BEAR");
            countBear++;
        }
        if (numbRandom % 5 == 0) {
            createCrankyBear();
            bearArrayList.add("CRANKY BEAR");
            countBear++;
        } else {
            createDrunkBear();
            bearArrayList.add("DRUNK BEAR");
            countBear++;
        }
    }

    public void createSimpleBear() {
        System.out.println("Simple Bear");
        SimpleBear simpleBear = new SimpleBear();
        simpleBear.talk();
        countBear++;
    }

    public void createCrankyBear() {
        System.out.println("Cranky Bear");
        CrankyBear crankyBear = new CrankyBear();
        crankyBear.talk();
        countBear++;
    }

    public void createDrunkBear() {
        System.out.println("Drunk Bear");
        DrunkBear drunkBear = new DrunkBear();
        drunkBear.talk();
        countBear++;
    }

    public void check() {
        System.out.println("List of SHOP the Bears");
        for (int i = 0; i < bearArrayList.size(); i++) {
            System.out.println(i + 1 + " " + bearArrayList.get(i));
        }
    }
}
