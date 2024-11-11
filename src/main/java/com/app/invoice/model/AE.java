package com.app.invoice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;

import groovy.transform.ToString;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AE implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "ACTIVIDADECONOMICA", length = 100, nullable = true)
    @JsonView
    String actividadeconomica;

}
