package suda.com.actividad.Controller

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table (name = "product")
class Product {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column (updatable = false)
    val id: Int? = null
    val description: String? = null
    val price: BigDecimal = BigDecimal.ZERO
    val stock: Int? = null
}

