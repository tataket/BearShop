public class CrankyBear extends SimpleBear {
    int count = 0;

    @Override
    public void talk() {
        if (batery >= 50) {
            super.talk();
        } else {
            cantTalk = false;
            if (count == 0) {
                System.out.println("SAD SONG BITCH, I WANNA CRY.....");
                count++;
            }
        }
    }
}
