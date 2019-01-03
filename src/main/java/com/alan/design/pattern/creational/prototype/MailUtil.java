package com.alan.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/3/003 17:04
 **/
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2}，发送邮件";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginalMailRecode(Mail mail) {
        System.out.printf("存储originMail记录，originMail" + mail.getContent());
    }

}
