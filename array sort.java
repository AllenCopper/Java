import java.util.Scanner;

class ArraySort {

    void sortIntArray(int[] array, int n) {
        int temp;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted list of integers:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Newline for better output format
    }

    void sortStrArray(String[] names, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (names[i].trim().compareTo(names[j].trim()) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Sorted list of names:");
        for (int i = 0; i < m; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are to be sorted?");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("How many strings are to be sorted?");
        int m = input.nextInt();
        input.nextLine(); // Consume newline left-over
        String[] names = new String[m];

        System.out.println("Enter names:");
        for (int i = 0; i < m; i++) {
            names[i] = input.nextLine();
        }

        ArraySort sorter = new ArraySort();
        sorter.sortIntArray(array, n);
        sorter.sortStrArray(names, m);

        input.close();
    }
}
