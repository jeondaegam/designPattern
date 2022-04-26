//package AbstractFactory;
//
//public abstract class EnemyFactory {
//
///*
//    boss, smallFlight, Obstacle 객체를 생성하는 메서드를 정의한다.
//    객체 생성 관련 메서드가 선언되어있는 추상 클래스로서 팩토리이다.
//    boss, smallFlight, Obstacle은 제품 타입이 된다.
//*/
//    public static EnemyFactory getFactory(int level) {
//
//        //
//        if(level==1)
//            return EasyStageEnemyFactory();
//        else
//            return HardEnemyFactory();
//    }
//
//    // 객체 생성을 위한 팩토리 메서드
//    public abstract Boss createBoss();
//    public abstract smallFlight createSmallFlight();
//    public abstract Obstacle createObstacle();
//
//
//}
