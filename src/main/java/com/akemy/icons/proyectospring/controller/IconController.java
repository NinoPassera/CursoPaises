package com.akemy.icons.proyectospring.controller;


import com.akemy.icons.proyectospring.dto.IconBasicDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@GetMapping("/Icon")
public class IconController {

    @PostMapping
    public ResponseEntity<IconBasicDTO> save(@RequestBody IconBasicDTO iconBasicDTO){



    }

}
