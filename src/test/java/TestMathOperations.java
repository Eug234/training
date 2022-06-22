import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperations {

    @Test
    public void checksum(){
        //summ(4,5) == 9 expected 9
        Assert.assertTrue(summ(4,5) == 9);
        Assert.assertTrue(summ(2,6) == 8);
        Assert.assertTrue(summ(34,6) == 40);
    }
@Test
    public void checkMult(){
        Assert.assertTrue(mult(2,3) == 6);
    Assert.assertTrue(mult(3,3) == 9);
    Assert.assertTrue(mult(3,10) == 30);

    }

    public int summ(int a, int b){
        return a + b;
    }
    public int mult(int a, int b){

        return a * b;
    }
}
