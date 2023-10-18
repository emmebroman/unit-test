package com.arcada.bromanem.app;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

public class FacebookFriendFinderTest {

	
	@Test
	
	//Positive test case
	
	 public void testGetFriendNames() {
        FacebookFriendFinder analyzer = new FacebookFriendFinder();

     
        String[] testLinks = {
            "https://www.facebook.com/person1"
   
        };

        String[][] expectedFriendNames = {
            {"Friend1A", "Friend1B", "Friend1C"}
        
        };

        for (int i = 0; i < testLinks.length; i++) {
            String[] actualNames = analyzer.getFriendNames(testLinks[i]);
            assertArrayEquals(expectedFriendNames[i], actualNames); 
        }
    }
	
	@Test 
	
	//Positive test case
	
	 public void testGetFriendNames2() {
        FacebookFriendFinder analyzer = new FacebookFriendFinder();

     
        String[] testLinks = {
            "https://www.facebook.com/person2"
   
        };

        String[][] expectedFriendNames = {
            {"Friend2A", "Friend2B"}
        
        };

        for (int i = 0; i < testLinks.length; i++) {
            String[] actualNames = analyzer.getFriendNames(testLinks[i]);
            assertArrayEquals(expectedFriendNames[i], actualNames); 
        }
    }
	
	@Test 
	
	//Negative test case
	
	 public void testGetFriendNamesFalse() {
        FacebookFriendFinder analyzer = new FacebookFriendFinder();

     
        String[] testLinks = {
            "https://www.facebook.com/person" //A Non excisting link
   
        };

        String[][] expectedFriendNames = {
            {"Friend2A", "Friend2B"} //Should return null
        
        };

        for (int i = 0; i < testLinks.length; i++) {
            String[] actualNames = analyzer.getFriendNames(testLinks[i]);
            assertArrayEquals(expectedFriendNames[i], actualNames); 
        }
    }
	
	@Test 
	
	//Negative test case
	
	 public void testGetFriendNamesFalse2() {
        FacebookFriendFinder analyzer = new FacebookFriendFinder();

     
        String[] testLinks = {
            "https://www.facebook.com/person1" 
   
        };

        String[][] expectedFriendNames = {
            {"Friend2A", "Friend2B"} //Expected outcome wrong
        
        };

        for (int i = 0; i < testLinks.length; i++) {
            String[] actualNames = analyzer.getFriendNames(testLinks[i]);
            assertArrayEquals(expectedFriendNames[i], actualNames); 
        }
    }
	
	
	
	


}
