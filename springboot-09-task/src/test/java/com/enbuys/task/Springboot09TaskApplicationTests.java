package com.enbuys.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot09TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {
        // 简单的Email发送
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("标题");
        mailMessage.setText("简单测试");

        mailMessage.setFrom("8709867@qq.com");
        mailMessage.setTo("2695884913@qq.com");
        javaMailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {
        // 复杂的Email发送，带附件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        helper.setSubject("标题");
        helper.setText("<div style='color:red;font-size:100px'>测试</div>",true);

        helper.setFrom("8709867@qq.com");
        helper.setTo("2695884913@qq.com");

        // 设置附件
        helper.addAttachment("1.jpg",new File("E:\\download\\QR.png"));
        javaMailSender.send(mimeMessage);
    }

}
