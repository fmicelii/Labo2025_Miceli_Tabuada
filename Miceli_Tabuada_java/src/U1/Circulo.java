package U1;

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
    public float calcularArea(float radio){
        float area = 3.14F * (radio * radio);
        return area;
    }

    //calcular perimetro
    public float calcularPerimetro(float radio){
        float perimetro = (float) (2 * 3.14F * radio);
        return perimetro;
    }

    //MAIN
    public static class Main{
        public static void main(String[] args){
            Circulo c1 = new Circulo();

            c1.setRadio(5);

            System.out.println("radio: " + c1.getRadio());
        }
    }
}

