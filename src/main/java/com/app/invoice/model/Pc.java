package com.app.invoice.model;

import java.io.Serializable;
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
public class Pc implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = true)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACANCELACION", nullable = false)
    @JsonView
    Date fechacancelacion;

    @Column(name = "MOVID", length = 20, nullable = true)
    @JsonView
    String movid;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAEMISION", nullable = false)
    @JsonView
    Date fechaemision;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ULTIMOCAMBIO", nullable = false)
    @JsonView
    Date ultimocambio;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "PERIODO", nullable = true)
    @JsonView
    Integer periodo;

    @Column(name = "MOV", length = 20, nullable = false)
    @JsonView
    String mov;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "EJERCICIO", nullable = true)
    @JsonView
    Integer ejercicio;

    @Column(name = "WEB", nullable = true)
    @JsonView
    Integer web;

    @Column(name = "ASEGURADORA", nullable = true)
    @JsonView
    Integer aseguradora;

    @Column(name = "ASEGURADORA12", nullable = true)
    @JsonView
    Integer aseguradora12;

    @Column(name = "PRECIOENPAQUETE", nullable = true)
    @JsonView
    Integer precioenpaquete;

    @Column(name = "OBSERVACIONES", length = 500, nullable = true)
    @JsonView
    String observaciones;

    @Column(name = "REFERENCIA", length = 50, nullable = true)
    @JsonView
    String referencia;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAREGISTRO", nullable = false)
    @JsonView
    Date fecharegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACONCLUSION", nullable = false)
    @JsonView
    Date fechaconclusion;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAINICIO", nullable = false)
    @JsonView
    Date fechainicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "IDLISTAMODIFICAR", referencedColumnName = "ID")
    Listaprecios listaprecios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
    Concepto concepto;

    @OneToMany(mappedBy = "pc", cascade = {CascadeType.REMOVE}, orphanRemoval = false, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Pcd> pcds;

    @Column(name = "IDISSUE", length = 100, nullable = true)
    @JsonView
    Integer idissue;

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
