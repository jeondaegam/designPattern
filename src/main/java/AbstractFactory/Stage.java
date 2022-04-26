//package AbstractFactory;
//
//public class Stage {
//
//    private EnemyFactory enemyFactory;
//    private int ENEMY_COUNT;
//
//    public Stage(int level) {
//        enemyFactory = EnemyFactory.getFactory(level);
//    }
//
//    private void createEnemies() {
//        for (int i=0; i<=ENEMY_COUNT; i++) {
//            enemies[i] = enemyFactory.createSmallFlight();
//            boss = enemyFactory.createBoss();
//        }
//    }
//
//    private void createObstacle(){
//        for (int i=0; i<OBSTACLE_COUNT; i++) {
//            obstacle[i] = enemyFactory.createObstacle();
//        }
//
//    }
//}
//
