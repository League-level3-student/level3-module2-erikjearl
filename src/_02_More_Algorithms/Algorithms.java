package _02_More_Algorithms;

import java.lang.reflect.Array;
import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> egg) {
		for(int i = 0; i < egg.size(); i++) {
			if(egg.get(i).equals("cracked"))
					return i;
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> egg) {
		int count = 0;
		for(int i = 0; i < egg.size(); i++) {
			if(egg.get(i))
				count++;
		}
		return count;
	}
	
	public static double findTallest(List<Double> egg) {
		Double big = egg.get(0);
		for(int i = 1; i < egg.size(); i++) {
			if(egg.get(i) > big)
				big = egg.get(i);
		}
		return big;
	}
	
	public static String findLongestWord(List<String> egg) {
		int big = 0;
		for(int i = 1; i < egg.size(); i++) {
			if(egg.get(i).length() > egg.get(big).length())
				big = i;
		}
		return egg.get(big);
	}
	
	public static boolean containsSOS(List<String> egg) {
		for(int i = 0; i < egg.size(); i++) {
			if(egg.get(i).equals(" ... --- ... "))
				return true;
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> egg) {
		for(int i = 0; i < egg.size() - 1; i++) {
			for(int j = 0; j < egg.size() - i - 1; j++) {
				if(egg.get(j) > egg.get(j+1)) {
					Double temp = egg.get(j);
					egg.set(j, egg.get(j+1));
					egg.set(j+1,temp);
				}
			}
		}
		return egg;
	}
	
	public static List<String> sortDNA(List<String> egg) {
		for(int i = 0; i < egg.size() - 1; i++) {
			for(int j = 0; j < egg.size() - i - 1; j++) {
				if(egg.get(j).length() > egg.get(j+1).length()) {
					String temp = egg.get(j);
					egg.set(j, egg.get(j+1));
					egg.set(j+1, temp);
				}
			}
		}
		return egg;
	}
	public static List<String> sortWords(List<String> egg) {
		for(int i = 0; i < egg.size() - 1; i++) {
			for(int j = 0; j < egg.size() - i - 1; j++) {
				if(egg.get(j).compareTo(egg.get(j+1)) > 0) {
					String temp = egg.get(j);
					egg.set(j, egg.get(j+1));
					egg.set(j+1, temp);
				}
			}
		}
		return egg;
	}
	
}
