package gr.aueb.cf.rest_starter9.api;

import gr.aueb.cf.rest_starter9.dto.HelloReadOnlyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloRestController {

    @RequestMapping("/hello")
    public ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/hello-coding")
    public ResponseEntity<HelloReadOnlyDTO> helloCoding() {
        HelloReadOnlyDTO dto = new HelloReadOnlyDTO("Hello from Coding Factory!");
        return ResponseEntity.ok(dto);
    }
}
