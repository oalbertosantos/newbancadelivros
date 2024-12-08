package com.bancadelivros.bancadelivros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bancadelivros.bancadelivros", "com.bancadelivros.LivroController", "com.bancadelivros.LivroRepository", "com.bancadelivros.Livro"})
public class BancaDeLivrosApplication {
    public static void main(String[] args) {
        SpringApplication.run(BancaDeLivrosApplication.class, args);
        System.out.println("Aplicação Banca de Livros iniciada com sucesso!");
    }
}

