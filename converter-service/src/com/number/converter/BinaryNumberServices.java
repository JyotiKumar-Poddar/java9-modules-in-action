package com.number.converter;

import com.converter.number.ToBinary;

public class BinaryNumberServices {

	public static void main(String[] args) {
		System.out.printf("binary format is %s",
					new ToBinary().toBinary(234));
	}
}
