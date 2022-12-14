package com.example.ecomerce.project.service

import com.example.ecomerce.project.exceptions.ProductNotFoundException
import com.example.ecomerce.project.model.Product
import com.example.ecomerce.project.model.User
import com.example.ecomerce.project.repository.ProductRepository
import com.example.ecomerce.project.repository.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class ProductService
    (val productRepository: ProductRepository) {
        fun getAllProducts(): Flux<Product> {
            if(productRepository.findAll() == null){
                throw ProductNotFoundException("Ptoduct not found")
            }
           return productRepository.findAll()    }


    }
