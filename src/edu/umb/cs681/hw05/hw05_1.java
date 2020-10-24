package edu.umb.cs681.hw05;

public class hw05_1 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		RunnablePrimeGenerator g1 = new RunnablePrimeGenerator(1L, 2000000L);
		Thread t1 = new Thread(g1);
		t1.start();
		t1.join();
		g1.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
		
	}
}