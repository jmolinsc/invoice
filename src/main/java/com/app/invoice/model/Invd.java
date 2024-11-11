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
public class Invd implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer idlinea;

	@Column(name = "COSTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal costo;

	@Column(name = "CANTIDAD", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidad;

	@Column(name = "FACTOR", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal factor;

	@Column(name = "RENGLONTIPO", length = 1, nullable = true)
	@JsonView
	String renglontipo;

	@Column(name = "RENGLON", precision = 18, nullable = true)
	@JsonView
	Integer renglon;

	@Column(name = "APLICAID", length = 20, nullable = true)
	@JsonView
	String aplicaid;

	@Column(name = "ULTIMOCOSTO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal ultimocosto;

	@Column(name = "CANTIDADPENDIENTE", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidadpendiente;

	@Column(name = "APLICA", length = 20, nullable = true)
	@JsonView
	String aplica;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
	Art art;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CENTROCOSTOS", referencedColumnName = "CENTROCOSTOS")
	Centrocostos centrocostos;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
	Alm alm;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Inv inv;

	@ManyToOne(fetch = FetchType.EAGER)

	@JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
	Unidad unidad;

	@ManyToOne(fetch = FetchType.EAGER)

	@JoinColumn(name = "CODIGO", referencedColumnName = "CODIGO")
	Artcb artcb;

	@Column(name = "CANTIDADINVENTARIO", scale = 8, precision = 18, nullable = true)
	@JsonView
	BigDecimal cantidadinventario;

	@Column(name = "iscopy", nullable = true)
	@JsonView
	Integer iscopy;

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
