package springexceptionhandling.springexceptionhandling;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class ErrorResponse {
    private String errorMessage;
    private String errorCode;
}
