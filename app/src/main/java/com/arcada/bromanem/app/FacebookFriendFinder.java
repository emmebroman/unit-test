package com.arcada.bromanem.app;



public class FacebookFriendFinder {
	

	
	 public String[] getFriendNames(String profileLink) {


	        if (profileLink.equals("https://www.facebook.com/person1")) {
	            return new String[]{"Friend1A", "Friend1B", "Friend1C"};
	        } else if (profileLink.equals("https://www.facebook.com/person2")) {
	            return new String[]{"Friend2A", "Friend2B"};
	        } else if (profileLink.equals("https://www.facebook.com/person3")) {
	            return new String[]{"Friend3A", "Friend3B", "Friend3C", "Friend3D"};
	        } else if (profileLink.equals("https://www.facebook.com/person4")) {
	            return new String[]{"Friend4A"};
	        } else if (profileLink.equals("https://www.facebook.com/person5")) {
	            return new String[]{"Friend5A", "Friend5B", "Friend5C"};
	        } else {
	            return new String[0];
	        }
	    }
	 }
