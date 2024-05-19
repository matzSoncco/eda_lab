import java.awt.*;
public class Ejercicio02 {
    public static void main (String[] args){
        Objeto obj1 = new Objeto(255, 0, 0, "Metal");
        obj1.setNombre("Objeto1");
        obj1.mostrar();
    }
}

class Color{
    static int r;
    static int g;
    static int b;
    
    public Color(int r, int g, int b){
        setRed(r);
        setGreen(g);
        setBlue(b);
    }

    public void setRed(int r) {
        this.r = r;
    }

    public static int getRed() {
        return r;
    }

    public void setGreen(int g) {
        this.g = g;
    }

    public static int getGreen() {
        return g;
    }

    public void setBlue(int b) {
        this.b = b;
    }

    public static int getBlue() {
        return b;
    }

    public String getColorName() {
        if (getRed() == 255 || getGreen() == 0 || getBlue() == 0){
            return "Rojo";
        }
        else if (getRed() == 0 || getGreen() == 255 || getBlue() == 0){
            return "Verde";
        }
        else if (getRed() == 0 || getGreen() == 0 || getBlue() == 255){
            return "Azul";
        }
        else{
            return "wa";
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
    public Objeto(int r, int g, int b, String material) {
        super(r, g, b, material);
    }

    String nombre;

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