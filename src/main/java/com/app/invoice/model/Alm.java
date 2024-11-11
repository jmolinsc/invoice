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
public class Alm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ALMACEN", length = 10, nullable = false)
    @JsonView
    String almacen;

    @Column(name = "ENCARGADO", length = 50, nullable = true)
    @JsonView
    String encargado;

    @Column(name = "TELEFONOS", length = 100, nullable = true)
    @JsonView
    String telefonos;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss", timezone = "GMT-6")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "TIPO", length = 20, nullable = true)
    @JsonView
    String tipo;

    @Column(name = "DIRECCION", length = 100, nullable = true)
    @JsonView
    String direccion;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "NOMBRE", length = 100, nullable = true)
    @JsonView
    String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "CUENTA", referencedColumnName = "CUENTA")
    Cta cta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDALMGRUPO", referencedColumnName = "ID")
    Almgrupo almgrupo;

    @OneToMany(mappedBy = "alm", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Venta> ventas;

    @OneToMany(mappedBy = "alm", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Ventad> ventads;

//	@OneToMany(mappedBy = "alm", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
//	@JsonIgnore
//	List<Auxiliaru> auxiliarus;
    @OneToMany(mappedBy = "alm", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Saldou> saldous;

    @OneToMany(mappedBy = "alm", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Artalm> artalm;

}
