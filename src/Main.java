import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList alumnos = Data.listaDeAlumnos();

        for ( Object cadaObjeto : alumnos) {
            System.out.println(cadaObjeto);
        }
    }
}