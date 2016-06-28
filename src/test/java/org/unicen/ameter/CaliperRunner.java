package org.unicen.ameter;

import com.google.caliper.runner.CaliperMain;

public class CaliperRunner {

    public static void main(String[] args) {
    
    	CaliperMain.main(FactorialBenchmark.class, args);
    }

}