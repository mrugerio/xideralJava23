
public class Principal {

	public static void main(String[] args) {

		int dayOfWeek = 8;
		switch (dayOfWeek) {

		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Weekday");

			// case 0: System.out.println("Sunday");;;;;; break; case 6:
			// System.out.println("Saturday");;;;;break;default:System.out.println("Weekday");

		}
	}

}
