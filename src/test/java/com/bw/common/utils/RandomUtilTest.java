package com.bw.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for(int i=0;i<100;i++) {
			int random = RandomUtil.random(6,10);
			System.out.println(random);
		
		}
	}

	@Test
	public void testSubRandom() {
		int[] subs = RandomUtil.subRandom(1, 10,3);
		for(int i:subs) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
	String r = RandomUtil.randomString(10);
	System.out.println(r);
	}

}
