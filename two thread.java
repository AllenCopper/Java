class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.print(c + " ");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        // Start the threads
        numberThread.start();
        alphabetThread.start();

        // Ensure main thread waits for other threads to complete
        try {
            numberThread.join();
            alphabetThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nThreads synchronized.");
    }
}