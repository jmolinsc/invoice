package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.List;
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
public class Cte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "CLIENTE", length = 10, nullable = false)
    @JsonView
    String cliente;

    @Column(name = "RAZONSOCIAL", length = 100, nullable = true)
    @JsonView
    String razonsocial;

    @Column(name = "FAMILIA", length = 100, nullable = true)
    @JsonView
    String familia;

    @Column(name = "TELFIJO", length = 100, nullable = true)
    @JsonView
    String telfijo;

    @Column(name = "TELMOVIL", length = 100, nullable = true)
    @JsonView
    String telmovil;

    @Column(name = "EMAIL", length = 100, nullable = true)
    @JsonView
    String email;

    @Column(name = "TIPOCONTRIBUYENTE", length = 10, nullable = true)
    @JsonView
    String tipocontribuyente;

    @Column(name = "DESCUENTO", length = 30, nullable = true)
    @JsonView
    String descuento;

    @Column(name = "CREDITOCONLIMITE", nullable = false)
    @JsonView
    Integer creditoconlimite;

    @Column(name = "GRUPO", length = 50, nullable = true)
    @JsonView
    String grupo;

    @Column(name = "NIT", length = 17, nullable = true)
    @JsonView
    String nit;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "TIPOSERVICIO", length = 50, nullable = true)
    @JsonView
    String tiposervicio;

    @Column(name = "TIPO", length = 50, nullable = true)
    @JsonView
    String tipo;

    @Column(name = "DIRECCION", length = 250, nullable = true)
    @JsonView
    String direccion;

    @Column(name = "CREDITOLIMITE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal creditolimite;

    @Column(name = "OTRODOCUMENTO", length = 60, nullable = true)
    @JsonView
    String otrodocumento;

    @Column(name = "COMENTARIOS", length = 255, nullable = true)
    @JsonView
    String comentarios;

    @Column(name = "NOMBRE", length = 100, nullable = true)
    @JsonView
    String nombre;

    @Column(name = "ESTATUS", length = 15, nullable = false)
    @JsonView
    String estatus;

    @Column(name = "CTACONTABLE", length = 20, nullable = true)
    @JsonView
    String ctacontable;

    @Column(name = "DUI", length = 10, nullable = true)
    @JsonView
    String dui;

    @Column(name = "CREDITOESPECIAL", nullable = false)
    @JsonView
    Integer creditoespecial;

    @Column(name = "DIASTRAMITE", nullable = false)
    @JsonView
    Integer diastramite;

    @Column(name = "GIRO", length = 150, nullable = true)
    @JsonView
    String giro;

    @Column(name = "NCR", length = 20, nullable = true)
    @JsonView
    String ncr;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

    @Column(name = "TIPOIMPUESTO", length = 30, nullable = true)
    @JsonView
    String tipoimpuesto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
    Condicion condicion;
    //
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDLISTAPRECIOS", referencedColumnName = "ID")
    Listaprecios listaprecios;
    //
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "ID")
    Departamento departamento;
    //
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDMUNICIPIO", referencedColumnName = "ID")
    Municipio municipio;
    //
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDPAIS", referencedColumnName = "ID")
    Pais pais;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "IDAE", referencedColumnName = "ID")
    AE ae;
    // cliente en ventas
//    @OneToMany(mappedBy = "cteBycliente", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JsonIgnore
//    List<Venta> ventaByclientes;
}
