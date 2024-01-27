package com.coffeeculture.springtemplate.models;

import com.coffeeculture.springtemplate.controllerinterface.BrandControllerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BrandController implements BrandControllerClient {
    final private BrandService brandService;

    @Override
    public ResponseEntity<List<Brand>> findAll() {
        return ResponseEntity.ok(brandService.findAll());
    }

    @Override
    public ResponseEntity<Brand> findBrandById(Integer id) {
        return ResponseEntity.ok(brandService.findBrandById(id));
    }

    @Override
    public ResponseEntity<Brand> saveBrand(String brand) {
        return ResponseEntity.ok(brandService.saveBrand(brand));
    }
}
