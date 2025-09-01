package Biblioteca;

public class LibroNoExiseException extends RuntimeException {
    public LibroNoExiseException(String message) {
        super(message);
    }
}
