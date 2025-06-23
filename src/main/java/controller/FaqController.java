package controller;


import entity.Faq;
import org.springframework.web.bind.annotation.*;
import repositories.FaqRepository;

import java.util.List;

@RestController
@RequestMapping("/api/faq")
public class FaqController {

    private final FaqRepository repository;
    public FaqController(FaqRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Faq> listar(){

        return repository.findAll();

    }

    @PostMapping
    public Faq criar (@RequestBody Faq faq){

        return repository.save(faq);

    }

}
