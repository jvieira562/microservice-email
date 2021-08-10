package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;

import com.ms.email.enums.StatusEmail;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emailId; /**/
	private String ownerRef; /* ID do usuario pra quem vai ser enviado o email */
	private String emailFrom; /* Emissor do email */
	private String emailTo; /* Receptor do email */
	private String subject; /* O titulo do email */
	@Column(columnDefinition = "TEXT") /* Com essa anotação você pode inserir mais caracters no banco de dados */
	private String text; /* O corpo do email */
	private LocalDateTime sendDateEmail; /* Data de envio do email */
	private StatusEmail statusEmail; /* Status do email */

}
