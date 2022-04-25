package br.edu.ufsj.ccomp.tecweb.bike.web.rest;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BikeResource {

    @GetMapping("/bikes")
    public ResponseEntity<Bike> findAllBikes() {
        //GET /api/v1/bikes
        return ResponseEntity.ok(null);
    }

    @GetMapping("/bikes/{id}")
    public ResponseEntity<Bike> findBike(@PathVariable("id") Long id) {
        //GET /api/v1/bikes/{id}
        return ResponseEntity.ok(null);
    }

    @PostMapping("/bikes")
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        //POST /api/v1/bikes
        return ResponseEntity.ok(null);
    }

    @PutMapping("/bikes/{id}")
    public ResponseEntity<Bike> updateBike(@PathVariable("id") Long id,
                                           @RequestBody Bike bike) {
        //PUT /api/v1/bikes
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/bikes/{id}")
    public ResponseEntity<Void> deleteBike(@PathVariable("id") Long id) {
        //DELETE /api/v1/bikes/{id}
        return ResponseEntity.noContent().build();
    }
}
