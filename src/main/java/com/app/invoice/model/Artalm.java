package com.app.invoice.model;

import java.io.Serializable;

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
public class Artalm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", length = 10, nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "LOCALIZACION", length = 100, nullable = true)
    @JsonView
    String localizacion;

    @Column(name = "PASILLO", length = 100, nullable = true)
    @JsonView
    String pasillo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
    Art art;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
    Alm alm;

}
