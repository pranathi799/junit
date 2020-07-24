
package com.mavdemo.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void test() {
		assertEquals("BCD",App.remove("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD",App.remove("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("CD",App.remove("AACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",App.remove("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",App.remove("AABAA"));
	}

    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
