package Day_20;

class Bank {
    int balance = 1000;

    void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+ " is withdrawing");

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Remaining amount is: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class ConcurrencyImplementation {
    public static void main(String[] args) {
        Bank b = new Bank();

        Runnable task = () -> {
            b.withdraw(800);
        };

        Thread t1 = new Thread(task, "User 1");
        Thread t2 = new Thread(task, "User 2");

        t1.start();
        t2.start();
    }
}