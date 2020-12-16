package tprhat.codewars;

public class ASum {
	public static long findNb(long m) {
		long br = 0;
		long sum = 0L;
		
		while(m > sum) {
			br++;
			sum += (long) Math.pow(br, 3);
		}
		if(m != sum) {
			return -1;
		}
		return br;
	}

	public static void main(String[] args) {
		System.out.println(findNb(4183059834009L));
		System.out.println(findNb(24723578342962L));
		System.out.println(findNb(135440716410000L));
		System.out.println(findNb(40539911473216L));
	}

}
