
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i;
        int f = 1;

        for (i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.print("Factorial = " + f);
    }
}
