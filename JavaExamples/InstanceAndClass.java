import java.util.Scanner;

public class InstanceAndClass {
    private int yas;

    public InstanceAndClass(int ilkYas) {
        if (ilkYas > 0) {
            yas = ilkYas;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            yas = 0;
        }
    }

    public void amIOld() {
        if (yas < 13)
            System.out.println("You are young.");
        else if (yas < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

    public void yearPasses() {
        yas++;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            InstanceAndClass p = new InstanceAndClass(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

