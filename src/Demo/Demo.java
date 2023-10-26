package Demo;

import jdk.jfr.internal.tool.Main;

public class Demo extends Thread {
    private String name;
    public static void main(String[] args) {
//        Thread thread = new Main();
//        thread.start();
    }

    @Override
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i++);
        }
    }
}
