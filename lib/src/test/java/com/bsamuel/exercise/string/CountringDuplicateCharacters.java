/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bsamuel.exercise.string;

import org.junit.Test;

import com.bsamuel.exercise.string.CountingDuplicateCharacters;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CountringDuplicateCharacters {
    @Test 
    public void testCountDuplicateCharacters1() {
    	CountingDuplicateCharacters cDC = new CountingDuplicateCharacters();
    	Map result1 = cDC.countDuplicateCharacters1("dsfadsljdasfjkldflkj");
    	Map<Character, Integer> result2 = new HashMap<Character, Integer>();
    	result2.put('a', 2);
    	result2.put('s', 3);
    	result2.put('d', 4);
    	result2.put('f', 3);
    	result2.put('j', 3);
    	result2.put('k', 2);
    	result2.put('l', 3);
    
    
    	
    	assertEquals(result1, result2);
    	
    }
}
