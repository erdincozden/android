package com.duckduckgo.mobile.android.util;

import java.util.HashSet;
import java.util.Set;

public class DDGControlVar {
	
	public static SCREEN START_SCREEN = SCREEN.SCR_NEWS_FEED;	// news feed
	
	public static boolean hasUpdatedFeed = false;
	public static String regionString = "wt-wt";	// world traveler (none) as default
	
	public static boolean sourceIconsCached = false;
	public static String sourceJSON = null;
	
	public static String targetSource = null; 
	
	public static boolean useDefaultSources = true;
	
	public static Set<String> readArticles = new HashSet<String>(); 
}