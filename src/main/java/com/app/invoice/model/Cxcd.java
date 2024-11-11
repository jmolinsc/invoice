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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
public class Cxcd implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "APLICAID", length = 20, nullable = true)
	@JsonView
	String aplicaid;

	@Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal importe;

	@Column(name = "APLICA", length = 20, nullable = true)
	@JsonView
	String aplica;

	@Column(name = "RENGLON", nullable = false)
	@JsonView
	Integer renglon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Cxc cxc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumns({ @JoinColumn(name = "APLICA", referencedColumnName = "MOV", insertable = false, updatable = false),
			@JoinColumn(name = "APLICAID", referencedColumnName = "MOVID", insertable = false, updatable = false) })
	Cxc cxcaplica;

	@Column(name = "iscopy", nullable = true)
	@JsonView
	Integer iscopy;

	@Transient
	@JsonView
	BigDecimal saldo;

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

	public void run() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
}
