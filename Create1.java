public class Create1 implements Runnable {
    // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        Create1 create1 = new Create1();
        Thread thread = new Thread(create1);
        thread.start();
    }
}
