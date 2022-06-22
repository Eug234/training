import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Loops {

    @Test
    public void loopsExc() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//    }
//    String name = "Vadym";
//    for (int iterator = 0; iterator <name.length(); iterator++){
//        System.out.println(namee.charAt(iterator))
//
//    }

//        int[] nums = {2, 3, 6, 22, 332, 123, 12, 12, 3, 123};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        int[] nums = {2, 3, 6, 22, 332, 123, 12, 12, 3, 123};    //массив
        for(int element : nums){             //element - имя наобум, nums - указать массив для перебора
                                            //конструкция наз. "For each"
            System.out.println(element);
        }

    }
}
