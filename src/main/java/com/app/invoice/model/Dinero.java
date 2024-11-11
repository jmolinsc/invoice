package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
public class Dinero implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "BENEFICIARIONOMBRE", length = 100, nullable = true)
	@JsonView
	String beneficiarionombre;

	@Column(name = "CONTID", nullable = true)
	@JsonView
	Integer contid;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHACANCELACION", nullable = true)
	@JsonView
	Date fechacancelacion;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHACONCLUSION", nullable = true)
	@JsonView
	Date fechaconclusion;

	@Column(name = "MOVID", length = 20, nullable = true)
	@JsonView
	String movid;

	@Column(name = "USUARIO", length = 10, nullable = true)
	@JsonView
	String usuario;

	@Column(name = "CONTACTOTIPO", length = 50, nullable = true)
	@JsonView
	String contactotipo;

	@Column(name = "POLIZA", length = 20, nullable = true)
	@JsonView
	String poliza;

	@Column(name = "CORTE", nullable = true)
	@JsonView
	Integer corte;

	@Column(name = "TICKETINICIO", length = 200, nullable = true)
	@JsonView
	String ticketinicio;

	@Column(name = "TICKETFINAL", length = 200, nullable = true)
	@JsonView
	String ticketfinal;

	@Column(name = "IDAPERTURA", nullable = true)
	@JsonView
	Integer idapertura;

	@Column(name = "APERTURAORIGEN", nullable = true)
	@JsonView
	Integer aperturaorigen;

	@Column(name = "MOV", length = 20, nullable = true)
	@JsonView
	String mov;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "ULTIMOCAMBIO", nullable = true)
	@JsonView
	Date ultimocambio;

	@Column(name = "ESTATUS", length = 15, nullable = true)
	@JsonView
	String estatus;

	@Column(name = "ORIGENTIPO", length = 10, nullable = true)
	@JsonView
	String origentipo;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAEMISION", nullable = true)
	@JsonView
	Date fechaemision;

	@Column(name = "OBSERVACIONES", length = 250, nullable = true)
	@JsonView
	String observaciones;

	@Column(name = "EJERCICIO", nullable = true)
	@JsonView
	Integer ejercicio;

	@Column(name = "CONTABILIZAR", nullable = true)
	@JsonView
	Integer contabilizar;

	@Column(name = "REIMPRESION", nullable = true)
	@JsonView
	Integer reimpresion;

	@Column(name = "ISCOPY", nullable = true)
	@JsonView
	Integer iscopy;

	@Column(name = "REFERENCIA", length = 100, nullable = true)
	@JsonView
	String referencia;

	@Column(name = "ORIGENID", length = 20, nullable = true)
	@JsonView
	String origenid;

	@Column(name = "POLIZAID", length = 20, nullable = true)
	@JsonView
	String polizaid;

	@Column(name = "COMENTARIOS", length = 255, nullable = true)
	@JsonView
	String comentarios;

	@Column(name = "CENTRODECOSTOS", length = 20, nullable = true)
	@JsonView
	String centrodecostos;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "IMPORTEORIGINAL", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal importeoriginal;

	@Column(name = "SALDO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal saldo;

	@Column(name = "ORIGEN", length = 20, nullable = true)
	@JsonView
	String origen;

	@Column(name = "PERIODO", nullable = true)
	@JsonView
	Integer periodo;

	@Column(name = "PACIENTE", length = 20, nullable = true)
	@JsonView
	String paciente;

	@Column(name = "PACIENTENOMBRE", length = 100, nullable = true)
	@JsonView
	String pacientenombre;

	@Column(name = "IDINGRESO", length = 20, nullable = true)
	@JsonView
	String idingreso;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHAREGISTRO", nullable = true)
	@JsonView
	Date fecharegistro;

	@Column(name = "VALORTOTAL", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal valortotal;

	@Column(name = "TIPODOCUMENTO", length = 100, nullable = true)
	@JsonView
	String tipodocumento;

	@Column(name = "NUMERODOCUMENTO", length = 100, nullable = true)
	@JsonView
	String numerodocumento;

	@Column(name = "SERIE", length = 20, nullable = true)
	@JsonView
	String serie;

	@Column(name = "PROCEDIMIENTO", length = 100, nullable = true)
	@JsonView
	Integer procedimiento;

	@Column(name = "IDENLACEWOMPI", nullable = true)
	@JsonView
	Integer idenlacewompi;

	@OneToMany(mappedBy = "dinero", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Dinerod> dinerods;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE")
	Cte cte;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CTADINERODESTINO", referencedColumnName = "CTADINERO")
	Ctadinero ctadineroByctadinerodestino;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CTADINERO", referencedColumnName = "CTADINERO")
	Ctadinero ctadineroByctadinero;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
	Formapago formapago;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "PROVEEDOR", referencedColumnName = "PROVEEDOR")
	Prov prov;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
	Concepto concepto;

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
