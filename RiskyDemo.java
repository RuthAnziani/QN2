// SECTION A - QUESTION TWO, Part (b): risky(0) and risky(2) trace
public class RiskyDemo {
    static String risky(int x) {
        try {
            int result = 10 / x;
            System.out.println("Result: " + result);
            return "Success";
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
            return "Failure";
        } finally {
            System.out.println("Cleanup for x = " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println(risky(2));
        System.out.println(risky(0));
    }
}
