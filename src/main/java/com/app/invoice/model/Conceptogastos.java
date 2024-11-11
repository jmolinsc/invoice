package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Conceptogastos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CONCEPTO", length = 50, nullable = false)
	@JsonView
	String concepto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDCLASE", referencedColumnName = "ID")
	Clasegastos clase;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "IDSUBCLASE", referencedColumnName = "ID")
	Subclasegastos subclase;

	@Column(name = "DESCRIPCION", length = 150, nullable = true)
	@JsonView
	String descripcion;

	@Column(name = "CUENTA", length = 150, nullable = true)
	@JsonView
	String cuenta;

	@Column(name = "CUENTAALTERNA", length = 150, nullable = true)
	@JsonView
	String cuentaalterna;

	@Column(name = "PORCENTAJEIVA", length = 150, nullable = true)
	@JsonView
	BigDecimal porcentajeiva;

	@Column(name = "ESEXCENTO", length = 150, nullable = true)
	@JsonView
	Integer esexcento;

	@Column(name = "ESNOSUJETO", length = 150, nullable = true)
	@JsonView
	Integer esnosujeto;

	@OneToMany(mappedBy = "conceptogastos", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@JsonIgnore
	List<Gastod> gastods;

//	@OneToMany(mappedBy = "conceptogastos", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY)
//	@JsonIgnore
//	List<Conceptogastosporc> conceptogastosporcs;

}
