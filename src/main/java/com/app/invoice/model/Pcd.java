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
public class Pcd implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "RENGLON", nullable = false)
	@JsonView
	Integer renglon;

	@Column(name = "NUEVO", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal nuevo;

	@Column(name = "ANTERIOR", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal anterior;

	@Column(name = "NUEVO_ASEGURADORA", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal nuevoaseguradora;

	@Column(name = "NUEVO_ASEGURADORA12", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal nuevoaseguradora12;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
	Unidad unidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
	Art art;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Pc pc;

}
