package Colores;

public enum Color {
    AZUL("#00f"),ROJO("#f00"),AMARILLO("#ff0"),NARANJA("#fa0"),BLANCO("#fff"),NEGRO("#000");
    private String codHexa;

    Color(String codHexa) {
        this.codHexa = codHexa;
    }

    public String getCodHexa() {
        return codHexa;
    }

    public void setCodHexa(String codHexa) {
        this.codHexa = codHexa;
    }
}