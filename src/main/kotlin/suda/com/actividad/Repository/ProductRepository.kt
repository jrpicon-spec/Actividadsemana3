package suda.com.actividad.Repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import suda.com.actividad.Controller.Product
@Repository
interface ProductRepository: JpaRepository<Product, Int> {
}