package com.app.invoice.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
public class Prov implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "PROVEEDOR", length = 10, nullable = false)
    @JsonView
    String proveedor;

    @Column(name = "EMAIL1", length = 100, nullable = true)
    @JsonView
    String email1;

    @Column(name = "BENEFICIARIONOMBRE", length = 100, nullable = true)
    @JsonView
    String beneficiarionombre;

    @Column(name = "NOMBRECOMERCIAL", length = 250, nullable = true)
    @JsonView
    String nombrecomercial;

    @Column(name = "DIRECCION", length = 250, nullable = true)
    @JsonView
    String direccion;

    @Column(name = "FAX", length = 50, nullable = true)
    @JsonView
    String fax;

    @Column(name = "TELEFONOS", length = 100, nullable = true)
    @JsonView
    String telefonos;

    @Column(name = "TIPOCONTRIBUYENTE", length = 10, nullable = true)
    @JsonView
    String tipocontribuyente;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ALTA", nullable = true)
    @JsonView
    Date alta;

    @Column(name = "EXTENSION1", length = 10, nullable = true)
    @JsonView
    String extension1;

    @Column(name = "CATEGORIA", length = 50, nullable = true)
    @JsonView
    String categoria;

    @Column(name = "JV", length = 20, nullable = true)
    @JsonView
    String jv;

    @Column(name = "OTRODOCUMENTO", length = 50, nullable = true)
    @JsonView
    String otrodocumento;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "TIPO", length = 15, nullable = true)
    @JsonView
    String tipo;

    @Column(name = "NCR", length = 25, nullable = true)
    @JsonView
    String ncr;

    @Column(name = "TIPOSERVICIO", length = 50, nullable = true)
    @JsonView
    String tiposervicio;

    @Column(name = "DIRINTERNET", length = 50, nullable = true)
    @JsonView
    String dirinternet;

    @Column(name = "NIT", length = 15, nullable = true)
    @JsonView
    String nit;

    @Column(name = "ESTATUS", length = 15, nullable = false)
    @JsonView
    String estatus;

    @Column(name = "NOMBRE", length = 250, nullable = true)
    @JsonView
    String nombre;

    @Column(name = "CONTACTO1", length = 50, nullable = true)
    @JsonView
    String contacto1;

    @Column(name = "DUI", length = 30, nullable = true)
    @JsonView
    String dui;

    @Column(name = "TIPOIMPUESTO", length = 30, nullable = true)
    @JsonView
    String tipoimpuesto;

    @Column(name = "GIRO", length = 250, nullable = true)
    @JsonView
    String giro;

    @Column(name = "GRUPO", length = 250, nullable = true)
    @JsonView
    String grupo;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "CUENTA", length = 20, nullable = true)
    @JsonView
    String cuenta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDFAMILIA", referencedColumnName = "ID")
    Familiaprov familiaprov;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDMUNICIPIO", referencedColumnName = "ID")
    Municipio municipio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
    Formapago formapago;

    @ManyToOne(fetch = FetchType.EAGER)

    @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
    Condicion condicion;

    @ManyToOne(fetch = FetchType.EAGER)

    @JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "ID")
    Departamento departamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDPAIS", referencedColumnName = "ID")
    Pais pais;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonIgnore
//    @JoinColumns({
//        @JoinColumn(name = "CTACONTABLE", referencedColumnName = "CUENTA")})
//    Cta ctacontable;

}
