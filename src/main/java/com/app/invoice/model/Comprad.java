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
public class Comprad implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "IMPUESTO", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal impuesto;

	@Column(name = "COSTOPROMEDIO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal costopromedio;

	@Column(name = "CANTIDAD", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidad;

	@Column(name = "DESCUENTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal descuento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
	Unidad unidad;

	@Column(name = "DESCUENTOIMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal descuentoimporte;

	@Column(name = "CODIGO", length = 30, nullable = true)
	@JsonView
	String codigo;

	@Column(name = "RENGLON", scale = 8, precision = 18, nullable = false)
	@JsonView
	Integer renglon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
	Formapago formaPago;

	@Column(name = "RENGLONTIPO", length = 1, nullable = true)
	@JsonView
	String renglontipo;

	@Column(name = "APLICAID", length = 20, nullable = true)
	@JsonView
	String aplicaid;

	@Column(name = "COSTO", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal costo;

	@Column(name = "ULTIMOCOSTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal ultimocosto;

	@Column(name = "CANTIDADINVENTARIO", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidadinventario;

	@Column(name = "APLICA", length = 20, nullable = true)
	@JsonView
	String aplica;

	@Column(name = "OBSERVACIONES", length = 250, nullable = true)
	@JsonView
	String observaciones;

	@Column(name = "PENDIENTE", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal pendiente;

	@Column(name = "IMPORTECALCULADO", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal importecalculado;

	@Column(name = "ISCOPY", scale = 8, nullable = false)
	@JsonView
	Integer iscopy;

	@Column(name = "FACTOR", nullable = true)
	@JsonView
	Integer factor;

	@Column(name = "ARTDESCRIPTION", length = 500, nullable = true)
	@JsonView
	String artdescription;

	@Column(name = "CANTIDADAUTORIZADA", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidadautorizada;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Compra compra;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
	Alm alm;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
	Art art;

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
