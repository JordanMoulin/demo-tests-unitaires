package dev.Utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void testlevenshteinDistance(){
		int distance = 0;
		distance = StringUtils.levenshteinDistance("distance", "instance");
		Assert.assertEquals(2, distance);
		
		distance = StringUtils.levenshteinDistance("distance", "distance");
		Assert.assertEquals(0, distance);
		
		distance = StringUtils.levenshteinDistance("", "instance");
		Assert.assertEquals(8, distance);
		
		distance = StringUtils.levenshteinDistance(null, "instance");
		Assert.assertEquals(0, distance);
		
		distance = StringUtils.levenshteinDistance(null, null);
		Assert.assertEquals(0, distance);
	}
}
