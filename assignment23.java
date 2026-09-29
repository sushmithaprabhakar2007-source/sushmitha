public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] a = {10, 20, 30};

            int result = 10 / 0;

            System.out.println(result);

            System.out.println(a[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Finally block executed.");
        }
    }
}

