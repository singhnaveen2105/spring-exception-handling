package springexceptionhandling.springexceptionhandling;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class HomeController {
    private final PersonService personService;

    @GetMapping("/{id}")
    public Person get(String id) {
        return personService.get(id);
    }

}
