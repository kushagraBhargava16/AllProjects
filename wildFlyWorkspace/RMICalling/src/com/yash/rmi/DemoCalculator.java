package com.yash.rmi;

import javax.naming.NamingException;

public class DemoCalculator {

	public static void main(String[] args) {

	}

	private static void invokeStatelessBean() throws NamingException {
		// Let's lookup the remote stateless calculator
		final CalculatorRemote statelessRemoteCalculator = lookupRemoteStatelessCalculator();
		System.out.println("Obtained a remote stateless calculator for invocation");
		// invoke on the remote calculator
		int a = 204;
		int b = 340;
		System.out.println("Adding " + a + " and " + b + " via the remote stateless calculator deployed on the server");
		int sum = statelessRemoteCalculator.add(a, b);
		System.out.println("Remote calculator returned sum = " + sum);
		if (sum != a + b) {
			throw new RuntimeException(
					"Remote stateless calculator returned an incorrect sum " + sum + " ,expected sum was " + (a + b));
		}
		// try one more invocation, this time for subtraction
		int num1 = 3434;
		int num2 = 2332;
		System.out.println("Subtracting " + num2 + " from " + num1
				+ " via the remote stateless calculator deployed on the server");
		int difference = statelessRemoteCalculator.subtract(num1, num2);
		System.out.println("Remote calculator returned difference = " + difference);
		if (difference != num1 - num2) {
			throw new RuntimeException("Remote stateless calculator returned an incorrect difference " + difference
					+ " ,expected difference was " + (num1 - num2));
		}
	}

}
