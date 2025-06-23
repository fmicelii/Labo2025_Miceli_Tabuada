package FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
    private float base, altura;

    public Rectangulo(){
        this.base = 3;
        this.altura = 5;
    }
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }

    public void setBase(float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea(float base, float altura) {
        float area = this.base * this.altura;
        return area;
    }

    @Override
    public double calcularPerimetro(float base, float altura) {
        float perimetro = 2* this.base + 2* this.altura;
        return perimetro;
    }

    //MAIN
    public static class Main{
        public static void main(String[] args){
            Rectangulo r1 = new Rectangulo(2,4);

            System.out.println("base: " + r1.getBase());
            System.out.println("altura: " + r1.getAltura());
            System.out.println("area calculada: " + r1.calcularArea(r1.getBase(), r1.getAltura()));
            System.out.println("perimetro calculada: " + r1.calcularPerimetro(r1.getBase(), r1.getAltura()));
        }
    }
}
