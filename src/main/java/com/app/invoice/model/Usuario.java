package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

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

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "USUARIO", length = 100, nullable = false)
    @JsonView
    String usuario;

    @Column(name = "NOMBRE", length = 250, nullable = false)
    @JsonView
    String nombre;

     @Column(name = "ESTATUS", length = 20, nullable = false)
    @JsonView
    String estatus;

    @Column(name = "CONTRASENA", length = 100, nullable = true)
    @JsonView
    String contrasena;

    @Column(name = "EMAIL", length = 128, nullable = false)
    @JsonView
    String email;

    @Column(name = "CAMBIARCONTRASEÑA", nullable = true)
    @JsonView
    Integer cambiarContraseña;

    @Column(name = "RESERVACIONES", nullable = true)
    @JsonView
    Integer reservaciones;

    @Column(name = "AUTORIZASOLICITUDCOMPRA", nullable = true)
    @JsonView
    Integer autorizasolicitudcompra;

    @Column(name = "AUTORIZASOLICITUD", nullable = true)
    @JsonView
    Integer autorizasolicitud;

    @Column(name = "AUTORIZASOLICITUDTRASLADO", nullable = true)
    @JsonView
    Integer autorizasolicitudtraslado;

    @Column(name = "MONTOMAXIMOAUTORIZACIONCOMPRA", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal montomaximoautorizacioncompra;

    @Column(name = "PERSONAL", length = 10, nullable = false)
    @JsonView
    String personal;

    @Column(name = "STAMP", length = 200, nullable = true)
    @JsonView
    String stamp;

    @Column(name = "USUARIOLABO", length = 200, nullable = true)
    @JsonView
    String usuariolabo;

    @Column(name = "SIGNATURE", length = 200, nullable = true)
    @JsonView
    String signature;

    @Column(name = "DUI", length = 200, nullable = true)
    @JsonView
    String dui;

    @Column(name = "AUTORIZAANOMBREDE", nullable = true)
    @JsonView
    Integer autorizaanombrede;

    @Column(name = "AUTORIZAORDENCOMPRA", nullable = true)
    @JsonView
    Integer autorizaordencompra;

    @Column(name = "MONTOMAXIMOORDENCOMPRA", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal montomaximoordencompra;

    @Column(name = "MONTOMAXIMOANOMBREDE", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal montomaximoanombrede;

    @Column(name = "SOLOWEB", nullable = true)
    @JsonView
    Integer soloweb;

    @Column(name = "FIRMACOMOSOLICITANTE", nullable = true)
    @JsonView
    Integer firmacomosolicitante;

    @Column(name = "CONFIRMADO", nullable = true)
    @JsonView
    Integer confirmado;

    @Column(name = "EMAILCONFIRMADO", nullable = true)
    @JsonView
    Integer emailconfirmado;

    @Column(name = "EMAILTOKEN", length = 400, nullable = true)
    @JsonView
    String emailtoken;

    @Column(name = "FACTURACONFIRMADA", length = 20, nullable = true)
    @JsonView
    String facturaconfirmada;

    @Column(name = "AUTHTOKEN", length = 400, nullable = true)
    @JsonView
    String authtoken;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
    @Column(name = "FECHAALTA", nullable = true)
    @JsonView
    Date fechaalta;

//    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER, orphanRemoval = true)
//    @JsonView
//    @JsonIgnore
//    List<TecnicoRol> tecnicoRols;

    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonView
    @JsonIgnore
    List<Usuariosistema> usuariosistemas;





}
