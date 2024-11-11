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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Cxc implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHACANCELACION", nullable = true)
    @JsonView
    Date fechacancelacion;

    @Column(name = "DINERO", length = 20, nullable = true)
    @JsonView
    String dinero;

    @Column(name = "CONTID", nullable = true)
    @JsonView
    Integer contid;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHACONCLUSION", nullable = true)
    @JsonView
    Date fechaconclusion;

    @Column(name = "EJERCICIO", nullable = true)
    @JsonView
    Integer ejercicio;

    @Column(name = "POLIZA", length = 20, nullable = true)
    @JsonView
    String poliza;

    @Column(name = "MOVID", length = 20, nullable = true)
    @JsonView
    String movid;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "PERIODO", nullable = true)
    @JsonView
    Integer periodo;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "MOV", length = 20, nullable = true)
    @JsonView
    String mov;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "VENCIMIENTO", nullable = true)
    @JsonView
    Date vencimiento;

    @Column(name = "SALDO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal saldo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm a", timezone = "America/El_Salvador")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "ORIGENTIPO", length = 10, nullable = true)
    @JsonView
    String origentipo;

    @Column(name = "NOTA", length = 100, nullable = true)
    @JsonView
    String nota;

    @Column(name = "OBSERVACIONES", length = 100, nullable = true)
    @JsonView
    String observaciones;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHAEMISION", nullable = true)
    @JsonView
    Date fechaemision;

    @Column(name = "DINEROID", length = 20, nullable = true)
    @JsonView
    String dineroid;

    @Column(name = "MOVAPLICA", length = 20, nullable = true)
    @JsonView
    String movaplica;

    @Column(name = "REFERENCIA", length = 50, nullable = true)
    @JsonView
    String referencia;

    @Column(name = "ORIGENID", length = 20, nullable = true)
    @JsonView
    String origenid;

    @Column(name = "DINEROCTADINERO", length = 10, nullable = true)
    @JsonView
    String dineroctadinero;

    @Column(name = "POLIZAID", length = 20, nullable = true)
    @JsonView
    String polizaid;

    @Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal impuestos;

    @Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal importe;

    @Column(name = "ORIGEN", length = 20, nullable = true)
    @JsonView
    String origen;

    @Column(name = "MOVAPLICAID", length = 20, nullable = true)
    @JsonView
    String movaplicaid;

    @Column(name = "COMENTARIOS", length = 250, nullable = true)
    @JsonView
    String comentarios;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHAREGISTRO", nullable = true)
    @JsonView
    Date fecharegistro;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
    Concepto concepto;

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE")
    Cte cte;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
    Condicion condicion;

    @OneToMany(mappedBy = "cxc", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Cxcd> cxcds;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "CTADINERO", referencedColumnName = "CTADINERO")
    Ctadinero ctadinero;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
    Formapago formaPago;

    @OneToMany(mappedBy = "cxc", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Cxcpago> cxcpago;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "PROVEEDORHONORARIOMEDICO", referencedColumnName = "PROVEEDOR")
    Prov proveedorHonorarioMedico;

    @Column(name = "iscopy", nullable = true)
    @JsonView
    Integer iscopy;

    @Transient
    @JsonView
    BigDecimal saldoorigen;


    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    public Date getFechaemisiondetalleDelegate() {
        return this.fechaemision;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    public Date getVencimientodetalleDelegate() {
        return this.vencimiento;
    }

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

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
