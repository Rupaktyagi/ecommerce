package com.rupak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rupak.dto.ProductDTO;

@Repository
public interface ProductDTODAO extends JpaRepository<ProductDTO, Integer> {

}
