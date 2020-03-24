package tdd.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import tdd.junit.RemoveA;

 public class Remove2ACharsTest {



	/* TDD list for my feature
	 * 1.1 chars:ABCD=>BCD
	 * 2.2 chars:AACD=>CD
	 * 3.2 chars:BACD=>BCD
	 * 4.BBAA=>BBAA
	 * 5.2 chars:AABAA=>BAA
	 * 6.empty string 
	 * 7.1 chars:A=>""
	 * 8.2 chars:AA=>""
	 */

	RemoveA d ;

	@BeforeEach
	void createObject() 
	{
		d = new RemoveA();

	}
	

	@Test
	public void test1() 
	{
		assertEquals("BCD", d.removeA("ABCD"));

		}
	
	
	@Test
	public void test2() 
	{
		assertEquals("CD", d.removeA("AACD"));
	}


	@Test
	public void test3()
	{
		assertEquals("BCD", d.removeA("BACD"));
	}

	
	@Test
	public void test4()
	{
		assertEquals("BBAA", d.removeA("BBAA"));
	}

	
	@Test
	public void test5() 
	{
		assertEquals("BAA", d.removeA("AABAA"));	
	}

	

	@Test
	public void testempty6() 
	{
		assertEquals("", d.removeA(""));

		}


	@Test
	public void test7() 
	{
		assertEquals("", d.removeA("A"));
		}

	
	@Test
	public void test8() 
	{
		assertEquals("", d.removeA("AA"));
	}
}