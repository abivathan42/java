import java.util.Scanner;

class Geeks {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }
}
