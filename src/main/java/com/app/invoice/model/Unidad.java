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
public class Unidad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    @JsonView
    String nombre;

//    @Column(name = "FACTOR", scale = 8, precision = 18, nullable = true)
//    @JsonView
//    BigDecimal factor;
    @OneToMany(mappedBy = "unidadByidunidadtraspaso", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Art> artByidunidadtraspasos;

    @OneToMany(mappedBy = "unidadByidunidadcompra", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Art> artByidunidadcompras;

    @OneToMany(mappedBy = "unidadByidunidad", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Art> artByidunidads;

//    @OneToMany(mappedBy = "unidad", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JsonIgnore
//    List<Ventad> ventads;
}
