package com.Rishikesh.EmailService;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import com.Rishikesh.EmailEntity.*;

/**
 * Hello world!
 *
 */
public class EmailService {
	
	public static void sendBirthdayWish(String TO, String SUBJ, String BODY) {

		Properties property = System.getProperties();
		property.put("mail.smtp.auth", true);
		property.put("mail.smtp.starttls.enable", true);
		property.put("mail.smtp.host", Constants.smtpHost);
		property.put("mail.smtp.port", Constants.smtpPort);

		Session session = Session.getInstance(property, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Constants.emailSenderId, Constants.emailSenderPassword);
			}
		});
		try {
			
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(Constants.emailSenderId));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(Constants.emailRecipientId));
			
			msg.setSubject(Constants.emailSubject);
			msg.setText(Constants.emailBody);
			Transport.send(msg);
			Constants.emailStatus = " Sent mail Successfully";
			System.out.println(Constants.emailStatus);
		} catch (MessagingException msg) {
			System.out.println(Constants.emailStatus);
			msg.printStackTrace();
		}

	}
}
