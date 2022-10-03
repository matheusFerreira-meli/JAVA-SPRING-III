package springiii.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDetails {
    private String title, message;
    private int status;
    private LocalDateTime timestamps;
}
