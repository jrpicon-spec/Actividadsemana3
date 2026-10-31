package suda.com.actividad.Service;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service;
import suda.com.actividad.Controller.Product
import suda.com.actividad.Repository.ProductRepository


@Service
class ProductServiceService{
    @Autowired
    lateinit var ProductRepository: ProductRepository

    fun listar(): List<Product>{
        return ProductRepository.findAll()
    }
}

