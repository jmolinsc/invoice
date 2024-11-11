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
public class Inv implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "FECHACANCELACION", nullable = true)
	@JsonView
	Date fechacancelacion;

	@Column(name = "CONTID", nullable = true)
	@JsonView

	Integer contid;

	@Column(name = "CONTEO", nullable = true)
	@JsonView

	Integer conteo;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")

	@Column(name = "FECHACONCLUSION", nullable = true)
	@JsonView

	Date fechaconclusion;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "FECHAORIGEN", nullable = true)
	@JsonView

	Date fechaorigen;

	@Column(name = "MOVID", length = 20, nullable = true)
	@JsonView
	String movid;

	@Column(name = "POLIZA", length = 20, nullable = true)
	@JsonView

	String poliza;

	@Column(name = "USUARIO", length = 20, nullable = true)
	@JsonView
	String usuario;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "ULTIMOCAMBIO", nullable = true)
	@JsonView

	Date ultimocambio;

	@Column(name = "ESTATUS", length = 15, nullable = true)
	@JsonView
	String estatus;

	@Column(name = "MOV", length = 20, nullable = false)
	@JsonView
	String mov;

	@Column(name = "ORIGENTIPO", length = 10, nullable = true)
	@JsonView
	String origentipo;

	@Column(name = "EJERCICIO", nullable = true)
	@JsonView
	Integer ejercicio;

	@Column(name = "OBSERVACIONES", length = 200, nullable = true)
	@JsonView
	String observaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHAEMISION", nullable = true)
	@JsonView

	Date fechaemision;

	@Column(name = "ALMACENDESTINO", length = 10, nullable = true)
	@JsonView
	String almDestino;

	@Column(name = "RENGLONID", nullable = true)
	@JsonView
	Integer renglonid;

	@Column(name = "POLIZAID", length = 20, nullable = true)
	@JsonView
	String polizaid;

	@Column(name = "REFERENCIA", length = 50, nullable = true)
	@JsonView

	String referencia;

	@Column(name = "ORIGENID", length = 20, nullable = true)
	@JsonView

	String origenid;

	@Column(name = "ORIGEN", length = 20, nullable = true)
	@JsonView
	String origen;

	@Column(name = "TIPOVENTA", length = 50, nullable = true)
	@JsonView

	String tipoventa;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "PERIODO", nullable = true)
	@JsonView

	Integer periodo;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHAREGISTRO", nullable = true)
	@JsonView
	Date fecharegistro;

	@Column(name = "ALMACENTRANSITO", precision = 100, nullable = true)
	@JsonView
	String almacenTransito;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE")
	Cte cte;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
	Alm alm;

	@OneToMany(mappedBy = "inv", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Invd> invds;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
	Concepto concepto;

	@Column(name = "iscopy", nullable = true)
	@JsonView
	Integer iscopy;

	@Column(name = "IDPACIENTEINGRESOSV", length = 20, nullable = true)
	@JsonView
	String idpacienteingresosv;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
	@Column(name = "FECHAHORAAUTORIZACION", nullable = true)
	@JsonView

	Date fechahoraautorizacion;

	@Column(name = "AUTORIZO", length = 20, nullable = true)
	@JsonView
	String autorizo;

	@Transient
	@JsonView
	Integer afectainventario;

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("No se puede duplicar");
		}
		return obj;
	}
}
