package edu.umb.cs681.hw05;

public class hw05_4 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		RunnablePrimeGenerator g1 = new RunnablePrimeGenerator(1L, 500000L);
		RunnablePrimeGenerator g2 = new RunnablePrimeGenerator(500001L, 1000000L);
		RunnablePrimeGenerator g3 = new RunnablePrimeGenerator(1000001L, 1500000L);
		RunnablePrimeGenerator g4 = new RunnablePrimeGenerator(1500001L, 2000000L);
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		Thread t3 = new Thread(g3);
		Thread t4 = new Thread(g4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
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
		long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
	}
	
}