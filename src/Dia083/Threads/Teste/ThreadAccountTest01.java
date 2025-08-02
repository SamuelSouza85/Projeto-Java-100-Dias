package Dia083.Threads.Teste;

import Dia082.Threads.Dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("LASCO");
            }
        }
    }

    private void withdrawal(int amout) {
        System.out.println(getThreadName()+ " **** fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName()+ " dentro do synchronized");
            if (account.getBalance() >= amout) {
                System.out.println(getThreadName() + " está indo sacar dinheiro ");
                account.withdrawl(amout);
                System.out.println(getThreadName() + " completou o saque, valor atuar da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
