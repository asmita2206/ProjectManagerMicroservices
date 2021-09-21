package com.bluescript.productdefinition.repository;

import com.bluescript.productdefinition.entity.ProductDefinitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductDefinitionRepo extends JpaRepository<ProductDefinitionEntity,String> {

    Optional<ProductDefinitionEntity> findByProductCode(String productCode);
}
