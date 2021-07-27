package com.alan.design.creational.prototype;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/3/003 17:07
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name" + i);
            mailTemp.setEmailAddress("name" + i + "@163.com");
            mailTemp.setContent("恭喜你");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginalMailRecode(mail);
    }

}
