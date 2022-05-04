#지양하자코드

### 연속된 get 메서드 호출
```java
value = someObject.getA().getB().getValue();

A a = someObject.getA();
B b = a.getB();
value = b.getValue();
```
- 이는 캡슐화를 악화시켜 코드 변경을 어렵게 만드는 원인이 될 수 있다.

### 상속(Inheritance)
기능을 확장해서 새로운 기능을 구현한다.