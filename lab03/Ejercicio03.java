public class Ejercicio03 {
    public static void main (String[] args){
        Ganso animal1 = new Ganso(2, 1, 2, true, true, "graznido", "grande");
        Pato animal2 = new Pato(2, 1, 2, true, true, true, "parpeo");
        Gallina animal3 = new Gallina(2, 1, 2, true, true, true, "cacareo");

        animal1.mostrarGanso();
        animal2.mostrarPato();
        animal3.mostrarGallina();
    }
}

class Ave{
    int patas, pico, ojos;
    boolean oviparos, vuelan;

    public Ave(int patas, int pico, int ojos, boolean oviparos, boolean vuelan){
        this.patas = patas;
        this.pico = pico;
        this.ojos = ojos;
        this.oviparos = oviparos;
        this.vuelan = vuelan;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPico(int pico) {
        this.pico = pico;
    }

    public int getPico() {
        return pico;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public int getOjos() {
        return ojos;
    }
    
    public void setOviparos(boolean oviparos) {
        this.oviparos = oviparos;
    }

    public String areOviparos() {
        return "Si";
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }

    public String isVuelan() {
        return "si";
    }
}

class Pato extends Ave{
    boolean acuatico;
    String onomatopeya;

    public Pato(int patas, int pico, int ojos, boolean ponenHuevos, boolean vuelan, boolean acuatico, String onomatopeya) {
        super(patas, pico, ojos, ponenHuevos, vuelan);
        this.acuatico = acuatico;
        this.onomatopeya = onomatopeya;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public String isAcuatico() {
        return "nadar";
    }

    public void setOnomatopeya(String onomatopeya){
        this.onomatopeya = onomatopeya;
    }

    public String getOnomatopeya(){
        return onomatopeya;
    }

    public void mostrarPato(){
        System.out.println("El pato es un ave con " + getPatas()+ " patas, " + getPico()
        + " pico, " + getOjos()+" ojos. "+ areOviparos()+"\n pone huevos, " + isVuelan() + " vuela, puede "
        + isAcuatico() + " y hace un " + getOnomatopeya() + " como sonido.");
    }
}

class Ganso extends Ave{
    String onomatopeya, tamano;

    public Ganso(int patas, int pico, int ojos, boolean ponenHuevos, boolean vuelan, String onomatopeya, String tamano) {
        super(patas, pico, ojos, ponenHuevos, vuelan);
        this.onomatopeya = onomatopeya;
        this.tamano = tamano;
    }

    public void setOnomatopeya(String onomatopeya) {
        this.onomatopeya = onomatopeya;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void mostrarGanso(){
        System.out.println("El ganso es un ave con " + getPatas()+ " patas, " + getPico()
        + " pico, " + getOjos()+" ojos. "+ areOviparos()+"\n pone huevos, " + isVuelan() + " vuela, es de un tamaño "
        + getTamano() + " y hace un " + getOnomatopeya() + " como sonido.");
    }
}

class Gallina extends Ave{
    boolean domestica;
    String onomatopeya;
    public Gallina(int patas, int pico, int ojos, boolean ponenHuevos, boolean vuelan, boolean domestica, String onomatopeya) {
        super(patas, pico, ojos, ponenHuevos, vuelan);
        this.domestica = domestica;
        this.onomatopeya = onomatopeya;
    }

    public void setDomestica(boolean domestica) {
        this.domestica = domestica;
    }

    public String isDomestica() {
        return "domestica";
    }

    public void setOnomatopeya(String onomatopeya) {
        this.onomatopeya = onomatopeya;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public void mostrarGallina(){
        System.out.println("La gallina es un ave con " + getPatas()+ " patas, " + getPico()
        + " pico, " + getOjos()+"ojos. "+ areOviparos()+"\n pone huevos, " + isVuelan() + " vuela, es "
        + isDomestica() + " y hace un " + getOnomatopeya() + " como sonido.");
    }
}