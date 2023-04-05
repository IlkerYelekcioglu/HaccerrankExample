    import java.util.*;

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        private int[] testScores;

        public int[] getTestScores() {
            return testScores;
        }

        public void setTestScores(int[] testScores) {
            this.testScores = testScores;
        }

        public Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            setTestScores(testScores);
        }

        public String calculate() {
            int sum = 0;
            int[] testScorestoCalc = Student.this.testScores;
            for (int i = 0; i < testScorestoCalc.length; i++) {
                sum += testScores[i];
            }
            int average = sum / testScorestoCalc.length;
            if (average < 40) {
                return "T";
            } else if (average >= 40 && average < 55) {
                return "D";
            } else if (average >= 55 && average < 70) {
                return "P";
            } else if (average >= 70 && average < 80) {
                return "A";
            } else if (average >= 80 && average < 90) {
                return "E";
            } else {
                return "O";
            }
        }
    }

    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate() );
        }
    }

