import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < tc; t++) {
            try {
                String in = sc.nextLine();

                // else {
                //     System.out.println();
                //     throw new IllegalArgumentException("Invalid object type: " + obj);
                // }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage() + " Please try again.");
                sc.nextLine(); // consume any remaining input
            }
        }
    }
}