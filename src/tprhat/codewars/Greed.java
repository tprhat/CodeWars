package tprhat.codewars;

import java.util.HashMap;
import java.util.Map.Entry;

public class Greed {
	
	public static int greedy(int[] dice) {
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < dice.length; i++) {
			if(map.containsKey(dice[i])) {
				map.put(dice[i], map.get(dice[i])+1);
			}
			else {
				map.put(dice[i], 1);
			}
		}
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			int x = entry.getKey();
			int y = entry.getValue();
			if(y >= 3) {
				if(x == 1) {
					sum += 1000;
				}
				else if(x == 2) {
					sum += 200;
				}
				else if(x == 3) {
					sum += 300;
				}
				else if(x == 4) {
					sum += 400;
				}
				else if(x == 5) {
					sum += 500;
				}
				else if(x == 6) {
					sum += 600;
				}
				y -= 3;
			}
			while(y != 0) {
				if( x == 1)
					sum+= 100;
				else if(x == 5)
					sum += 50;
				y--;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(greedy(new int[]{5,1,3,4,1}));
		System.out.println(greedy(new int[]{1,1,1,3,1}));
		System.out.println(greedy(new int[]{2,4,4,5,4}));

	}

}
