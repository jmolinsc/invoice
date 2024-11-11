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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

public class Art implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ARTICULO", length = 20, nullable = false)
    @JsonView
    String articulo;

    @Column(name = "CUENTA4", length = 20, nullable = true)
    @JsonView
    String cuenta4;

    @Column(name = "DESCRIPCION1", length = 100, nullable = true)
    @JsonView
    String descripcion1;

    @Column(name = "SECOMPRA", nullable = true)
    @JsonView
    Boolean secompra;

    @Column(name = "CUENTA2", length = 20, nullable = true)
    @JsonView
    String cuenta2;

    @Column(name = "TIPO", length = 20, nullable = false)
    @JsonView
    @Basic(fetch = FetchType.EAGER)
    String tipo;

    @Column(name = "CUENTA", length = 20, nullable = true)
    @JsonView
    String cuenta;

    @Column(name = "PRECIO5", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal precio5;

    @Transient
    @Column(name = "peso", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal peso;

    @Column(name = "CUENTA3", length = 20, nullable = true)
    @JsonView
    String cuenta3;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "CUENTA5", length = 20, nullable = true)
    @JsonView
    String cuenta5;

    @Column(name = "SEPRODUCE", nullable = true)
    @JsonView
    Boolean seproduce;

    @Column(name = "MARGEN", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal margen;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss", timezone = "GMT-6")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss", timezone = "GMT-6")

    @Column(name = "DESCRIPCION2", length = 255, nullable = true)
    @JsonView
    String descripcion2;

    @Column(name = "PROVEEDOR", length = 10, nullable = true)
    @JsonView
    String proveedor;

    @Column(name = "PRECIO4", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal precio4;

    @Column(name = "PRECIO3", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal precio3;

    @Column(name = "SEVENDE", nullable = true)
    @JsonView
    Boolean sevende;

    @Column(name = "ESFORMULA", nullable = true)
    @JsonView
    Boolean esformula;

    @Column(name = "PRECIO2", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal precio2;

    @Column(name = "PRECIOLISTA", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal preciolista;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "CUENTA6", length = 20, nullable = true)
    @JsonView
    String cuenta6;

    @Column(name = "ESNOSUJETO", nullable = true)
    @JsonView
    Integer esnosujeto;

    @Column(name = "IMPUESTO1", scale = 8, precision = 18, nullable = true)
    @JsonView
    Integer impuesto1;

    @Column(name = "EXISTENCIAMINIMA", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal existenciaminima;

    @Column(name = "EXISTENCIAMAXIMA", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal existenciamaxima;

    @Column(name = "COSTPROM", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal costprom;

    @Column(name = "ULTIMOCOST", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal ultimocost;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

    @Column(name = "LOTEESTANDAR", nullable = true)
    @JsonView
    String loteestandar;

    @Column(name = "INSTRUCCIONES", length = 200, nullable = true)
    @JsonView
    String instrucciones;

    @Column(name = "OTROSDATOS", length = 200, nullable = true)
    @JsonView
    String otrosdatos;

    @Column(name = "REGISTROSV", length = 50, nullable = true)
    @JsonView
    String registrosv;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDARTLINEA", referencedColumnName = "ID")
    Artlinea artlinea;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDARTFAMILIA", referencedColumnName = "ID")
    Artfamilia artfamilia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDUNIDADCOMPRA", referencedColumnName = "ID")
    Unidad unidadByidunidadcompra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IDARTCATEGORIA", referencedColumnName = "ID")
    @JsonIgnore
    Artcategoria artcategoria;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDARTGRUPO", referencedColumnName = "ID")
    Artgrupo artgrupo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDARTFABRICANTE", referencedColumnName = "ID")
    Artfabricante artfabricante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDUNIDADTRASPASO", referencedColumnName = "ID")
    Unidad unidadByidunidadtraspaso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonView
    @JoinColumns({
        @JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")})
    Unidad unidadByidunidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumns({
        @JoinColumn(name = "UNIDADCOMPRA", referencedColumnName = "ID")})
    Unidad unidadcompra;

//        @OneToMany(mappedBy = "art", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//        @JsonIgnore
//        List<Auxiliaru> auxiliarus;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns({
        @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO", insertable = false, updatable = false),
        @JoinColumn(name = "IDUNIDAD", referencedColumnName = "IDUNIDAD", insertable = false, updatable = false)})
    Artunidad artunidad;

    @OneToMany(mappedBy = "art", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Artunidad> artunidadds;

//        @OneToMany(mappedBy = "art", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//        @JsonIgnore
//        List<Ventad> ventads;
//
//        @OneToMany(mappedBy = "art", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//        @JsonIgnore
//        List<Saldou> saldous;
    @OneToMany(mappedBy = "art", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Artalm> artalm;

    @OneToMany(mappedBy = "art", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Artjuego> artjuego;

}
