class TypeCasting6 {
	public static void main (String args[]) {
		
		// Type Casting
		int num = (int)(67.45f); 
		System.out.println(num);
		
		// automated type promotion in expression
		
		int a = 257;
		byte b = (byte)(a);
		System.out.println(b);
		
		
		byte p = 40 ;
		byte q = 50 ;
		byte r = 100 ;
		int s =  p * q / r ;
		
		System.out.println(s);
		
		// ASCII value
		int number = 'A';
		System.out.println(number);
		 
		byte d = 42;
		char e = 'a' ;
		short f = 1024;
		int g = 4000;
		float h = 4.79f;
		double j = 0.2345678;
		double result = ( h * d ) + (g / e) + (j * f);
		
		System.out.println(( h * d ) + " " + (g / e) + " " + (j * f));
		System.out.println(result);
		
	}
}