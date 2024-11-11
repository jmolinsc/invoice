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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
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
public class Cxp implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "ORIGENIDMOD", nullable = true)
	@JsonView
	Integer origenidmod;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHACANCELACION", nullable = true)
	@JsonView
	Date fechacancelacion;

	@Column(name = "DINERO", length = 20, nullable = true)
	@JsonView
	String dinero;

	@Column(name = "ORIGENMOD", length = 5, nullable = true)
	@JsonView
	String origenmod;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
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

	@Column(name = "PERIODO", nullable = true)
	@JsonView
	Integer periodo;

	@Column(name = "CONTABILIZAR", nullable = true)
	@JsonView
	Integer contabilizar;

	@Column(name = "NOTIFICARTRANSFERENCIA", nullable = true)
	@JsonView
	Integer notificartransferencia;

	@Column(name = "ISCOPY", nullable = true)
	@JsonView
	Integer iscopy;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAPROGRAMADA", nullable = true)
	@JsonView
	Date fechaprogramada;

	@Column(name = "NOTA", length = 100, nullable = true)
	@JsonView
	String nota;

	@Column(name = "MOV", length = 20, nullable = false)
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

	@Column(name = "EJERCICIO", nullable = true)
	@JsonView
	Integer ejercicio;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAEMISION", nullable = true)
	@JsonView
	Date fechaemision;

	@Column(name = "OBSERVACIONES", length = 100, nullable = true)
	@JsonView
	String observaciones;

	@Column(name = "DINEROCTADINERO", length = 10, nullable = true)
	@JsonView
	String dineroctadinero;

	@Column(name = "REFERENCIA", length = 200, nullable = true)
	@JsonView
	String referencia;

	@Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal impuestos;

	@Column(name = "MOVAPLICA", length = 20, nullable = true)
	@JsonView
	String movaplica;

	@Column(name = "ORIGENID", length = 20, nullable = true)
	@JsonView
	String origenid;

	@Column(name = "POLIZAID", length = 20, nullable = true)
	@JsonView
	String polizaid;

	@Column(name = "CONTID", nullable = true)
	@JsonView
	Integer contid;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "ORIGEN", length = 20, nullable = true)
	@JsonView
	String origen;

	@Column(name = "MOVAPLICAID", length = 20, nullable = true)
	@JsonView
	String movaplicaid;

	@Column(name = "DINEROID", length = 20, nullable = true)
	@JsonView
	String dineroid;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHAREGISTRO", nullable = true)
	@JsonView
	Date fecharegistro;

	@Column(name = "TIPODOCUMENTO", length = 50, nullable = true)
	@JsonView
	String tipodocumento;

	@Column(name = "NUMERODOCUMENTO", length = 100, nullable = true)
	@JsonView
	String numerodocumento;

	@Column(name = "SERIE", length = 100, nullable = true)
	@JsonView
	String serie;

	@Transient
	@JsonView
	BigDecimal saldoorigen;

	@Column(name = "ENVIOCORREO", nullable = true)
	@JsonView
	Integer enviocorreo;

	@Transient
	@JsonView
	Integer enviocorreoopcional;

	@Column(name = "MONTOSUJETO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal montosujeto;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "PROVEEDOR", referencedColumnName = "PROVEEDOR")
	Prov prov;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JsonIgnore
	@JoinColumn(name = "CLIENTETESORERIA", referencedColumnName = "CLIENTE")
	Cte cte;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CTADINERO", referencedColumnName = "CTADINERO")
	Ctadinero ctadinero;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID") })
	Concepto concepto;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID") })
	Condicion condicion;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID") })
	Formapago formapago;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "CENTROCOSTOS", referencedColumnName = "CENTROCOSTOS") })
	Centrocostos centrocostos;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "IDFORMAPAGOMOD", referencedColumnName = "ID") })
	Formapago formapagomod;

	@OneToMany(mappedBy = "cxp", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Cxpd> cxpds;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "ORIGEN", referencedColumnName = "MOV", insertable = false, updatable = false),
			@JoinColumn(name = "ORIGENID", referencedColumnName = "MOVID", insertable = false, updatable = false) })
	Dinero dineroaplica;

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
