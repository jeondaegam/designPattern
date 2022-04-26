//package AbstractFactory;
//
//public class EasyStageEnemyFactory extends EnemyFactory {
//    @Override
//    public Boss createBoss() {
//        return new StrongAttackBoss();
//    }
//
//    @Override
//    public smallFlight createSmallFlight() {
//        return new DashSmallFlight();
//    }
//
//    @Override
//    public Obstacle createObstacle() {
//        return new RockObstacle();
//    }
//
//    public class HardEnemyFactory extends EnemyFactory{
//
//        @Override
//        public Boss createBoss() {
//            return new CloningAttackBoss();
//        }
//
//        @Override
//        public smallFlight createSmallFlight() {
//            return MissileSmallFlight();
//        }
//
//        @Override
//        public Obstacle createObstacle() {
//            return BombObstacle();
//        }
//    }
//}
