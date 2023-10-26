package BT.BT1;

public class NumberGenerator implements Runnable {

    private int hashCode;

    public NumberGenerator() {
        this.hashCode = this.hashCode();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Số tự nhiên thứ " + i + ", hashCode: " + this.hashCode);
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        thread1.start();
        thread2.start();
    }
}

