package com.practice.optional;

import java.util.Optional;

public class TestOptionalFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);
		System.out.println(nameOptional.isPresent());
		System.out.println(nameOptional.isEmpty());
		System.out.println(nameOptional.get());
		

	}

}
