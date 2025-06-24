public class ArraySumExample {
    public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }

        // 3. Calculate the sum of all array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // 4. Print the total sum
        System.out.println("\nSum of all array elements = " + sum);
    }
}
