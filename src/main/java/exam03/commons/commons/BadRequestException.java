package exam03.commons.commons;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}