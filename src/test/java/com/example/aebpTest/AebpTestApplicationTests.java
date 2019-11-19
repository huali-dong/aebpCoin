package com.example.aebpTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AebpTestApplicationTests {
	
	@Test
	void should_return_a_coin_when_given_whole_number() {

		int value = 3;

		Coin coin = new Coin(value);
		assertNotNull(coin);
		assertEquals(value, coin.getValue());
	}

	@Test
	void should_throw_exception_when_given_a_number_more_than_maximum(){

		assertThrows(RuntimeException.class, ()->{
			new Coin(2000000000);
		});
	}

	@Test
	void should_throw_exception_when_given_a_minus_number(){

		assertThrows(RuntimeException.class, ()->{
			new Coin(-23);
		});
	}

	@Test
	void should_return_true_when_first_coin_more_than_second_coin() {

		Coin first = new Coin(9);
		Coin second = new Coin(3);

		assertTrue(first.compare(second));
	}

	@Test
	void should_return_false_when_first_coin_less_than_second_coin() {

		Coin first = new Coin(3);
		Coin second = new Coin(9);

		assertFalse(first.compare(second));
	}
}
