import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class main2 {
	public static void main(String[] args) throws FileNotFoundException {
		double number[] = {0, 0, 0, 0};
		boolean is[] = new boolean[4];
		
		Scanner cnsl = new Scanner(System.in);
		System.out.println("Enter the city name and number of times: (E.g.: NewYorkCity 4 LosAngeles 1 Chicago 2)");
		String ans = cnsl.nextLine();
		cnsl.close();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> times = new ArrayList<Double>();
		
		Scanner in = new Scanner(ans);
		while (in.hasNext()) {
			names.add(in.next());
			times.add(Double.parseDouble(in.next()));
		}
		in.close();
		//System.out.println(times.get(0));
		if (names.size() == times.size()) {
			for (int i = 0; i < names.size(); i++) {
				String name = names.get(i).toLowerCase();
				if (name.equals("newyorkcity")) {
					is[0] = true;
					number[0] = times.get(i);
				} else if (name.equals("chicago")) {
					is[1] = true;
					number[1] = times.get(i);
				} else if (name.equals("boston")) {
					is[2] = true;
					number[2] = times.get(i);
				} else if (name.equals("losangeles")) {
					is[3] = true;
					number[3] = times.get(i);
				}
			}

			//print out answer
			for (int j = 0; j < 4; j++) {
				//System.out.println("HERE");
				if (is[j] == true) {
					for (int k = 0; k < names.size(); k++) {
						if (names.get(k).toLowerCase().equals("newyorkcity")) {
							System.out.println("New York City: ");
							System.out.println("- Adorama: $" + (times.get(k) * 4852.12));
							System.out.println("- CSI: $" + (times.get(k) * 5013.37));
						} else if (names.get(k).toLowerCase().equals("chicago")) {
							System.out.println("Chicago: ");
							System.out.println("- Progear: $" + (times.get(k) * 3629.0));
						} else if (names.get(k).toLowerCase().equals("boston")) {
							System.out.println("Boston: ");
							System.out.println("- Rule Camera: $" + (times.get(k) * 5852.0));
						} else if (names.get(k).toLowerCase().equals("losangeles")) {
							System.out.println("Los Angeles: ");
							System.out.println("- Cinema Cameras: $" + (times.get(k) * 4296));
							System.out.println("- Samy's: $" + (times.get(k) * 3765));
						}
					}
				} 
			}
		}
		
		
	}
}
