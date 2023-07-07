import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(56245);
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
    }
}
