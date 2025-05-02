package FigurasGeometricas;

public class Circulo {
    private float radio;

    //contructor por defecto
    public Circulo() {
        this.radio = 2;
    }

    //contructor parametrizado
    public Circulo(float radio){
        this.radio = radio;
    }

    //getter
    public float getRadio(){
        return radio;
    }

    //setter
    public void setRadio(float radio){
        this.radio = radio;
    }

    //calcular area
    public float calcularArea(){
        float area = 3.14F * (radio * radio);
        return area;
    }

    //calcular perimetro
    public float calcularPerimetro(){
        float perimetro = (2 * 3.14F * radio);
        return perimetro;
    }

    //MAIN
    public static void main(String[] args){
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6);

        System.out.println("radio c1: " + c1.getRadio());
        float areac1 = c1.calcularArea();
        float perimetroc2 = c2.calcularPerimetro();
        System.out.println("area de c1: " + areac1);
        System.out.println("perimetro de c2: " + perimetroc2);
    }
}

