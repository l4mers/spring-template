package com.coffeeculture.springtemplate.models;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {

    final private BrandRepository brandRepo;

    public List<Brand> findAll() {
        return brandRepo.findAll();
    }

    public Brand findBrandById(Integer id) {
        return brandRepo.findById(id).orElseThrow();
    }

    public Brand saveBrand(String brand) {
        return brandRepo.save(Brand.builder()
                        .brand(brand)
                .build());
    }
}
