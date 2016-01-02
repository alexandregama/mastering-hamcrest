package com.mastering.hamcrest.collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestCollectionTest {

	@Test
	public void shouldIndicateThatAnElementExistsInCollection() {
		List<String> names = Arrays.asList("Alexandre", "Carlos", "Gustavo");

		assertThat(names, hasItem("Alexandre"));
	}

	@Test
	public void shouldIndicateThatAnElementDoesNotExistsInCollection() {
		List<String> names = Arrays.asList("Alexandre", "Carlos", "Gustavo");

		assertThat(names, not(hasItem("Paulo")));
	}

}
