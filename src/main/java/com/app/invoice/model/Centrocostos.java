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
import jakarta.persistence.Id;
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
public class Centrocostos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
   
    @Column(name = "CENTROCOSTOS",length =20, nullable = false)
    @JsonView
    String centrocostos;

    @Column(name = "NIVELACCESO",length =50, nullable = true)
    @JsonView
    String nivelacceso;


    @Column(name = "DESCRIPCION",length =100, nullable = true)
    @JsonView
    String descripcion;


    @Column(name = "GRUPO",length =50, nullable = true)
    @JsonView
    String grupo;


    @Column(name = "TIENEMOVIMIENTOS", nullable = false)
    @JsonView
    Integer tienemovimientos;


    @Column(name = "ESACUMULATIVO", nullable = false)
    @JsonView
    Integer esacumulativo;


    @Column(name = "ESTATUS",length =15, nullable = true)
    @JsonView
    String estatus;


    @Column(name = "RAMA",length =20, nullable = true)
    @JsonView
    String rama;


    @OneToMany(mappedBy = "centrocostos", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Invd> invds;


}

