package Day5;
enum GAME_DIFFICULTY {
	EASY,
	MEDIUM,
	HARD
}
public class Enumeration {

	public static void main(String[] args) {
		GAME_DIFFICULTY variable = GAME_DIFFICULTY.EASY;
		
		switch(variable) {
		case EASY:{
			System.out.println("You Have Selected Easy Game");
			break;
		}
		case MEDIUM:{
			System.out.println("You Have Selected Medium Game");
			break;
		}

		case HARD:{
			System.out.println("You Have Selected Hard Game");
			break;
		}
		}
	}

}


