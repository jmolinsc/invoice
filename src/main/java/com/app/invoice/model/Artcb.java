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
public class Artcb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    
    @Column(name = "CODIGO", length = 100, nullable = false)
    @JsonView
    String codigo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss", timezone = "GMT-6")
    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "USUARIO", length = 20, nullable = true)

    @JsonView
    String usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
    @Column(name = "ALTA", nullable = true)

    @JsonView

    Date alta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
        @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
    Art art;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "IDUNIDAD", referencedColumnName = "ID")
    Unidad unidad;

//    @OneToMany(mappedBy = "artcb", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JsonIgnore
//    List<Invd> invds;

    @Transient
    BigDecimal factorStock;



}
