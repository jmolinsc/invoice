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
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "COMPRA")
public class Compra implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "FECHACANCELACION", nullable = true)
	@JsonView

	Date fechacancelacion;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "FECHACONCLUSION", nullable = true)
	@JsonView

	Date fechaconclusion;

	@Column(name = "MOVID", length = 20, nullable = true)
	@JsonView
	String movid;

	@Column(name = "USUARIO", length = 20, nullable = true)
	@JsonView
	String usuario;

	@Column(name = "POLIZA", length = 20, nullable = true)
	@JsonView
	String poliza;

	@Column(name = "GENERARPOLIZA", nullable = false)
	@JsonView
	Integer generarpoliza;

	@Column(name = "EJERCICIO", nullable = true)
	@JsonView
	Integer ejercicio;

	@Column(name = "MOV", length = 20, nullable = false)
	@JsonView
	String mov;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "ULTIMOCAMBIO", nullable = false)
	@JsonView

	Date ultimocambio;

	@Column(name = "ESTATUS", length = 15, nullable = true)
	@JsonView
	String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "VENCIMIENTO", nullable = true)
	@JsonView
	Date vencimiento;

	@Column(name = "SALDO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal saldo;

	@Column(name = "ORIGENTIPO", length = 10, nullable = true)
	@JsonView
	String origentipo;

	@Column(name = "PERIODO", nullable = true)
	@JsonView
	Integer periodo;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAEMISION", nullable = true)
	@JsonView
	Date fechaemision;

	@Column(name = "OBSERVACIONES", length = 250, nullable = true)
	@JsonView
	String observaciones;

	@Column(name = "DESCUENTOGLOBAL", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal descuentoglobal;

	@Column(name = "REFERENCIA", length = 50, nullable = true)
	@JsonView
	String referencia;

	@Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal impuestos;

	@Column(name = "ORIGENID", length = 20, nullable = true)
	@JsonView
	String origenid;

	@Column(name = "POLIZAID", length = 20, nullable = true)
	@JsonView
	String polizaid;

	@Column(name = "TIPOVENTA", length = 50, nullable = true)
	@JsonView
	String tipoventa;

	@Column(name = "TIPODOCUMENTO", length = 50, nullable = true)
	@JsonView
	String tipodocumento;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "DESCUENTOLINEAL", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal descuentolineal;

	@Column(name = "ORIGEN", length = 20, nullable = true)
	@JsonView
	String origen;

	@Column(name = "CONTID", nullable = true)
	@JsonView
	Integer contid;

	@Column(name = "ISCOPY", nullable = true)
	@JsonView
	Integer iscopy;

	@Column(name = "MODIFICAIMPUESTO", nullable = true)
	@JsonView
	Integer modificaimpuesto;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "FECHAREGISTRO", nullable = true)
	@JsonView
	Date fecharegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAREQUERIDA", nullable = false)
	@JsonView
	Date fecharequerida;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAENTREGA", nullable = false)
	@JsonView
	Date fechaentrega;

	@Column(name = "TIPOIMPUESTO", length = 30, nullable = true)
	@JsonView
	String tipoimpuesto;

	@Column(name = "AUTORIZADA", nullable = true)
	@JsonView
	Integer autorizada;

	@Column(name = "SOLICITANTE", length = 100, nullable = true)
	@JsonView
	String solicitante;

	@Column(name = "AUTORIZO", length = 100, nullable = true)
	@JsonView
	String autorizo;

	@Column(name = "AUTORIZOANOMBREDE", length = 100, nullable = true)
	@JsonView
	String autorizoanombrede;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "FECHAHORAAUTORIZACION", nullable = true)
	@JsonView
	Date fechahoraautorizacion;

	@Column(name = "ENVIARSOLICITUD", nullable = true)
	@JsonView
	Integer enviarsolicitud;

	@Column(name = "CONFIRMASOLICITANTE", length = 100, nullable = true)
	@JsonView
	String confirmasolicitante;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "FECHAHORACONFIRMASOLICITANTE", nullable = true)
	@JsonView
	Date fechahoraconfirmasolicitante;

	@Transient
	String autorizatipo;

	@Column(name = "ORIGENCONCLUIDO", nullable = true)
	@JsonView
	Integer origenconcluido;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "PROVEEDOR", referencedColumnName = "PROVEEDOR")
	Prov prov;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
	Alm alm;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDDESCUENTOGLOBAL", referencedColumnName = "ID")
	Descuento descuento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
	Condicion condicion;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
	Concepto concepto;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JsonIgnore
//	@JoinColumn(name = "IDCONCEPTOORIGINAL", referencedColumnName = "ID")
//	Concepto conceptoOriginal;

	@OneToMany(mappedBy = "compra", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Comprad> comprads;

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
