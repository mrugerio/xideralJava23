
public class Principal {

	public static void main(String[] args) {
		
		float f = 5.5f;
		
		long l = 3123456789L;
		
		long ll1 = 2_147_483_647;
		
		long ll2 = 2_147_483_648L;
		
		int int1 = (int)ll2;
		
		System.out.println(int1);
		
		long ll3 = 2_147_483_647;
		
		int int2 = (int)ll3;
		
		System.out.println(ll3);
		
		
		int int3 = 123;
		short short1 = (short)int3;
		System.out.println(short1);
		
		final int int4 = 123;
		short short2 = int4;
		System.out.println(short2);
		
		short short3 = 1;
		short short4 = 2;
		int i = short4 + short3;
		System.out.println(i);
		
		short short5 = 2;
		short short6 = 8;
		short5 = (short)(short5 + short6);
		System.out.println(short5);

		short short7 = 9;
		short short8 = 8;
		System.out.println(short7 += short8);
	}

}
