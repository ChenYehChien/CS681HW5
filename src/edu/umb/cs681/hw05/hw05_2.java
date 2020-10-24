package edu.umb.cs681.hw05;

public class hw05_2 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		RunnablePrimeGenerator g1 = new RunnablePrimeGenerator(1L, 1000000L);
		RunnablePrimeGenerator g2 = new RunnablePrimeGenerator(1000001L, 2000000L);
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		g1.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g2.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
	}
	
}