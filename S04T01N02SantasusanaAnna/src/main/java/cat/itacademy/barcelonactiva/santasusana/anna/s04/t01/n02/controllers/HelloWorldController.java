package cat.itacademy.barcelonactiva.santasusana.anna.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", required = false, defaultValue = "Unknown") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable Optional<String> nom){
        return "Hola, " + nom.orElse("Unknown") + ". Estàs executant un projecte Gradle";
    }

}
