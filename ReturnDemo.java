// SECTION A - QUESTION TWO, Part (a): try/finally return-value behaviour
public class ReturnDemo {
    static int test() {
        int value = 10;
        try {
            value = 20;
            return value;
        } finally {
            value = 30;
            System.out.println("Finally block value: " + value);
        }
    }

    public static void main(String[] args) {
        int result = test();
        System.out.println("Returned value: " + result);
    }
}
