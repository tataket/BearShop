public class DrunkBear extends SimpleBear {
    @Override
    public void talk() {
        super.talk();
        int numbRandom = (int) (Math.random() * (100 - 1)) + 1;
        if (numbRandom >= 20){
            super.talk();
        } else {
            System.out.println("zzzzzzzzzzzzzzz");
        }
    }
}
