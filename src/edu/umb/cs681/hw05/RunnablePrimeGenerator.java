package edu.umb.cs681.hw05;

public class RunnablePrimeGenerator extends PrimeGenerator implements Runnable {

	public RunnablePrimeGenerator(long from, long to) {
		super(from, to);
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		generatePrimes();
	}
	
}