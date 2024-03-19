package MultiThreads;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        // Create a sub class of Thread

        // OR
        MyThread thread1 = new MyThread();

        // Implement Runnable interface and pass as an argument to Thread

        MyRunnable runnable1 = new MyRunnable();   // This method is preferable for Threads
        Thread thread2 = new Thread(runnable1);


        thread1.start();
        //thread1.join(3000);  //Calling thread(ex:main) waits until the specified thread dies or for x amount of millsec
        thread2.start();
    }
}
