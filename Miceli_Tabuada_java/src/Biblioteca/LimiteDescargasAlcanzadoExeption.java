package Biblioteca;

public class LimiteDescargasAlcanzadoExeption extends RuntimeException {
    public LimiteDescargasAlcanzadoExeption(String message) {
        super(message);
    }
}
