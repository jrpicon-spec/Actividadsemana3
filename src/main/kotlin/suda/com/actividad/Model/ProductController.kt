package suda.com.actividad.Model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import suda.com.actividad.Controller.Product
import suda.com.actividad.Repository.ProductRepository

@Controller("/product")
@RestController
class ProductControllerController {
    @Autowired
    private lateinit var productRepository: ProductRepository
    @GetMapping
    fun list(): List<Product> {
        return productRepository.findAll()
    }
}
@PostMapping("/guardar")
@ResponseStatus(HttpStatus .CREATED)
fun guardar(@RequestBody product: Product): Product {
    println("Llego: description+${product.description}, price ${product.price}, stock ${product.stock}")
    return TODO("Provide the return value")
}