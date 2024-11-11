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
public class Cta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CUENTA", length = 20, nullable = false)
    @JsonView
    String cuenta;

    @Column(name = "ESACREEDORA", nullable = true)
    @JsonView
    Integer esacreedora;

    @Column(name = "CENTROSCOSTOS", nullable = true)
    @JsonView
    Integer centroscostos;

    @Column(name = "DESCRIPCION", length = 100, nullable = true)
    @JsonView
    String descripcion;

    @Column(name = "GRUPO", length = 50, nullable = true)
    @JsonView
    String grupo;

    @Column(name = "TIENEMOVIMIENTOS", nullable = true)
    @JsonView
    Integer tienemovimientos;

    @Column(name = "CATEGORIA", length = 50, nullable = true)
    @JsonView
    String categoria;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "TIPO", length = 15, nullable = true)
    @JsonView
    String tipo;

    @Column(name = "ESACUMULATIVA", nullable = true)
    @JsonView
    Integer esacumulativa;

    @Column(name = "FAMILIA", length = 50, nullable = true)
    @JsonView
    String familia;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

    @Column(name = "CENTROCOSTOSREQUERIDO", nullable = true)
    @JsonView
    Integer centrocostosrequerido;

    @Column(name = "CENTROCOSTOSOMISION", length = 50, nullable = true)
    @JsonView
    String centrocostosomision;

    @Transient
    @JsonView
    String rowid;

    @Transient
    @JsonView
    String centro;

    @Transient
    @JsonView
    String cuentabuscada;

    @OneToMany(mappedBy = "cta", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonView
    @JsonIgnore
    List<Ctacentro> ctacentrods;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RAMA", referencedColumnName = "CUENTA")
    Cta rama;

    @OneToMany(mappedBy = "rama", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Cta> ramahijo;


}
