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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Artunidad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "FACTOR", nullable = true)
    @JsonView
    BigDecimal factor;

    @ManyToOne(fetch = FetchType.EAGER)
    @Getter(onMethod = @__(
            @JsonIgnore))
    @JoinColumns({
        @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")})
    Art art;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
    Unidad unidad;

    public Integer getUnidadDelegate() {
        return (this.unidad == null) ? null : this.unidad.getId();
    }

    public String getUnidadDescriptionDelegate() {
        return (this.unidad == null) ? null : this.unidad.getNombre();
    }

    public String getArtDelegate() {
        return (this.art == null) ? null : this.art.getArticulo();
    }
    
    public String getArtDescriptionDelegate() {
        return (this.art == null) ? null : this.art.getDescripcion1();
    }

}
