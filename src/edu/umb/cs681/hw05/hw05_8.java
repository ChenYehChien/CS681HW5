package edu.umb.cs681.hw05;

public class hw05_8 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		RunnablePrimeGenerator g1 = new RunnablePrimeGenerator(1L, 250000L);
		RunnablePrimeGenerator g2 = new RunnablePrimeGenerator(250001L, 500000L);
		RunnablePrimeGenerator g3 = new RunnablePrimeGenerator(500001L, 750000L);
		RunnablePrimeGenerator g4 = new RunnablePrimeGenerator(750001L, 1000000L);
		RunnablePrimeGenerator g5 = new RunnablePrimeGenerator(1000001L, 1250000L);
		RunnablePrimeGenerator g6 = new RunnablePrimeGenerator(1250001L, 1500000L);
		RunnablePrimeGenerator g7 = new RunnablePrimeGenerator(1500001L, 1750000L);
		RunnablePrimeGenerator g8 = new RunnablePrimeGenerator(1750001L, 2000000L);
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		Thread t3 = new Thread(g3);
		Thread t4 = new Thread(g4);
		Thread t5 = new Thread(g5);
		Thread t6 = new Thread(g6);
		Thread t7 = new Thread(g7);
		Thread t8 = new Thread(g8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		g1.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g2.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g3.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g4.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g5.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g6.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g7.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g8.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
	}
}