package suda.com.actividad.Model

import jakarta.persistence.GenerationType

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue

import jakarta.persistence.Table
import javax.annotation.processing.Generated

@Entity
@Table(name = "product")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
}