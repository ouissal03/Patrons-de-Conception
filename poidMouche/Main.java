package poidMouche;

public class Main {
	
	    public static void main(String[] args) {
	        Flyweight enemy1 = EnemyFactory.getEnemy("circle", "red", 5);
	        Flyweight enemy2 = EnemyFactory.getEnemy("square", "blue", 3);
	        Flyweight enemy3 = EnemyFactory.getEnemy("triangle", "green", 8);

	        enemy1.render(10, 20);
	        enemy2.render(30, 40);
	        enemy3.render(50, 60);
	    }
	}

