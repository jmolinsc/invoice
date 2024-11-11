package com.app.invoice.model;

import java.io.Serializable;

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
public class Movtipo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "CONSECUTIVO", nullable = true)
	@JsonView
	Integer consecutivo;

	@Column(name = "NACEENMODULO", nullable = true)
	@JsonView
	Integer naceenmodulo;

	@Column(name = "MOV", length = 20, nullable = false)
	@JsonView
	String mov;

	@Column(name = "ESTATUS", length = 20, nullable = true)
	@JsonView
	String estatus;

	@Column(name = "CONCEPTOS", length = 250, nullable = true)
	@JsonView
	String conceptos;

	@Column(name = "OBSERVACIONES", length = 250, nullable = true)
	@JsonView
	String observaciones;

	@Column(name = "MOVSFLUJO", length = 250, nullable = true)
	@JsonView
	String movsflujo;

	@Column(name = "REPORTE_DEFAULT", length = 100, nullable = true)
	@JsonView
	String reporteDefault;

	@Column(name = "REPORTE_PENDIENTE", length = 100, nullable = true)
	@JsonView
	String reportePendiente;

	@Column(name = "REPORTE_CONCLUIDO", length = 100, nullable = true)
	@JsonView
	String reporteConcluido;

	@Column(name = "REPORTE_CANCELADO", length = 100, nullable = true)
	@JsonView
	String reporteCancelado;

	@Column(name = "NOMBRESECUENCIA", length = 100, nullable = true)
	@JsonView
	String nombresecuencia;

	@Column(name = "USASECUENCIA", nullable = true)
	@JsonView
	Integer usasecuencia;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "MODULO", referencedColumnName = "MODULO")
	Modulo modulo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "IDMOVCOMPORTAMIENTO", referencedColumnName = "ID")
	Movcomportamiento movcomportamiento;

	@Column(name = "PERMITECOPIAR", length = 3, nullable = true)
	@JsonView
	String permitecopiar;

}
