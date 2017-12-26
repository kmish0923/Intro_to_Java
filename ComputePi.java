public class ComputePi {
	public static void main(String[] args) {
		double formula1 = 4.00*(1-(1.00/3.00)+(1.00/5.00)-(1.00/7.00)+(1.00/9.00)-(1.00/11.00));
		double formula2 = 4.00*(1-(1.00/3.00)+(1.00/5.00)-(1.00/7.00)+(1.00/9.00)-(1.00/11.00)+(1/13.00));

		System.out.println("\n Pi approx 1: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = "+piAppx1);
		System.out.println("\n Pi approx 2: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = "+piAppx2);
	}
} 