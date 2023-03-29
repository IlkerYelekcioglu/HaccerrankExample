public class GCF {
    public class Division {

        /**
         * Division function.
         *
         * @param num1 input number 1
         * @param num2 input number 2
         * @return the GCF
         */
        private static int division(int num1, int num2) {
            if (num1 == 0 || num2 == 0) {
                return num1 + num2;
            }

            return division(num2, num1 % num2);
        }

        /**
         * Entry point.
         *
         * @param args command line arguments
         */
        public static void main(String[] args) {
            int result1 = division(20, 40);
            System.out.println(result1);
            int result2 = division(12, 16);
            System.out.println(result2);
        }

    }
}
