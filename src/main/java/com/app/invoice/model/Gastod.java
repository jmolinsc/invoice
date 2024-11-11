package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
public class Gastod implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "IMPUESTO1", nullable = true)
	@JsonView
	BigDecimal impuesto1;

	@Column(name = "ACREEDORREF", length = 10, nullable = true)
	@JsonView
	String acreedorref;

	@Column(name = "LIBROIVA", nullable = true)
	@JsonView
	Integer libroiva;

	@Column(name = "CANTIDAD", nullable = true)
	@JsonView
	BigDecimal cantidad;

	@Column(name = "PRECIO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal precio;

	@Column(name = "EXENTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal exento;

	@Column(name = "NOSUJETO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal nosujeto;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHA", nullable = true)
	@JsonView
	Date fecha;

	@Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal impuestos;

	@Column(name = "TIPOIMPUESTO", length = 10, nullable = true)
	@JsonView
	String tipoimpuesto;

	@Column(name = "REFERENCIA", length = 50, nullable = true)
	@JsonView
	String referencia;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "TOTAL", scale = 6, precision = 18, nullable = true)
	@JsonView
	BigDecimal total;

	@Column(name = "DESCRIPCIONEXTRA", length = 100, nullable = true)
	@JsonView
	String descripcionextra;

	@Column(name = "RENGLON", nullable = false)
	@JsonView
	Integer renglon;

	@Column(name = "ISCOPY", length = 20, nullable = true)
	@JsonView
	Integer iscopy;

	@Column(name = "TIPODOCUMENTO", length = 50, nullable = true)
	@JsonView
	String tipodocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "CONCEPTO", referencedColumnName = "CONCEPTO")
	Conceptogastos conceptogastos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "CENTROCOSTOS", referencedColumnName = "CENTROCOSTOS")
	Centrocostos centrocostos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Gasto gasto;

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(" no se puede duplicar");
		}
		return obj;
	}
}
