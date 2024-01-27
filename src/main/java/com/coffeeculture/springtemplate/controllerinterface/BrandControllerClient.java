package com.coffeeculture.springtemplate.controllerinterface;

import com.coffeeculture.springtemplate.models.Brand;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/brand")
public interface BrandControllerClient {
    @Operation(
            summary = "Fetch all brands",
            description = "Fetch all brands"
    )
    @GetMapping
    ResponseEntity<List<Brand>> findAll();

    @Operation(
            summary = "Fetch one brand based on id",
            description = "Fetches one brand based on id",
            parameters =
                    @Parameter(
                     name = "id",
                     description = "id of a brand",
                     example = "1",
                     in = ParameterIn.PATH,
                     required = true
                    ))
    @GetMapping("/{id}")
    ResponseEntity<Brand> findBrandById(@PathVariable Integer id);

    @Operation(
            summary = "Save a new brand",
            description = "Save a new brand by providing the brand"
    )
    @PostMapping
    ResponseEntity<Brand> saveBrand(@RequestBody String brand);
}
