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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

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
public class Venta implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "MOV", length = 20, nullable = false)
    private String mov;

    @Column(name = "MOVID", length = 20, nullable = false)
    private String movid;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAEMISION", nullable = false)
    private Date fechaemision;

    @Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
    private BigDecimal importe;

    @Column(name = "CAMBIO", scale = 4, precision = 18, nullable = true)
    BigDecimal cambio;

    @Column(name = "TOTALPAGADO", scale = 4, precision = 18, nullable = true)
    BigDecimal totalpagado;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACANCELACION", nullable = true)
    Date fechacancelacion;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACONCLUSION", nullable = true)
    Date fechaconclusion;

    @Column(name = "USUARIO", length = 20, nullable = false)
    @JsonView
    String usuario;

    @Column(name = "EJERCICIO", nullable = true)
    Integer ejercicio;

    @Column(name = "OBSERVACIONES", length = 100, nullable = true)
    String observaciones;

    @Column(name = "REFERENCIA", length = 100, nullable = true)
    String referencia;

    @Column(name = "ORIGENID", length = 20, nullable = true)
    String origenid;

    @Column(name = "ORIGENTIPO", length = 20, nullable = true)
    String origentipo;

    @Column(name = "IMPUESTOS", scale = 4, precision = 18, nullable = true)
    BigDecimal impuestos;

    @Column(name = "ESTATUS", length = 15, nullable = false)
    String estatus;

    @Column(name = "ORIGEN", length = 20, nullable = true)
    String origen;

    @Column(name = "TIPOVENTA", length = 50, nullable = true)
    String tipoventa;

    @Column(name = "PERIODO", nullable = true)
    Integer periodo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    Date ultimocambio;

    @Column(name = "COMENTARIOS", length = 250, nullable = true)
    String comentarios;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
    @Column(name = "FECHAREGISTRO", nullable = true)
    Date fecharegistro;

    @Column(name = "TIPOIMPUESTO", length = 30, nullable = true)
    String tipoimpuesto;

    @Column(name = "IDAPERTURA", scale = 0, precision = 18, nullable = true)
    Integer idapertura;

    @Column(name = "CUENTA", length = 20, nullable = true)
    String cuenta;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "PROXIMAFECHA", nullable = true)
    Date proximafecha;

    @Column(name = "SALDO", scale = 4, precision = 18, nullable = true)
    BigDecimal saldo;

    @Column(name = "SALDOTOTAL", scale = 4, precision = 18, nullable = true)
    BigDecimal saldototal;

    @Column(name = "DESCUENTOGLOBAL", scale = 4, precision = 18, nullable = true)
    BigDecimal descuentoglobal;

    @Column(name = "DESCUENTOLINEA", scale = 4, precision = 18, nullable = true)
    BigDecimal descuentolinea;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE")
    Cte cteBycliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDLISTAPRECIOS", referencedColumnName = "ID")
    Listaprecios listaprecios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDCONDICION", referencedColumnName = "ID")
    Condicion condicion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDCONCEPTO", referencedColumnName = "ID")
    Concepto concepto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDDESCUENTOGLOBAL", referencedColumnName = "ID")
    Descuento iddescuentoglobal;

    @OneToMany(mappedBy = "venta", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Ventad> ventads;

    @OneToMany(mappedBy = "venta", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Ventapago> ventapagods;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
    Alm alm;

    @Column(name = "iscopy", nullable = true)
    @JsonView
    Integer iscopy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMov() {
        return mov;
    }

    public void setMov(String mov) {
        this.mov = mov;
    }

    public String getMovid() {
        return movid;
    }

    public void setMovid(String movid) {
        this.movid = movid;
    }

    public Date getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getCambio() {
        return cambio;
    }

    public void setCambio(BigDecimal cambio) {
        this.cambio = cambio;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public Date getFechacancelacion() {
        return fechacancelacion;
    }

    public void setFechacancelacion(Date fechacancelacion) {
        this.fechacancelacion = fechacancelacion;
    }

    public Date getFechaconclusion() {
        return fechaconclusion;
    }

    public void setFechaconclusion(Date fechaconclusion) {
        this.fechaconclusion = fechaconclusion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Integer ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getOrigenid() {
        return origenid;
    }

    public void setOrigenid(String origenid) {
        this.origenid = origenid;
    }

    public String getOrigentipo() {
        return origentipo;
    }

    public void setOrigentipo(String origentipo) {
        this.origentipo = origentipo;
    }

    public BigDecimal getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(BigDecimal impuestos) {
        this.impuestos = impuestos;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(String tipoventa) {
        this.tipoventa = tipoventa;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Date getUltimocambio() {
        return ultimocambio;
    }

    public void setUltimocambio(Date ultimocambio) {
        this.ultimocambio = ultimocambio;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getTipoimpuesto() {
        return tipoimpuesto;
    }

    public void setTipoimpuesto(String tipoimpuesto) {
        this.tipoimpuesto = tipoimpuesto;
    }

    public Integer getIdapertura() {
        return idapertura;
    }

    public void setIdapertura(Integer idapertura) {
        this.idapertura = idapertura;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Date getProximafecha() {
        return proximafecha;
    }

    public void setProximafecha(Date proximafecha) {
        this.proximafecha = proximafecha;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldototal() {
        return saldototal;
    }

    public void setSaldototal(BigDecimal saldototal) {
        this.saldototal = saldototal;
    }

    public BigDecimal getDescuentoglobal() {
        return descuentoglobal;
    }

    public void setDescuentoglobal(BigDecimal descuentoglobal) {
        this.descuentoglobal = descuentoglobal;
    }

    public BigDecimal getDescuentolinea() {
        return descuentolinea;
    }

    public void setDescuentolinea(BigDecimal descuentolinea) {
        this.descuentolinea = descuentolinea;
    }

    public Cte getCteBycliente() {
        return cteBycliente;
    }

    public void setCteBycliente(Cte cteBycliente) {
        this.cteBycliente = cteBycliente;
    }

    public Listaprecios getListaprecios() {
        return listaprecios;
    }

    public void setListaprecios(Listaprecios listaprecios) {
        this.listaprecios = listaprecios;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    public Descuento getIddescuentoglobal() {
        return iddescuentoglobal;
    }

    public void setIddescuentoglobal(Descuento iddescuentoglobal) {
        this.iddescuentoglobal = iddescuentoglobal;
    }

    public List<Ventad> getVentads() {
        return ventads;
    }

    public void setVentads(List<Ventad> ventads) {
        this.ventads = ventads;
    }

    public List<Ventapago> getVentapagods() {
        return ventapagods;
    }

    public void setVentapagods(List<Ventapago> ventapagods) {
        this.ventapagods = ventapagods;
    }

    public Alm getAlm() {
        return alm;
    }

    public void setAlm(Alm alm) {
        this.alm = alm;
    }

    public Integer getIscopy() {
        return iscopy;
    }

    public void setIscopy(Integer iscopy) {
        this.iscopy = iscopy;
    }

}
