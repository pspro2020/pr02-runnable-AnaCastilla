public class PowTable implements Runnable {

    private final int number;

    PowTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d ^ %d = %.2f\n", Thread.currentThread().getName(),
                    number, i, Math.pow(number, i));

        }
    }

}
