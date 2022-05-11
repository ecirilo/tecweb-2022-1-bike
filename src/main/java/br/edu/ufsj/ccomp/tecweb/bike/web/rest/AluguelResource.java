package br.edu.ufsj.ccomp.tecweb.bike.web.rest;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import br.edu.ufsj.ccomp.tecweb.bike.domain.Aluguel;
import br.edu.ufsj.ccomp.tecweb.bike.repository.AluguelRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AluguelResource {

    //curl -d '{"dataInicio":"2022-05-09", "dataTermino":"2022-05-10", "cliente":{"id":1}, "bikes":[{"id":1}] }' -H "Content-Type: application/json" -X POST http://localhost:8080/api/v1/alugueis
    //curl -X GET http://localhost:8080/api/v1/alugueis
    //curl -X GET http://localhost:8080/api/v1/alugueis/1
    //curl -X DELETE http://localhost:8080/api/v1/alugueis/1

    private final AluguelRepository aluguelRepository;

    public AluguelResource(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    @GetMapping("/alugueis")
    public ResponseEntity<List<Aluguel>> findAllAlugueis() {
        //GET /api/v1/alugueis
        List<Aluguel> alugueis = aluguelRepository.findAll();
        return ResponseEntity.ok(alugueis);
    }

    @GetMapping("/alugueis/{id}")
    public ResponseEntity<Aluguel> findAluguel(@PathVariable("id") Long id) {
        //GET /api/v1/alugueis/{id}
        Aluguel aluguel = aluguelRepository.findById(id).orElseThrow();
        return ResponseEntity.ok().body(aluguel);
    }

    @PostMapping("/alugueis")
    public ResponseEntity<Aluguel> createAluguel(@RequestBody Aluguel aluguel) throws URISyntaxException {
        //POST /api/v1/alugueis
        Aluguel createdAluguel = aluguelRepository.save(aluguel);
        return ResponseEntity
                .created(new URI("/api/alugueis/" + createdAluguel.getId()))
                .body(createdAluguel);
    }

    @PutMapping("/alugueis/{id}")
    public ResponseEntity<Aluguel> updateAluguel(@PathVariable("id") Long id,
                                           @RequestBody Aluguel aluguel) throws Exception {
        //PUT /api/v1/alugueis
        if (!aluguelRepository.existsById(id)) {
            throw new Exception();
        }

        Aluguel updatedAluguel = aluguelRepository.save(aluguel);
        return ResponseEntity.ok().body(updatedAluguel);
    }

    @DeleteMapping("/alugueis/{id}")
    public ResponseEntity<Void> deleteAluguel(@PathVariable("id") Long id) {
        //DELETE /api/v1/alugueis/{id}
        aluguelRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
