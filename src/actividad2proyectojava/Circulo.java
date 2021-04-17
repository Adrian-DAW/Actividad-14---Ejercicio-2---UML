package actividad2proyectojava;

public class Circulo {

    private float radio;
    private Punto area;

    
     public Circulo(){}
    
    public Circulo(float r,float x, float y) {
        this.radio = r;
        this.area = new Punto(x,y);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area() {
        return (float) Math.PI * radio * radio;
    }

    public void imprimir() {
        area.imprimir();
        System.out.println("r=" + radio + " A=" + area());
    }
}
