package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args){
		Set<String> words = new TreeSet<String>(); // HashSet implements Set
		long totalTime = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
			System.out.println(words);
			System.out.println(totalTime);
}
}
}
