public class SimpleBear {
    String talk;
    boolean cantTalk;
    int batery;

    public SimpleBear() {
        this.talk = "I love you";
        this.batery = 100;
        this.cantTalk = true;
    }

    public void talk() {
        if (cantTalk) {
            if (batery > 0) {
                System.out.println("I LOVE YOUUUUUUU!!!!!!! ");
                batery -= 20;
            }
        } else {
            System.out.println("NO BATERY BITCH!!!!!");
        }
    }
}
