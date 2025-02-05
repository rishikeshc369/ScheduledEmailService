package com.Rishikesh.EmailEntity;

import com.Rishikesh.EmailService.EmailService;

public class Constants {

	public static final String smtpHost = "smtp.gmail.com";
	public static final String smtpPort = "587";
	public static final String emailSenderId = "rishikesh212c@gmail.com";
	public static final String emailSenderPassword = "kvob efob bosf xybx";
	public static String emailRecipientId;
	public static String emailCCId = "rishikeshc369@gmail.com";
	public static String emailSubject;
	public static String emailBody;
	public static String emailStatus = "failed to send.";
	
	public static void sendCelebrantDetails(Employee emp) {
			
			String name = emp.getName();
			emailRecipientId = emp.getEmail();
			emailSubject = "Birthday Wish";
			emailBody = "Many more Happy returns of the day "+name+", may all blessings and prosperity comes to you. :)";
			EmailService.sendBirthdayWish(emailRecipientId, emailSubject, emailBody);
		}
	
	public static final String dbURL = "jdbc:postgresql://localhost:5454/rishi";
	public static final String dbUser = "postgres";
	public static final String dbPassword = "psql";

}
