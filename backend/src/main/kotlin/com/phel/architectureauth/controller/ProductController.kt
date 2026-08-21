package com.phel.architectureauth.controller

import com.phel.architectureauth.dto.ProductDto
import com.phel.architectureauth.dto.UserDto
import com.phel.architectureauth.service.ProductService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(
    private val productService: ProductService
) {

    @GetMapping
    fun loadProducts(
        @RequestParam("q", required = false) query: String?
    ): List<ProductDto> {
        return productService.getProducts(query)
    }

    @PostMapping
    fun postProduct(
        @Valid @RequestBody productDto: ProductDto
    ): ProductDto {
        return productService.insertProduct(productDto)
    }

    @PutMapping
    fun putProduct(
        @Valid @RequestBody productDto: ProductDto
    ): ProductDto{
        return productService.updateProduct(productDto)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(
        @PathVariable("id") id: Long
    ) {
        return productService.deleteProduct(id)
    }
}