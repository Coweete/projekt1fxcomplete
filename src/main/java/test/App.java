package test;



/**
 * Created by jonatan on 2016-04-11.
 */
public class App {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                WindowClass.launch(WindowClass.class);
            }
        });
        t1.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
