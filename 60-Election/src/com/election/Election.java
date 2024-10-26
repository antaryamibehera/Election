package com.election;

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {

		int bjd = 0;
		int bjp = 0;
		int congress = 0;
		int nota = 0;

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please Enter the Number of Voters : ");
		int voters = sc1.nextInt();

		for (int i = 1; i <= voters; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--------------------------------------------");
			System.out.println("Enter the Parties name :");
			String partyname = sc.nextLine();

			String a = "BJD";
			String b = "BJP";
			String c = "CONGRESS";
			String d = "NOTA";

			String e = "correct";

			if (partyname.equalsIgnoreCase(a)) {
				System.out.println("Selected party name :" + partyname);
				bjd++;
				System.out.println("Total BJD Seat is -->" + bjd);
			} else {
				if (partyname.equalsIgnoreCase(b)) {
					System.out.println("Selected party name :" + partyname);
					bjp++;
					System.out.println("Total BJP Seat is --> " + bjp);
				} else {
					if (partyname.equalsIgnoreCase(c)) {
						System.out.println("Selected party name :" + partyname);
						congress++;
						System.out.println("Total Congress seat is --> " + congress);
					} else if (partyname.equalsIgnoreCase(d)) {
						System.out.println("You are not giving vote to any party You choose NOTA ");
						nota++;
						System.out.println("Total Nota votes are ---> " + nota);
					} else {
						System.out.println("You are not Press any Button");
					}
				}
			}

			Scanner opinion = new Scanner(System.in);
			System.out.println("Enter the opinion of voters : correct / incorrect-->");
			String op = opinion.nextLine();
			if (op.equalsIgnoreCase(e)) {
				System.out.println("Casteing vote is successfully");
			} else {
				if (partyname.equalsIgnoreCase(a)) {

					bjd--;
					System.out.println("After removing wrong BJD votes are :" + bjd);

				} else if (partyname.equalsIgnoreCase(b)) {
					bjp--;
					System.out.println("After removing wrong BJP votes are :" + bjp);

				} else if (partyname.equalsIgnoreCase(c)) {
					congress--;
					System.out.println("After removing wrong CONGRESS votes are :" + congress);

				} else if (partyname.equalsIgnoreCase(d)) {
					nota--;
					System.out.println("After removing wrong NOTA votes are :" + nota);

				}
			}
		}

		System.out.println();
		System.out.println("Winner Party Name is in below ");
		if (bjd > bjp && bjd > congress) {
			System.out.println("BJD IS WINNER in :" + bjd);
		} else if (bjp > bjd && bjp > congress) {
			System.out.println("BJP IS WINNER in :" + bjp);
		} else if (congress > bjp && congress > bjd) {
			System.out.println("CONGRESS IS WINEER in : " + congress);
		} else {
			System.out.println("Election is tied once again cast your vote");
		}

		System.out.println("Leading votes :-->");
		if (bjd > bjp || bjd > congress) {
			int leadOfBjd = bjd - bjp;
			int leadofBJD = bjd - congress;
			System.out.println("Leading of BJD vote from BJP is : " + leadOfBjd + " & "
					+ "Leading of BJD vote from CONGRESS is : " + leadofBJD);
		} else if (bjp > bjd || bjp > congress) {
			int leadofBjp = bjp - bjd;
			int leadOfBJP = bjp - congress;
			System.out.println("Leading of BJP vote from BJD is : " + leadofBjp + " & "
					+ "Leading of BJP vote from CONGRESS is : " + leadOfBJP);
		} else {
			int leadofCongress = congress - bjd;
			int leadOfCongress = congress - bjp;
			System.out.println("Leading of Congress vote from BJD is " + leadofCongress + " & "
					+ "Leading of Congress vote from BJP is : " + leadOfCongress);
		}

		System.out.println();
		System.out.println("Total votes achived By Party are in below :");
		System.out.println("BJD : " + bjd);
		System.out.println("BJP : " + bjp);
		System.out.println("CONGRESS : " + congress);
		System.out.println("NOTA : " + nota);

	}
}