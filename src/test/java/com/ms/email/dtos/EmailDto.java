package com.ms.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {

	/* @NotBlank - Faz a validation. Se estiver com algum campo faltando, ele ira enviar uma bad request para o user*/
	@NotBlank 
	private String ownerRef;
	@NotBlank 
	@Email
	private String emailFrom;
	@NotBlank 
	@Email
	private String emailTo;
	@NotBlank 
	private String subject;
	@NotBlank 
	private String text;

}
