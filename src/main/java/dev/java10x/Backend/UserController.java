package dev.java10x.Backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
   
   @GetMapping("/home")
   public String welcome() {
      return "Essa é minha primeira mensagem";
   }

}
