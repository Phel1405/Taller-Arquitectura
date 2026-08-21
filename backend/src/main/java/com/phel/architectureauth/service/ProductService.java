package com.phel.architectureauth.service;

import com.phel.architectureauth.dto.ProductDto;
import com.phel.architectureauth.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getProducts(String query) {
        if (query != null) {
            return productRepository
                    .findByNombreContainsIgnoreCase(query)
                    .stream()
                    .map(ProductMapperKt::toDto)
                    .toList();
        } else {
            return productRepository
                    .findAll()
                    .stream()
                    .map(ProductMapperKt::toDto)
                    .toList();
        }
    }

    public ProductDto insertProduct(ProductDto product) {
        return ProductMapperKt.toDto(
                productRepository.save(ProductMapperKt.toEntity(product))
        );
    }

    public ProductDto updateProduct(ProductDto product) {
        return ProductMapperKt.toDto(
                productRepository.save(ProductMapperKt.toEntity(product))
        );
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
