package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

public class Ventad implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "IDLINEA", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idlinea;

    @Column(name = "DESCUENTOIMPORTE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal descuentoimporte;

    @Column(name = "PRECIO", scale = 4, precision = 18, nullable = false)
    @JsonView
    BigDecimal precio;

    @Column(name = "RENGLON", nullable = false)
    @JsonView
    Integer renglon;

    @Column(name = "IDJUEGO", nullable = true)
    @JsonView
    String idjuego;

    @Column(name = "CANTIDAD", scale = 4, precision = 18, nullable = false)
    @JsonView
    BigDecimal cantidad;

    @Column(name = "DESCUENTO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal descuento;

    @Column(name = "RENGLONTIPO", length = 1, nullable = false)
    @JsonView
    String renglontipo;

    @Column(name = "APLICAID", length = 20, nullable = true)
    @JsonView
    String aplicaid;

    @Column(name = "CODIGO", length = 50, nullable = true)
    @JsonView
    String codigo;

    @Column(name = "CANTIDADINVENTARIO", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal cantidadinventario;

    @Column(name = "APLICA", length = 20, nullable = true)
    @JsonView
    String aplica;

    @Column(name = "USUARIOQUEMODIFICO", length = 20, nullable = true)
    @JsonView
    String usuarioquemodifico;

    @Column(name = "OBSERVACIONES", length = 100, nullable = true)
    @JsonView
    String observaciones;

    @Column(name = "OBSERVACIONULTRASONOGRAFIA", length = 500, nullable = true)
    @JsonView
    String observacionultrasonografia;

    @Column(name = "POLITICAPRECIOS", nullable = true)
    @JsonView
    Integer politicaprecios;

    @Column(name = "IMPUESTO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal impuesto;

    @Column(name = "FACTOR", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal factor;

    @Column(name = "PENDIENTE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal pendiente;

    @Column(name = "COSTO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal costo;

    @Column(name = "EXISTENCIA", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal existencia;

    @Column(name = "ORDEN", nullable = true)
    @JsonView
    Integer orden;

    @Column(name = "AFECTAINVENTARIO", nullable = true)
    @JsonView
    Integer afectaInventario;

    @Transient
    @JsonView
    BigDecimal unidadfactor;

    @Transient
    @JsonView
    BigDecimal importe;

    @Transient
    @JsonView
    BigDecimal impuestocalculado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
    Art art;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
    Unidad unidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
    Alm alm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    Venta venta;

    @Column(name = "iscopy", nullable = true)
    @JsonView
    Integer iscopy;


    public Integer getIdlinea() {
		return idlinea;
	}


	public void setIdlinea(Integer idlinea) {
		this.idlinea = idlinea;
	}


	public BigDecimal getDescuentoimporte() {
		return descuentoimporte;
	}


	public void setDescuentoimporte(BigDecimal descuentoimporte) {
		this.descuentoimporte = descuentoimporte;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public Integer getRenglon() {
		return renglon;
	}


	public void setRenglon(Integer renglon) {
		this.renglon = renglon;
	}


	public String getIdjuego() {
		return idjuego;
	}


	public void setIdjuego(String idjuego) {
		this.idjuego = idjuego;
	}


	public BigDecimal getCantidad() {
		return cantidad;
	}


	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}


	public BigDecimal getDescuento() {
		return descuento;
	}


	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}


	public String getRenglontipo() {
		return renglontipo;
	}


	public void setRenglontipo(String renglontipo) {
		this.renglontipo = renglontipo;
	}


	public String getAplicaid() {
		return aplicaid;
	}


	public void setAplicaid(String aplicaid) {
		this.aplicaid = aplicaid;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public BigDecimal getCantidadinventario() {
		return cantidadinventario;
	}


	public void setCantidadinventario(BigDecimal cantidadinventario) {
		this.cantidadinventario = cantidadinventario;
	}


	public String getAplica() {
		return aplica;
	}


	public void setAplica(String aplica) {
		this.aplica = aplica;
	}


	public String getUsuarioquemodifico() {
		return usuarioquemodifico;
	}


	public void setUsuarioquemodifico(String usuarioquemodifico) {
		this.usuarioquemodifico = usuarioquemodifico;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getObservacionultrasonografia() {
		return observacionultrasonografia;
	}


	public void setObservacionultrasonografia(String observacionultrasonografia) {
		this.observacionultrasonografia = observacionultrasonografia;
	}


	public Integer getPoliticaprecios() {
		return politicaprecios;
	}


	public void setPoliticaprecios(Integer politicaprecios) {
		this.politicaprecios = politicaprecios;
	}


	public BigDecimal getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}


	public BigDecimal getFactor() {
		return factor;
	}


	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}


	public BigDecimal getPendiente() {
		return pendiente;
	}


	public void setPendiente(BigDecimal pendiente) {
		this.pendiente = pendiente;
	}


	public BigDecimal getCosto() {
		return costo;
	}


	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}


	public BigDecimal getExistencia() {
		return existencia;
	}


	public void setExistencia(BigDecimal existencia) {
		this.existencia = existencia;
	}


	public Integer getOrden() {
		return orden;
	}


	public void setOrden(Integer orden) {
		this.orden = orden;
	}


	public Integer getAfectaInventario() {
		return afectaInventario;
	}


	public void setAfectaInventario(Integer afectaInventario) {
		this.afectaInventario = afectaInventario;
	}


	public BigDecimal getUnidadfactor() {
		return unidadfactor;
	}


	public void setUnidadfactor(BigDecimal unidadfactor) {
		this.unidadfactor = unidadfactor;
	}


	public BigDecimal getImporte() {
		return importe;
	}


	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}


	public BigDecimal getImpuestocalculado() {
		return impuestocalculado;
	}


	public void setImpuestocalculado(BigDecimal impuestocalculado) {
		this.impuestocalculado = impuestocalculado;
	}


	public Art getArt() {
		return art;
	}


	public void setArt(Art art) {
		this.art = art;
	}


	public Unidad getUnidad() {
		return unidad;
	}


	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}


	public Alm getAlm() {
		return alm;
	}


	public void setAlm(Alm alm) {
		this.alm = alm;
	}


	public Venta getVenta() {
		return venta;
	}


	public void setVenta(Venta venta) {
		this.venta = venta;
	}


	public Integer getIscopy() {
		return iscopy;
	}


	public void setIscopy(Integer iscopy) {
		this.iscopy = iscopy;
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

}
