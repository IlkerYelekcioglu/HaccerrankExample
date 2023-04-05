
    import java.io.*;


    class Sonuc {



        public static int factorial(int n) {
            int fact = 1;
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
            return fact;

        }

    }

    public class Recursion   {
         public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Sonuc.factorial(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

