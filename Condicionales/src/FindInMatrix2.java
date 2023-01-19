
public class FindInMatrix2 {

	public static void main(String[] args) {
		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		LABEL_EXTERNO: for (int i = 0; i < list.length; i++) {
			LABEL_INTERNO: for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("PASO: x:"+i+" y:"+j);
					break LABEL_INTERNO;
					//continue LABEL_EXTERNO; //[2,0]
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}
}
