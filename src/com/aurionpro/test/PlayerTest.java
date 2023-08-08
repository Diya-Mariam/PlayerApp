package com.aurionpro.test;

import java.util.Scanner;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PlayerTest {

	public static void main(String[] args) {

		ArrayList<Player> arr = new ArrayList<Player>();
		arr.add(new Player(101, "Anoop", 100, 5, 3, "Indonesia"));
		arr.add(new Player(102, "Ramesh", 51, 6, 4, "Indonesia"));
		arr.add(new Player(103, "Renju", 72, 3, 6, "Indonesia"));
		arr.add(new Player(104, "Alfred", 53, 5, 13, "Ireland"));
		arr.add(new Player(105, "Daniel", 64, 8, 9, "Ireland"));
		arr.add(new Player(106, "Thomas", 35, 15, 8, "Ireland"));
		arr.add(new Player(107, "Hari", 16, 7, 19, "USA"));
		arr.add(new Player(108, "Joel", 87, 11, 7, "USA"));
		arr.add(new Player(109, "Noel", 18, 25, 2, "USA"));

		findingThePlayerWithHighestScore(arr);
		findingThePlayerWithHighestWicket(arr);

		ArrayList<Player> arr1 = new ArrayList<Player>();

		arr1.add(new Player(101, "Anoop", 100, 5, 3, "Indonesia"));
		arr1.add(new Player(102, "Ramesh", 51, 6, 4, "Indonesia"));
		arr1.add(new Player(103, "Renju", 72, 3, 6, "Indonesia"));
		

		ArrayList<Player> arr2 = new ArrayList<Player>();

		arr2.add(new Player(104, "Alfred", 53, 5, 13, "Ireland"));
		arr2.add(new Player(105, "Daniel", 64, 8, 9, "Ireland"));
		arr2.add(new Player(106, "Thomas", 35, 15, 8, "Ireland"));

		ArrayList<Player> arr3 = new ArrayList<Player>();

		arr3.add(new Player(107, "Hari", 16, 7, 19, "USA"));
		arr3.add(new Player(108, "Joel", 87, 11, 7, "USA"));
		arr3.add(new Player(109, "Noel", 18, 25, 2, "USA"));
		
		findingHighestRunsScorerFromEachCountry(arr1, arr2, arr3);
		
		sumOfAllRunsInEachCountry(arr1, arr2, arr3);
		sumOfAllWicketsInEachCountry(arr1, arr2, arr3);
		
//		Player[] obj = { new Player(101, "Anoop", 100, 5, 3, "Indonesia"),
//		new Player(102, "Ramesh", 51, 6, 4, "Indonesia"), 
//		new Player(103, "Renju", 72, 3, 6, "Indonesia"),
//		new Player(104, "Alfred", 53, 5, 13, "Ireland"), 
//		new Player(105, "Daniel", 64, 8, 9, "Ireland"),
//		new Player(106, "Thomas", 35, 15, 8, "Ireland"), 
//		new Player(107, "Hari", 16, 7, 19, "USA"),
//		new Player(108, "Joel", 87, 11, 7, "USA"), 
//		new Player(109, "Noel", 18, 25, 2, "USA") };
//
//		ArrayList<Player> arr = new ArrayList<Player>();
//		arr.add(obj[0]);
//		arr.add(obj[1]);
//		arr.add(obj[2]);
//		arr.add(obj[3]);
//		arr.add(obj[4]);
//		arr.add(obj[5]);
//		arr.add(obj[6]);
//		arr.add(obj[7]);
//		arr.add(obj[8]);

//		System.out.println((arr1));

	}

	private static void sumOfAllWicketsInEachCountry(ArrayList<Player> arr1, ArrayList<Player> arr2, ArrayList<Player> arr3) {

		double sumOfWicketFromIndonesia=0;
		
		Iterator<Player> itr = arr1.iterator();
		
		Player wicket;
		
		while(itr.hasNext())
		{
			wicket = itr.next();
			sumOfWicketFromIndonesia += wicket.wickets;
		}
		
		System.out.println("\nThe sum of wickets from Indonesia is "+sumOfWicketFromIndonesia);
		
		double sumOfWicketFromIreland=0;
		
		Iterator<Player> itr1 = arr2.iterator();
		
		Player wicket1;
		
		while(itr1.hasNext())
		{
			wicket1 = itr1.next();
			sumOfWicketFromIreland += wicket1.wickets;
		}
		
		System.out.println("\nThe sum of wickets from Ireland is "+sumOfWicketFromIreland);
		
		double sumOfWicketFromUSA=0;
		
		Iterator<Player> itr2 = arr3.iterator();
		
		Player wicket2;
		
		while(itr2.hasNext())
		{
			wicket = itr2.next();
			sumOfWicketFromUSA += wicket.wickets;
		}
		
		System.out.println("\nThe sum of wickets from Ireland is "+sumOfWicketFromUSA);
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");
		
	}

	private static void sumOfAllRunsInEachCountry(ArrayList<Player> arr1, ArrayList<Player> arr2, ArrayList<Player> arr3) {

		double sumOfRunsFromIndonesia=0;
		
		Iterator<Player> itr = arr1.iterator();
		
		Player run;
		
		while(itr.hasNext())
		{
			run = itr.next();
			sumOfRunsFromIndonesia += run.runs;
		}
		
		System.out.println("\nThe sum of runs from Indonesia is "+sumOfRunsFromIndonesia);
		
		double sumOfRunsFromIreland=0;
		
		Iterator<Player> itr1 = arr2.iterator();
		
		Player run1;
		
		while(itr1.hasNext())
		{
			run1 = itr1.next();
			sumOfRunsFromIreland += run1.runs;
		}
		
		System.out.println("\nThe sum of runs from Ireland is "+sumOfRunsFromIreland);
		
		double sumOfRunsFromUSA=0;
		
		Iterator<Player> itr2 = arr3.iterator();
		
		Player run2;
		
		while(itr2.hasNext())
		{
			run2 = itr2.next();
			sumOfRunsFromUSA += run2.runs;
		}
		
		System.out.println("\nThe sum of runs from Ireland is "+sumOfRunsFromUSA);
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");

	}

	private static void findingHighestRunsScorerFromEachCountry(ArrayList<Player> arr1, ArrayList<Player> arr2, ArrayList<Player> arr3) {

		Player highestRunsScorerFromIndonesia = arr1
			      .stream()
			      .max(Comparator.comparing(Player::getRuns))
			      .orElseThrow(NoSuchElementException::new);
		
		
		System.out.println("\nHighest runs scorer in Indonesia is "+highestRunsScorerFromIndonesia);
		
		Player highestRunsScorerFromIreland = arr2
			      .stream()
			      .max(Comparator.comparing(Player::getRuns))
			      .orElseThrow(NoSuchElementException::new);
		
		
		System.out.println("\nHighest runs scorer in Indonesia is "+highestRunsScorerFromIreland);
		
		Player highestRunsScorerFromUSA = arr3
			      .stream()
			      .max(Comparator.comparing(Player::getRuns))
			      .orElseThrow(NoSuchElementException::new);
		
		
		System.out.println("\nHighest runs scorer in Indonesia is "+highestRunsScorerFromUSA);
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");
	}

	private static void findingThePlayerWithHighestWicket(ArrayList<Player> arr) {

		// sorting in ascending order based on runs

		Collections.sort(arr, new Comparator<Player>() {
			public int compare(Player p1, Player p2) {
				return Integer.valueOf(p1.wickets).compareTo(p2.wickets);

			}
		});

		System.out.println("Array sorted based on wickets: \n");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("\nThe player with the highest wickets is " + arr.get(8));
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");

	}

	private static void findingThePlayerWithHighestScore(ArrayList<Player> arr) {

		// sorting in ascending order based on runs

		Collections.sort(arr, new Comparator<Player>() {
			public int compare(Player p1, Player p2) {
				return Integer.valueOf(p1.runs).compareTo(p2.runs);

			}
		});

		System.out.println("Array sorted based on runs: \n");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("\nThe player with the highest score is " + arr.get(8));
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");

	}
	
	

}
