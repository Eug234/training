import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FactorialTestCustom {

    //factorial - 5! = 5*4*3*2*1, 1! = 1, 0! = 1
    //напишіть функцію, яка буде рахувати факторіали

    public void checkFactorial(){
        Assert.assertTrue(factorial(2) == 2);
        Assert.assertTrue(factorial(3) == 6);
        Assert.assertTrue(factorial(1) == 1);
        Assert.assertTrue(factorial(0) == 1);

    }
    public int factorial(int n){
        int result = 1;
        if(n ==1 || n == 0){
            return result;
        }

        int[] array = new int[n];
        for (int i = n; i > 0; i--){
            array[i-1] = i;
        }

        for(int elementInArr : array){
            result = result*elementInArr;
        }

        return result;
    }
}
