package com.bluescript.productdefinition.controller;

import com.bluescript.productdefinition.entity.ProductDefinitionEntity;
import com.bluescript.productdefinition.exception.NoRecordFoundException;
import com.bluescript.productdefinition.request.ProductDefinitionRequest;
import com.bluescript.productdefinition.response.ProductDefinitionDeleteResponse;
import com.bluescript.productdefinition.service.ProductDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/productDefinition")
public class ProductDefinitionController {

    @Autowired
    ProductDefinitionService productDefinitionService;

    @PostMapping
    public ProductDefinitionEntity createProductDef(@RequestBody @Valid ProductDefinitionRequest productDefinitionRequest){
        return productDefinitionService.createProductDef(productDefinitionRequest);
    }

    @GetMapping("/{productCode}")
    public ProductDefinitionEntity getProductDef(@PathVariable("productCode") String productCode) throws NoRecordFoundException {
        return productDefinitionService.getProductDef(productCode);
    }

    @PutMapping("{productCode}")
    public ProductDefinitionEntity updateProductDef(@PathVariable ("productCode") String productCode,@RequestBody @Valid ProductDefinitionRequest productDefinitionRequest) throws NoRecordFoundException {
        return productDefinitionService.updateProductDef(productCode,productDefinitionRequest);
    }

    @DeleteMapping("{productCode}")
    public ProductDefinitionDeleteResponse deleteProductDef(@PathVariable("productCode") String productCode) throws NoRecordFoundException {
        return productDefinitionService.deleteProductDef(productCode);
    }

}
