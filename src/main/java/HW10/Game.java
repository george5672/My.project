    public static void printSquare(int number) {
        System.out.println("  Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static long power(int a, int b) {
        return (long) Math.pow(a, b);
    }

    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println("  " + text);
        }
    }
}
