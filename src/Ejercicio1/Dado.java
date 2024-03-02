package Ejercicio1;

public class Dado {
    private int caras;
    private int ultimaCara;

    public Dado(int caras) {
        this.caras = caras;
    }

    public Dado(){
        this(6);
    }
    //Métodos getters para los dos atributos
    public int getCaras() {
        return caras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }
    //Método setter para cambiar el número de caras
    public void setCaras(int caras) {
        this.caras = caras;
    }

    //Método para tirar el dado
    public int tirarDado() {
        ultimaCara = (int) (Math.random() * caras) + 1;
        return ultimaCara;
    }


}
