package id.my.mirfanduri.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api/v1/demo"})
public class DemoController {

    @GetMapping
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("Welcome, you are using demo API", HttpStatus.OK);
    }
}
