import org.testng.annotations.Test;

public class Plusplus {
    @Test
    public void plusPlus() {
        int i = 5;
        i = ++i + ++i;
        //чему равен i?

        System.out.println(i);
    }
}
