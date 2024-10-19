package poidMouche;

import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {
    private static final Map<String, Flyweight> enemies = new HashMap<>();

    public static Flyweight getEnemy(String shape, String color, int speed) {
        String key = shape + color + speed;
        if (!enemies.containsKey(key)) {
            enemies.put(key, new Enemy(shape, color, speed));
        }
        return enemies.get(key);
    }
}

