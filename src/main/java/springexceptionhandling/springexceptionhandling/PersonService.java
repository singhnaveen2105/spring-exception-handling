package springexceptionhandling.springexceptionhandling;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person get(String id) {
        return personRepository.findById(id).orElseThrow(() -> new EmployeeValidationException("validation failed","EMPLOYEE_INVALID"));
    }
}
