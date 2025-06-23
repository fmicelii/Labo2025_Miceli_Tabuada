package FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
    private double radio;

    //contructor por defecto
    public Circulo() {
        this.radio = 2;
    }

    //contructor parametrizado
    public Circulo(double radio){
        this.radio = radio;
    }

    //getter
    public double getRadio(){
        return radio;
    }

    //setter
    public void setRadio(double radio){
        this.radio = radio;
    }

    //calcular area
    public double calcularArea(float base, float altura){
        double area = 3.14F * (radio * radio);
        return area;
    }

    //calcular perimetro
    public double calcularPerimetro(float base, float altura){
        double perimetro = (2 * 3.14F * radio);
        return perimetro;
    }

    //MAIN
    public static void main(String[] args){
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6);
        Rectangulo r1 = new Rectangulo();

        System.out.println("radio c1: " + c1.getRadio());
        double areac1 = c1.calcularArea(r1.getBase(), r1.getAltura());
        double perimetroc2 = c2.calcularPerimetro(r1.getBase(), r1.getAltura());
        System.out.println("area de c1: " + areac1);
        System.out.println("perimetro de c2: " + perimetroc2);
    }
}

