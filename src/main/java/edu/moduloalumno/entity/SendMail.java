package edu.moduloalumno.entity;

import lombok.Data;

@Data
public class SendMail {
	private String from;
	private String to;
	private String subject;
	private String body;
	private String datos;
	private String footer;
}
