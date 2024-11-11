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
public class Usuariosistema implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "USUARIO_SISTEMA", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer usuarioSistema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "SISTEMA", referencedColumnName = "SISTEMA")
    Sistemas sistemas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "USUARIO", referencedColumnName = "USUARIO")
    Usuario usuario;

    @Transient
    @JsonView
    String estatusdelete;



}
