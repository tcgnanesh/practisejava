public class LargestNumber {
    public static void main(String[] args) {

        int a = 25;
        int b = 70;
        int c = 45;

        if (a > b && a > c) {
            System.out.println("Largest = " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }
}