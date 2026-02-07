package com.keljoias.service;

import com.keljoias.model.Product;
import com.keljoias.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public List<Product> listarTodos(){
        return repository.findAll();
    }
    public Product salvar(Product product){
        return repository.save(product);
    }
    public Product buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto nao encontrado"));
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
