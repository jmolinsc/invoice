package com.app.invoice.model;

import java.io.Serializable;
import java.util.List;

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
public class Formapago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "PERMITECAMBIO", nullable = true)
	@JsonView
	Integer permitecambio;

	@Column(name = "NOMBRE", length = 50, nullable = true)
	@JsonView
	String nombre;

	@Column(name = "ORDEN", nullable = true)
	@JsonView
	Integer orden;

	@Column(name = "REQUIEREREFERENCIA", nullable = true)
	@JsonView
	Integer requierereferencia;

	@Column(name = "SOLOVENTAS", nullable = true)
	@JsonView
	Integer soloventas;

	@Column(name = "ESTATUS", length = 15, nullable = false)
	@JsonView
	String estatus;

//	@OneToMany(mappedBy = "formapago", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//	@JsonIgnore
//	List<Dinerod> dinerods;
//
//	@OneToMany(mappedBy = "formapago", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//	@JsonIgnore
//	List<Dinero> dineros;

}
