package BT.BT2;

public class TestThread {

    public static void main(String[] args) {
        // Tạo 2 đối tượng từ 2 lớp OddThread và EvenThread
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start 2 thread
        oddThread.start();
        evenThread.start();

        // Sử dụng join() để cho phép xuất các số lẻ trước mới đến các số chẵn
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In các số chẵn
        evenThread.run();
    }
}
