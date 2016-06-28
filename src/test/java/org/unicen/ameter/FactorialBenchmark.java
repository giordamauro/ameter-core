package org.unicen.ameter;

import com.google.caliper.Benchmark;
import com.google.caliper.Param;

public class FactorialBenchmark {

	@Param({ "5", "10", "15" })
	int number;
	// number to factorial -Dnumber-1,2,3

	@Benchmark
	long recursive(int rep) {
		int number = this.number;
		// to avoid optimizing out of call to recursive
		long dummy = 0;
		for (int i = 0; i < rep; i++) {
			dummy |= Factorial.recursive(number);
		}

		return dummy;
	}

	@Benchmark
	long iterative(int rep) {
		int number = this.number;
		// to avoid optimizing out of call to recursive
		long dummy = 0;
		for (int i = 0; i < rep; i++) {
			dummy |= Factorial.iterative(number);
		}

		return dummy;
	}
}