import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Coche renault=new Coche();
camion gigante=new camion();

System.out.println("Tu coche tiene lo siguiente: " + renault.ruedas + " ruedas" + renault.puertas +
        "puertas" + renault.motor + " cv");

System.out.println("Tu camion tiene lo siguiente: " + gigante.peso + " toneladas" +
        gigante.capacidad + " kg" + gigante.potencia + " cv" + gigante.remolques + " remolques");



    }
}



