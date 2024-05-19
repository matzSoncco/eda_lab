import java.util.*;
public class Ejercicio02 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el objeto:");
        String objeto = sc.next();

        System.out.println("Ingrese los valores para R, G y B");
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Ingrese el material del objeto");
        String material = sc.next();
        
        Objeto obj1 = new Objeto(r, g, b, material, objeto);
        obj1.mostrar();
    }
}

class Color{
    int r, g, b;
    
    public Color(int r, int g, int b){
        setRed(r);
        setGreen(g);
        setBlue(b);
    }

    public void setRed(int r) {
        this.r = r;
    }

    public int getRed() {
        return r;
    }

    public void setGreen(int g) {
        this.g = g;
    }

    public int getGreen() {
        return g;
    }

    public void setBlue(int b) {
        this.b = b;
    }

    public int getBlue() {
        return b;
    }

    public String getColorName() {
        /*
         * Este método es amplio ya que se necesitaría el valor rgb de cada color
         * De este modo solo se colocan los 3 colores principales
         */
        if (getRed() == 255 && getGreen() == 0 && getBlue() == 0){
            return "rojo";
        }
        else if (getRed() == 0 && getGreen() == 255 && getBlue() == 0){
            return "verde";
        }
        else if (getRed() == 0 && getGreen() == 0 && getBlue() == 255){
            return "azul";
        }
        else{
            //Al no tener referencia de cierto colo se pone variado
            return "variado";
        }
    }
}

class Material extends Color{
    String material;

    public Material(int r, int g, int b, String material){
        super(r, g, b);
        setMaterial(material);
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}

class Objeto extends Material{
    String nombre;

    public Objeto(int r, int g, int b, String material, String nombre) {
        super(r, g, b, material);
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrar(){
        System.out.println(getNombre() + " de color " + getColorName() + " y material de " + getMaterial());
    }
}