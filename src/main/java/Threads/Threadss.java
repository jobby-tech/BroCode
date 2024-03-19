package Threads;

public class Threadss {

    /* A thread of execution in a program (kind of like a virtual CPU)

    The JVM allows an application to have multiple threads concurrently
    Each thread can execute parts of the code in parallel with the main thread
    Each thread has a priority
    Threads with higher priority are executed in preference compared to threads lower priority


    Java virtual machine continues to execute threads until either of the following occurs
            1. The exit method of class Runtime has been called
            2. All user threads have died

    When JVM starts up, there is a thread which calls the main method, This thread is called "main"

    Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
    JVM terminates itself when all user threads(non-daemon threads) finish their execution

     */

    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        //Thread.currentThread().setName("MA");
        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());
//
//        for(int i=3;i>0;i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Its done");

        MyThread thread2 = new MyThread();
        thread2.start();
        thread2.setName("Thread2");
        thread2.setPriority(1);
        System.out.println(thread2.getName());
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getPriority());
        System.out.println("Active Count "+Thread.activeCount());

        thread2.setDaemon(true);
        System.out.println("Is thread2 daemon thread? "+thread2.isDaemon());


    }
}
