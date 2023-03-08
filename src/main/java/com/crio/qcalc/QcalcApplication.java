package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		System.out.println("Starting QCalc..");
		SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calc = new StandardCalculator();

		calc.getVersion();

		System.out.println("Addition:");
		calc.add(20, 30);
		calc.printResult();
       	//System.out.println(calc.getResult());
		//calc.clearResult();

		System.out.println("Subtract:");
		calc.subtract(200, 100);
       	System.out.println(calc.getResult());
		calc.clearResult();

		System.out.println("Multiply:");
		calc.multiply(200, 100);
       	System.out.println(calc.getResult());
		calc.clearResult();

		System.out.println("division:");
		calc.divide(200, 0);
       	System.out.println(calc.getResult());
		calc.clearResult();

		ScientificCalculator scalc = new ScientificCalculator();

		scalc.getVersion();

		System.out.println("Sin:");
		scalc.sin(90);
		//System.out.println(scalc.getResult());
		scalc.printResult();

		System.out.println("Cos:");
		scalc.cos(60);
		System.out.println(scalc.getResult());

		System.out.println("Tangent :");
		scalc.sin(30);
		System.out.println(scalc.getResult());

		System.out.println("cube root :");
		scalc.cbrt(125);
		System.out.println(scalc.getResult());

		
LogicCalculator lcalc = new LogicCalculator();

System.out.println("Logical OR :");
lcalc.OR(5, 7);
lcalc.printResult();

System.out.println("Logical AND :");
lcalc.AND(5, 7);
lcalc.printResult();

	}

}
