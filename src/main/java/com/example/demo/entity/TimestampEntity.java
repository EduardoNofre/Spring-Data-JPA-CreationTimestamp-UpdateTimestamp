package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TimestampTab")
public class TimestampEntity { 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_Timestamp.", example = "123", required = true)
	@Column(name = "id_Timestamp", length = 9)
	private Integer id_Timestamp;

	@Schema(description = "aula.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "aula", length = 100)
	private String aula;

	@CreationTimestamp
	@Schema(description = "Data Cadastro.", example = "yyyy-MM-DDTHH:MM:SS.ZZZZ", required = true)
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime DataCadastro;

	@UpdateTimestamp
	@Schema(description = "Data Atualização.", example = "yyyy-MM-DDTHH:MM:SS.ZZZZ", required = true)
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime DataAtualização;

}
