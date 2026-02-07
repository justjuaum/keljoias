package com.keljoias.controller;

import com.keljoias.model.Product;
import com.keljoias.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }
    @GetMapping
    public List<Product> listarProdutos(){
        return service.listarTodos();
    }
    @PostMapping
    public Product criarProduto(@RequestBody Product product){
        return service.salvar(product);
    }
    @GetMapping
    public Product buscarProduto(@PathVariable Long id){
        return service.buscarPorId(id);
    }
    @DeleteMapping
    public void deletarProduto(@PathVariable Long id) {
        service.deletar(id);
    }

}
