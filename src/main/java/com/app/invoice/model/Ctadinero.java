package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Ctadinero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "CTADINERO", length = 10, nullable = false)
    @JsonView
    String ctadinero;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ULTIMOCORTE", nullable = true)
    @JsonView
    Date ultimocorte;

    @Column(name = "DESCRIPCION", length = 100, nullable = true)
    @JsonView
    String descripcion;

    @Column(name = "CUENTA", length = 20, nullable = true)
    @JsonView
    String cuenta;

    @Column(name = "CUENTA2", length = 20, nullable = true)
    @JsonView
    String cuenta2;

    @Column(name = "GRUPO", length = 50, nullable = true)
    @JsonView
    String grupo;

    @Column(name = "CATEGORIA", length = 50, nullable = true)
    @JsonView
    String categoria;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "TIPO", length = 20, nullable = true)
    @JsonView
    String tipo;

    @Column(name = "NUMEROCTA", length = 100, nullable = true)
    @JsonView
    String numerocta;

    @Column(name = "FAMILIA", length = 50, nullable = true)
    @JsonView
    String familia;

    @Column(name = "ESTATUS", length = 15, nullable = false)
    @JsonView
    String estatus;

    @Column(name = "NUMEROCAJA", nullable = true)
    @JsonView
    Integer numerocaja;

    @Column(name = "VALIDAESTABLECER", nullable = true)
    @JsonView
    Integer validaestablecer;

    @Column(name = "CTATRANSFERENCIA", nullable = true)
    @JsonView
    Integer ctatransferencia;

    @Column(name = "SALDO", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal saldo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

     @OneToMany(mappedBy = "ctadineroByctadinero", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Dinero> ctadineroByctadinero;

    @OneToMany(mappedBy = "ctadineroByctadinerodestino", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Dinero> ctadineroByctadinerodestino;



}
