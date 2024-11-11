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
public class Gasto implements Serializable, Cloneable {

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

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHACONCLUSION", nullable = true)
    @JsonView
    Date fechaconclusion;

    @Column(name = "MOVID", length = 20, nullable = true)
    @JsonView
    String movid;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "POLIZA", length = 20, nullable = true)
    @JsonView
    String poliza;

    @Column(name = "MOV", length = 20, nullable = false)
    @JsonView
    String mov;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "VENCIMIENTO", nullable = true)
    @JsonView
    Date vencimiento;

    @Column(name = "SALDO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal saldo;

    @Column(name = "ORIGENTIPO", length = 10, nullable = true)
    @JsonView
    String origentipo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHAEMISION", nullable = true)
    @JsonView
    Date fechaemision;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAREQUERIDA", nullable = true)
    @JsonView
    Date fecharequerida;

    @Column(name = "OBSERVACIONES", length = 250, nullable = true)
    @JsonView
    String observaciones;

    @Column(name = "EJERCICIO", nullable = true)
    @JsonView
    Integer ejercicio;

    @Column(name = "DINEROID", length = 20, nullable = true)
    @JsonView
    String dineroid;

    @Column(name = "CTADINERO", length = 10, nullable = true)
    @JsonView
    String ctadinero;

    @Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal impuestos;

    @Column(name = "MOVAPLICA", length = 20, nullable = true)
    @JsonView
    String movaplica;

    @Column(name = "ORIGENID", length = 20, nullable = true)
    @JsonView
    String origenid;

    @Column(name = "POLIZAID", length = 20, nullable = true)
    @JsonView
    String polizaid;

    @Column(name = "CONTID", nullable = true)
    @JsonView
    Integer contid;

    @Column(name = "DINEROCTADINERO", length = 10, nullable = true)
    @JsonView
    String dineroctadinero;

    @Column(name = "TIENERETENCION", nullable = false)
    @JsonView
    Integer tieneretencion;

    @Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal importe;

    @Column(name = "ORIGEN", length = 20, nullable = true)
    @JsonView
    String origen;

    @Column(name = "PERIODO", nullable = true)
    @JsonView
    Integer periodo;

    @Column(name = "MOVAPLICAID", length = 20, nullable = true)
    @JsonView
    String movaplicaid;

    @Column(name = "ISCOPY", length = 20, nullable = true)
    @JsonView
    Integer iscopy;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHAREGISTRO", nullable = true)
    @JsonView
    Date fecharegistro;

    @Column(name = "COMENTARIOS", length = 250, nullable = true)
    @JsonView
    String comentarios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
    Condicion condicion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDSUBCLASE", referencedColumnName = "ID")
    Subclasegastos subclasegastos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "ACREEDOR", referencedColumnName = "PROVEEDOR")
    Prov prov;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDCLASE", referencedColumnName = "ID")
    Clasegastos clasegastos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "IDFORMAPAGO", referencedColumnName = "ID")
    Formapago formapago;

    @OneToMany(mappedBy = "gasto", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Gastod> gastods;


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
