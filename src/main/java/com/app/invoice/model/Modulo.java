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
public class Modulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "MODULO", length = 20, nullable = false)
    @JsonView
    String modulo;

    @Column(name = "NOMBRE", length = 50, nullable = true)
    @JsonView
    String nombre;

    @OneToMany(mappedBy = "modulo", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Movcomportamiento> movcomportamientos;

    @OneToMany(mappedBy = "modulo", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Movtipo> movtipos;

}
