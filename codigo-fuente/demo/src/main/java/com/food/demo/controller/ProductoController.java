package com.food.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @GetMapping
    public List<String> listar() {
        return new ArrayList<>();
    }
}
