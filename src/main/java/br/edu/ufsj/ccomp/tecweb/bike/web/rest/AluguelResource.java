package br.edu.ufsj.ccomp.tecweb.bike.web.rest;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import br.edu.ufsj.ccomp.tecweb.bike.domain.Aluguel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AluguelResource {

    @GetMapping("/alugueis")
    public ResponseEntity<Aluguel> findAllAlugueis() {
        //GET /api/v1/alugueis
        return ResponseEntity.ok(null);
    }

    @GetMapping("/alugueis/{id}")
    public ResponseEntity<Bike> findAluguel(@PathVariable("id") Long id) {
        //GET /api/v1/alugueis/{id}
        return ResponseEntity.ok(null);
    }

    @PostMapping("/alugueis")
    public ResponseEntity<Aluguel> createBike(@RequestBody Aluguel aluguel) {
        //POST /api/v1/alugueis
        return ResponseEntity.ok(null);
    }

    @PutMapping("/alugueis/{id}")
    public ResponseEntity<Aluguel> updateAluguel(@PathVariable("id") Long id,
                                           @RequestBody Aluguel aluguel) {
        //PUT /api/v1/bikes
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/alugueis/{id}")
    public ResponseEntity<Void> deleteAluguel(@PathVariable("id") Long id) {
        //DELETE /api/v1/bikes/{id}
        return ResponseEntity.noContent().build();
    }
}
