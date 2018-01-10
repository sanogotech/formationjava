package com.cnss.demo.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.cnss.demo.utils.enumuration.Civilite;

public class CiviliteTest {
	
	@Test
	public void testValueOf() {
		Civilite civilite =Civilite.valueOf("MADAME");
		assertEquals("MME",civilite.toString());
	}

}
