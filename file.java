package normalize;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertioons.*;

Class NormalizeTest {
	@Test
	void new() //return new date dictionary
	{
	        DateDictionary d1 = new DateDictionary(Map.of("2019-01-01",10));
        	Normalize normalize = =new Normalize();
	
        	DateDictionary newDateDictionary = normalize.Solution(d);
	
        	assertNotEquals(d,newDateDictionary);
	}
	
	@Test
	void missing() // return missing date in keys
	{
	
        	DateDictionary d2 = new DateDictionary(Map.of("2019-01-01",10,"2019-01-04",100000));
	        Normalize normalize = new Normalize();
	
	        DateDictionary n1 = normalize.solution(d2);
	
	        assertTrue(n1.hasKey("2019-01-01"));
        	assertTrue(n1.hasKey("2019-01-02"));
	        assertTrue(n1.hasKey("2019-01-03"));
	        assertTrue(n1.hasKey("2019-01-04"));
	}
	
	@Test
	void dates() //return dictionary with normalized value
	{
	
    	DateDictionary d3 = new DateDictionary( Map.of(
				"2019-01-10",10,
				"2019-01-11",20,
				"2019-01-13",10));
	    Normalize normalize = new Normalize();
	
    	DateDictionary n2 = normalize.solution(d3);
	
    	assertEquals(15,n2.getValue("2019-01-12"));
    	
	}
	
	}