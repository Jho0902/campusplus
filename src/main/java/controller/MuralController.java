package controller;


import entity.Mural;
import org.springframework.web.bind.annotation.*;
import repositories.MuralRepository;

import java.util.List;

@RestController
@RequestMapping("/api/mural")
public class MuralController {

    private final MuralRepository repository;

    public MuralController(MuralRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Mural> listar (){

        return repository.findAll();

    }

    @PostMapping
    public Mural criar (@RequestBody Mural mural){

        return repository.save(mural);

    }

}
