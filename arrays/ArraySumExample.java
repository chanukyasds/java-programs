public class ArraySumExample {
    public static void main(String[] args) {
   
        int[] numbers = {10, 20, 30, 40, 50};

        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }

        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // test6
        System.out.println("\nSum of all array elements = " + sum);
    }
}
