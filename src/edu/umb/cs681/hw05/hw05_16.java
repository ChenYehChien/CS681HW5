package edu.umb.cs681.hw05;

public class hw05_16 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		RunnablePrimeGenerator g1 = new RunnablePrimeGenerator(1L, 125000L);
		RunnablePrimeGenerator g2 = new RunnablePrimeGenerator(125001L, 250000L);
		RunnablePrimeGenerator g3 = new RunnablePrimeGenerator(250001L, 375000L);
		RunnablePrimeGenerator g4 = new RunnablePrimeGenerator(375001L, 500000L);
		RunnablePrimeGenerator g5 = new RunnablePrimeGenerator(500001L, 625000L);
		RunnablePrimeGenerator g6 = new RunnablePrimeGenerator(625001L, 750000L);
		RunnablePrimeGenerator g7 = new RunnablePrimeGenerator(750001L, 875000L);
		RunnablePrimeGenerator g8 = new RunnablePrimeGenerator(875001L, 1000000L);
		RunnablePrimeGenerator g9 = new RunnablePrimeGenerator(1000001L, 1125000L);
		RunnablePrimeGenerator g10 = new RunnablePrimeGenerator(1125001L, 1250000L);
		RunnablePrimeGenerator g11 = new RunnablePrimeGenerator(1250001L, 1375000L);
		RunnablePrimeGenerator g12 = new RunnablePrimeGenerator(1375001L, 1500000L);
		RunnablePrimeGenerator g13 = new RunnablePrimeGenerator(1500001L, 1625000L);
		RunnablePrimeGenerator g14 = new RunnablePrimeGenerator(1625001L, 1750000L);
		RunnablePrimeGenerator g15 = new RunnablePrimeGenerator(1750001L, 1875000L);
		RunnablePrimeGenerator g16 = new RunnablePrimeGenerator(1875001L, 2000000L);
		
		
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		Thread t3 = new Thread(g3);
		Thread t4 = new Thread(g4);
		Thread t5 = new Thread(g5);
		Thread t6 = new Thread(g6);
		Thread t7 = new Thread(g7);
		Thread t8 = new Thread(g8);
		Thread t9 = new Thread(g9);
		Thread t10 = new Thread(g10);
		Thread t11 = new Thread(g11);
		Thread t12 = new Thread(g12);
		Thread t13 = new Thread(g13);
		Thread t14 = new Thread(g14);
		Thread t15 = new Thread(g15);
		Thread t16 = new Thread(g16);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		t9.join();
		t10.join();
		t11.join();
		t12.join();
		t13.join();
		t14.join();
		t15.join();
		t16.join();
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
		g9.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g10.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g11.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g12.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g13.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g14.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g15.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		g16.getPrimes().forEach((prime) -> {
			System.out.println(prime);
		});
		
	    long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
	}
}