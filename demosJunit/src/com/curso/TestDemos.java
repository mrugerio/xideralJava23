package com.curso;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class TestDemos {
	
//	@BeforeEach
//	void beforeEach(TestInfo prueba) {
//		System.out.println("Initialize Test Data for " + prueba.getDisplayName());
//	}
//	
//	@AfterEach
//	void afterEach(TestInfo info) {
//		System.out.println("Clean up Test Data for " + info.getDisplayName());
//	}
	
//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("Initialize connection to database");
//	}
//
//	@AfterAll
//	static void afterAll() {
//		System.out.println("Close connection to database");
//	}
	
	@Test
	void length_basic() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	void length_greater_than_zero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("DEF".length() > 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "ABCD", "ABC", "AZ", "DEF" })
	void length_greater_than_zero_using_parameterized_test(String str) {
		assertTrue(str.length() > 1);
	}
	
	@ParameterizedTest(name = "{0} a Mayúsculas es {1}")
	@CsvSource(value = { "abcd, ABCD", "abc, ABC", "'',''", "abcdefg, ABCDEFG" })
	void uppercase(String word, String capitalizedWord) {
		assertEquals(capitalizedWord, word.toUpperCase());
	}
	
	@ParameterizedTest(name = "{0} tamaño es {1}")
	@CsvSource(value = { "abcd, 4", "abc, 3", "'',0", "abcdefg, 7" })
	void length(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}
	
	@Test
	@DisplayName("When length is null, throw an exception")
	void length_exception() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
	}
	
	@Test
	@Disabled
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(4), () -> {
			for (int i = 0; i <= 100_000; i++) {
				int j = i;
				System.out.println(j);
			}
		});
	}
	
	@Test
	void toUpperCase_basic() {
		String str = "abcd";
		String result = null;
		//assertNotNull(result);
		assertNull(result);
		//assertEquals("ABCD", result);
	}
	
	@Test
	@RepeatedTest(5)
	void contains_basic() {
		assertFalse("abcdefgh".contains("ijk"));
	}
	
	@Test
	void split_basic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] { "abc", "def", "ghi" };
		assertArrayEquals(expectedResult, actualResult);
	}
	
	String str = null;
	
	@Nested
	@DisplayName("For an empty String")
	class EmptyStringTests {

		@BeforeEach
		void setToEmpty() {
			str = "";
		}

		@Test
		@DisplayName("length should be zero")
		void lengthIsZero() {
			assertEquals(0, str.length());
		}

		@Test
		@DisplayName("upper case is empty")
		void uppercaseIsEmpty() {
			assertEquals("", str.toUpperCase());
		}

	}

	@Nested
	@DisplayName("For large strings")
	class LargeStringTests {

		@BeforeEach
		void setToALargeString() {
			str = "Afsjdjfljsadfkljsadlkfjlajbvjcxzbnhrewu";
		}

		@Test 
		void test() {
			assertFalse(str.endsWith("wuz"));
		}

	}
	
	
	
	
	
	
	
	
}
