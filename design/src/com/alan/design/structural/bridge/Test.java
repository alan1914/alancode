package com.alan.design.structural.bridge;

public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        // 核心 调用账号抽象接口的 实现类
        Account icbcAcount = icbcBank.openAccount();
        icbcAcount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAcount2 = icbcBank2.openAccount();
        icbcAcount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }

}
