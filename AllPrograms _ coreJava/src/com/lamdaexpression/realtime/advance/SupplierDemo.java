package com.lamdaexpression.realtime.advance;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		
		return "hi Naresh";
	}

	public static void main(String[] args) {
		
		Supplier<String> supplier=new SupplierDemo();
		System.out.println(supplier.get());
		
	}
}
