package com.bw.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength(".");
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String g = StringUtil.randomChineseString(10);
		System.out.println(g);
	}

	@Test
	public void testRandomChineseString() {
		
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
