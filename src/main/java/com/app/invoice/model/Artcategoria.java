package com.app.invoice.model;

import java.io.Serializable;
import java.util.List;

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
public class Artcategoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "TIPOCATEGORIA", length = 100, nullable = true)
    @JsonView
    String tipocategoria;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    @JsonView
    String nombre;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonIgnore
//        @JoinColumn(name = "CUENTA", referencedColumnName = "CUENTA")
//    Cta cuenta;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonIgnore
//        @JoinColumn(name = "CUENTAFISCAL", referencedColumnName = "CUENTA")
//    Cta cuentafiscal;

    @Column(name = "VIDAUTIL", length = 100, nullable = false)
    @JsonView
    Integer vidautil;

    @Column(name = "VIDAUTILF", length = 100, nullable = false)
    @JsonView
    Integer vidautilf;

    @Column(name = "DEPRECIACION", length = 100, nullable = false)
    @JsonView
    String depreciacion;

    @Column(name = "DEPRECIACIONF", length = 100, nullable = false)
    @JsonView
    String depreciacionf;

    @OneToMany(mappedBy = "artcategoria", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Art> arts;



}
