class LeapYear
{
	public static void main (String args[])
	{
		int year = 2024;
		
		if (year%400 == 0) {
			System.out.println("Leap Year");
		}
		else if (year%100 == 0) {
			System.out.println("Non Leap Year");
		}
		else if (year%4 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Non Leap Year");
		}
	}
}