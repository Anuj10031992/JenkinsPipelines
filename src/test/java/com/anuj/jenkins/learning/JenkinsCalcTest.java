package com.anuj.jenkins.learning;


import static org.junit.Assert.*;

import org.junit.Test;

import com.anuj.jenkins.learning.JenkinsCalculator;

public class JenkinsCalcTest {

	@Test
	public void addtest() {
	   	
		assertEquals("Passed", 10, JenkinsCalculator.add(4, 6));
	}
	@Test
	public void difftest() {
	   	
		assertEquals("Passed", 8, JenkinsCalculator.diff(14, 6));
	}

}
