package com.app.invoice.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movtiempo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "USUARIO", length = 20, nullable = true)
	@JsonView
	String usuario;

	@Column(name = "IDMOVIMIENTO", nullable = false)
	@JsonView
	Integer idmovimiento;

	@Column(name = "ESTATUS", length = 15, nullable = true)
	@JsonView
	String estatus;

	@Column(name = "MODULO", length = 5, nullable = false)
	@JsonView
	String modulo;

	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
	@Column(name = "FECHATERMINO", nullable = true)
	@JsonView
	Date fechatermino;

	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
	@Column(name = "FECHACOMENZO", nullable = true)
	@JsonView
	Date fechacomenzo;
}
