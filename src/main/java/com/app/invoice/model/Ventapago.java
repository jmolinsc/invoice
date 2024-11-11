package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Ventapago implements Serializable {

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

	@Column(name = "REFERENCIA", length = 20, nullable = true)
	@JsonView
	String referencia;

	@Column(name = "IDAPERTURA", nullable = true)
	@JsonView
	Integer idapertura;

	@Column(name = "IMPORTE", nullable = true)
	@JsonView
	BigDecimal importe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore

	@JoinColumn(name = "IDVENTA", referencedColumnName = "ID")
	Venta venta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
	Formapago formapago;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
//	@JoinColumn(name = "CTADINERO", referencedColumnName = "CTADINERO")
//	Ctadinero ctadinero;

}
