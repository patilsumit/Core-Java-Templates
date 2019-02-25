package com.emertxe;

/**
 * Program Description: This program is to show the implementation of join()
 * method of Thread class
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadJoinTest.java 
 * Execution: java ThreadJoinTest 
 * Output:
 */

/*
 * if two threads are executing, let's say t1 and t2 and i say t1.join then t2
 * immediately enter into waiting state until t1 completes its execution
 */

class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(5 * i);

			try {

				sleep(100);

			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

public class ThreadJoinTest {

	public static void main(String[] args) {

		MyThread t = new MyThread();

		MyThread t1 = new MyThread();

		t.start();

		try {

			/*
			 * join() method will halt the current execution of Thread class
			 */

			t.join();

			// System.out.println("in main");

		}

		catch (InterruptedException e) {

			e.printStackTrace();

		}

		t1.start();

		try {

			t1.join();
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}