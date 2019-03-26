package com.alan.design.structural.bridge;

public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        // 核心代码 调用账号实现类的 具体方法
        // 从此 账号的业务代码修改 不会影响银行
        account.openAccount();
        return account;
    }
}
