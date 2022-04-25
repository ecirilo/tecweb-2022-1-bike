package br.edu.ufsj.ccomp.tecweb.bike.web.rest;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import br.edu.ufsj.ccomp.tecweb.bike.domain.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteResource {

    @GetMapping("/clientes")
    public ResponseEntity<Cliente> findAllClientes() {
        //GET /api/v1/clientes
        return ResponseEntity.ok(null);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Bike> findCliente(@PathVariable("id") Long id) {
        //GET /api/v1/clientes/{id}
        return ResponseEntity.ok(null);
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> createBike(@RequestBody Cliente cliente) {
        //POST /api/v1/clientes
        return ResponseEntity.ok(null);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("id") Long id,
                                           @RequestBody Cliente cliente) {
        //PUT /api/v1/bikes
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long id) {
        //DELETE /api/v1/bikes/{id}
        return ResponseEntity.noContent().build();
    }
}
