import org.testng.annotations.Test;

public class TestArray {
    @Test
    public void checkArray() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

//    String sourceStr = "hello my name is Vadym";
//    System.out.println(sourceStr.length());
//    System.out.println(sourceStr.charAt(0));
//    System.out.println(sourceStr.substring(3, 7));
//    System.out.println(sourceStr.substring(sourceStr.length() - 5));
//    System.out.println(sourceStr.contains("is"));
//        int age = 35;
//        int age2 = 40;
//        int age3 = 45;
//        int age4 = 20;
//        int age5 = 30;
//
//        int[] arr = {35, 40, 45, 20, 30};
//    int arr2[] = {35, 40, 45, 20, 30};
//        System.out.println(arr[0]);
//
//        arr[0] = 25;
//    System.out.println(arr[0]);
//    int arr3[] = new int[10];
//    System.out.println(arr3[3]);


            }
        }
    }
