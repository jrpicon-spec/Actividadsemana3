package suda.com.actividad.Controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ProductController {
    @GetMapping("/hola")
    fun saludo (): String {
        return "hola mundo"
    }
}

