package actividad2proyectojava;

public class Cono {

    private Circulo base;

    private float altura;

    private String color;
    
    public Cono(){}
    
    public Cono(float altura, String color,float radio,float x,float y) {
    
    this.base = new Circulo(radio,x,y);
    this.altura = altura;
    this.color = color; 
    
    }
    

   /* public Cono(float r, float h, String color, float x, float y) {
        this.base = new Circulo(r,y,x);
        this.altura = h;
        this.color = color;
    }*/

    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }
    

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   

    public void imprimir() {
        
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
