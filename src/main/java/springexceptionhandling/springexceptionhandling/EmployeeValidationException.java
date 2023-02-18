package springexceptionhandling.springexceptionhandling;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class EmployeeValidationException extends RuntimeException{
    public String errorCode;
    public EmployeeValidationException(String message,String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

}
