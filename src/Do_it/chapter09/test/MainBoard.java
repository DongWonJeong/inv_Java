package Do_it.chapter09.test;

import Do_it.chapter09.gamelevel.AdvancedLevel;
import Do_it.chapter09.gamelevel.Player;
import Do_it.chapter09.gamelevel.SuperLevel;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
}
