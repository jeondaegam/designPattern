package Encapsulation;

public class Paperboy {
    // 신문 배달부 예제를 통해 캡슐화 해보기
    // 신문 배달부가 고객에게 요금을 받아가는 상황

    // 1. 고객에게 요금을 받기 위한 코드 (안좋은 코드)
/*
    int payment = 10000;
    Wallet wallet = costomer.getWallet();
    if (wallet.getTotalMoney() >= payment) {
        wallet.substractMoney(payment);
    } else {
        ... // 위 코드는 신문배달부가 고객의 지갑을 꺼내 직접 돈을 확인한 뒤 가져가는 것과 같다.
    }
*/
    // 3. 지갑을 뒤지지 않고 요금만 받는 코드로 수정한다.
    int payment = 10000;
    try{
        int paidAmount = customer.getPayment(payment);
    }catch(NotEnoughMoneyException ex){
        // 다음에 요금 받으러 오는 처리
    }


}

// 고객
class Customer {

    private Wallet wallet;
    public Wallet getWallet() {
        return wallet;
    }

    // 2. 고객이 직접 돈을 지불하는 코드 (좋은 코드)
    public int getPayment(int payment) {
        if (wallet == null) {
            throw new NotEnoughMoneyException();
        }
        if (wallet.getTotalMoney() >= payment) {
            return payment;
        }
        throw new NotEnoughMoneyException();
    }
}


// 지갑
class Wallet {

    private int money;
    public int getTotalMoney() {
        return money;
    }

    public void substractMoney(int debit) {
        money -= debit;
    }
}
