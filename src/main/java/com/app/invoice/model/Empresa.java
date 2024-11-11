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
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "EMPRESA", length = 5, nullable = false)
	@JsonView
	String empresa;

	@Column(name = "FAX", length = 50, nullable = true)
	@JsonView

	String fax;

	@Column(name = "TELEFONOS", length = 100, nullable = true)
	@JsonView

	String telefonos;

	@Column(name = "NIT", length = 17, nullable = true)
	@JsonView

	String nit;

	@Column(name = "EMAILNOTIFICACIONESPEPS", length = 17, nullable = true)
	@JsonView
	String emailnotifiacionespeps;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "ULTIMOCAMBIO", nullable = true)
	@JsonView

	Date ultimocambio;

	@Column(name = "ESTATUS", length = 15, nullable = true)
	@JsonView

	String estatus;

	@Column(name = "NOMBRE", length = 100, nullable = true)
	@JsonView
	String nombre;

	@Column(name = "DIRECCION", length = 100, nullable = true)
	@JsonView
	String direccion;

	@Column(name = "CLIENTEDEFAULT", length = 50, nullable = true)
	@JsonView
	String clientedefault;

	@Column(name = "FLAGS", length = 100, nullable = true)
	@JsonView
	String flags;

	@Column(name = "GIRO", length = 100, nullable = true)
	@JsonView

	String giro;

	@Column(name = "CORRELATIVOPLANTARES", length = 18, nullable = true)
	@JsonView
	Integer correlativoplantares;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
	@Column(name = "ALTA", nullable = true)
	@JsonView

	Date alta;

	@Column(name = "NCR", length = 20, nullable = true)
	@JsonView

	String ncr;

	@Column(name = "TIPOCONTRIBUYENTE", length = 100, nullable = true)
	@JsonView

	String tipocontribuyente;

	@Column(name = "PORCENTAJEIVA", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal porcentajeiva;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "HH:mm")
	@JsonFormat(pattern = "HH:mm", timezone = "GMT-6")
	@Column(name = "HORAINICIALRECARGOPRECIO", length = 100, nullable = true)
	@JsonView
	Date horainicialrecargoprecio;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "HH:mm")
	@JsonFormat(pattern = "HH:mm", timezone = "GMT-6")

	@Column(name = "HORAFINALRECARGOPRECIO", length = 100, nullable = true)
	@JsonView

	Date horafinalrecargoprecio;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHACORTENOMINAA", nullable = true)
	@JsonView

	Date fechacortenominaa;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "FECHACORTENOMINAD", nullable = true)
	@JsonView

	Date fechacortenominad;

	@Column(name = "PORCENTAJERECARGOPRECIO", length = 100, nullable = true)
	@JsonView

	Integer porcentajerecargoprecio;

	@Column(name = "HORASVENCIMIENTOCONSULTAS", nullable = true)
	@JsonView

	Integer horasvencimientoconsultas;

	@Column(name = "GRUPOSCONRECARGO", length = 100, nullable = true)
	@JsonView

	String gruposconrecargo;

	@Column(name = "PROVEEDORIMPUESTOS", length = 20, nullable = true)
	@JsonView
	String proveedorimpuestos;

	@Column(name = "ARTICULOCOASEGURO", length = 20, nullable = true)
	@JsonView

	String articulocoaseguro;

	@Column(name = "ARTICULODEDUCIBLE", length = 20, nullable = true)
	@JsonView

	String articulodeducible;

	@Column(name = "ARTICULOAJUSTECOBERTURA", length = 20, nullable = true)
	@JsonView

	String articuloajustecobertura;

	@Column(name = "PROVEEDORCEGI", length = 20, nullable = true)
	@JsonView

	String proveedorcegi;

	@Column(name = "ARTICULODESCUENTO", length = 20, nullable = true)
	@JsonView

	String articulodescuento;

	@Column(name = "ARTICULOPLANPRENATAL", length = 20, nullable = true)
	@JsonView

	String articuloplanprenatal;

	@Column(name = "ARTICULOANTICIPO", length = 20, nullable = true)
	@JsonView

	String articuloanticipo;

	@Column(name = "EJERCICIOPLANTARES", length = 4, nullable = true)
	@JsonView
	String ejercicioplantares;

	@Column(name = "RUTAPLANTARESORIGEN", length = 250, nullable = true)
	@JsonView
	String rutaplantaresorigen;

	@Column(name = "RUTAPLANTARESDESTINO", length = 250, nullable = true)
	@JsonView
	String rutaplantaresdestino;

	@Column(name = "CTADINEROAPERTURASCORTES", length = 250, nullable = true)
	@JsonView
	String ctadineroaperturascortes;

	@Column(name = "ALMACENTRANSITO", length = 100, nullable = true)
	@JsonView
	String almacenTransito;

	@Column(name = "CREADEPRECIACIONFISCAL", length = 100, nullable = true)
	@JsonView
	Integer creadepreciacionfiscal;

	@Column(name = "SUELDOMINIMO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal sueldominimo;

	@Column(name = "LIMITEISSS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal limiteISSS;

	@Column(name = "LIMITEAFP", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal limiteAFP;

	@Column(name = "PORCENTAJEVACACION", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal porcentajevacacion;

	@Column(name = "CTAMUNICIPAL", length = 20, nullable = true)
	@JsonView
	String ctaMunicipal;

	@Column(name = "VALORVIALIDAD", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal valorVialidad;

	@Column(name = "SUGIERECOSTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	Integer sugierecosto;

	@Column(name = "LIMITECOSTOPROMEDIO", scale = 4, precision = 8, nullable = true)
	@JsonView
	BigDecimal limitecostopromedio;

	@Column(name = "LIMITECIERREMODULOS", nullable = true)
	@JsonView
	Integer limitecierremodulos;

	@Column(name = "RUTASELLOSORIGEN", length = 250, nullable = true)
	@JsonView
	String rutasellosorigen;

	@Column(name = "RUTAFIRMASORIGEN", length = 250, nullable = true)
	@JsonView
	String rutafirmasorigen;

	@Column(name = "RUTACOTIZACION", length = 250, nullable = true)
	@JsonView
	String rutacotizacion;

	@Column(name = "RUTAREQUERIMIENTO", length = 250, nullable = true)
	@JsonView
	String rutarequerimiento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDPAIS", referencedColumnName = "ID")
	Pais pais;

	@ManyToOne(fetch = FetchType.LAZY)

	@JoinColumn(name = "IDMUNICIPIO", referencedColumnName = "ID")

	Municipio municipio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "ID")

	Departamento departamento;

	@Column(name = "MENSAJEACCIONISTA", length = 250, nullable = true)
	@JsonView

	String mensajeaccionista;

	// ACCIONISTAS
	@Column(name = "TOTALACCIONES", scale = 0, precision = 18, nullable = true)
	@JsonView
	Integer totalacciones;

	@Column(name = "VALORNOMINAL", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal valornominal;

	@Column(name = "MONTOCAPITAL", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal montocapital;

	@Column(name = "RAZON", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal razon;

	@Column(name = "MARQUESINA", length = 500, nullable = true)
	@JsonView
	String marquesina;

}
