package br.edu.ufsj.ccomp.tecweb.bike.web.rest;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import br.edu.ufsj.ccomp.tecweb.bike.repository.BikeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BikeResource {

    private BikeRepository bikeRepository;

    public BikeResource(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping("/bikes")
    public ResponseEntity<List<Bike>> findAllBikes() {
        List<Bike> bikes = bikeRepository.findAll();
        return ResponseEntity.ok(bikes);
    }

    @GetMapping("/bikes/{id}")
    public ResponseEntity<Bike> findBike(@PathVariable("id") Long id) {
        Bike bike = bikeRepository.findById(id).orElseThrow();
        return ResponseEntity.ok().body(bike);
    }

    @PostMapping("/bikes")
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) throws URISyntaxException {
        Bike createdBike = bikeRepository.save(bike);
        return ResponseEntity
                .created(new URI("/api/bikes/" + createdBike.getId()))
                .body(createdBike);
    }

    @PutMapping("/bikes/{id}")
    public ResponseEntity<Bike> updateBike(@PathVariable("id") Long id,
                                           @RequestBody Bike bike) throws Exception {

        if (!bikeRepository.existsById(id)) {
            throw new Exception();
        }

        Bike updatedBike = bikeRepository.save(bike);
        return ResponseEntity.ok().body(updatedBike);
    }

    @DeleteMapping("/bikes/{id}")
    public ResponseEntity<Void> deleteBike(@PathVariable("id") Long id) {
        bikeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
