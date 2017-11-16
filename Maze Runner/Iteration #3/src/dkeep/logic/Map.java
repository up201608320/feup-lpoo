package dkeep.logic;

import java.util.ArrayList;

public class Map extends GameMap {

	public Map(char[][] map) {

		this.map = new char[map.length][map[0].length];
		ogres = new ArrayList<Ogre>();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {

				if (map[i][j] == 'H' || map[i][j] == 'A') {
					this.map[i][j] = ' ';
					hero = new Hero(j, i, map[i][j]);
				}

				else if (map[i][j] == 'G') {
					this.map[i][j] = ' ';
					guard = new Guard(j, i);
				} else if (map[i][j] == 'O') {
					this.map[i][j] = ' ';
					Ogre ogre = new Ogre(j, i);
					ogres.add(ogre);
				} else
					this.map[i][j] = map[i][j];
			}
		}
	}
}