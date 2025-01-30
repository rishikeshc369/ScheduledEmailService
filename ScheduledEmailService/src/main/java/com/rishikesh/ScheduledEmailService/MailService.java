package com.rishikesh.ScheduledEmailService;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * Hello world!
 *
 */
public class MailService 
{
    public static void main( String[] args )
    {
    	String recipient = "";
    	final String sender = "";
    	final String pwd = "";
    	Properties property = System.getProperties();
    	property.put("mail.smtp.auth", true);
    	property.put("mail.smtp.starttls.enable", true);
    	property.put("mail.smtp.host", "smtp.gmail.com");
    	property.put("mail.smtp.port", "587");
    	
    	Session session = Session.getInstance(property, new Authenticator() {
    		protected PasswordAuthentication getPasswordAuthentication() {
    			return new PasswordAuthentication(sender, pwd);
    		}
    	});
    	try {
    		MimeMessage msg = new MimeMessage(session);
    		msg.setFrom(new InternetAddress(sender));
    		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
    		msg.setSubject("Hurrah!! open it open...");
    		msg.setText("This is my project's first mail to test its Functionality.");
    		Transport.send(msg);
    		System.out.println("Mailed successfully.");
    	}
    	catch (MessagingException msg) {
    		msg.printStackTrace();
    	}
    
    
    }
}
