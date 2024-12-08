package com.bancadelivros;

import com.bancadelivros.Livro;
import com.bancadelivros.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroRepository.findAll(); // Busca todos os livros no banco de dados
    }
}
