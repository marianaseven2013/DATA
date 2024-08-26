import java.util.ArrayList;
import java.util.List;

public class Data {

    public static ArrayList listaDeAlumnos (){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose","Orellana", 18));
        alumnos.add(new Alumno("Mynor","Calderon",16));
        alumnos.add(new Alumno("Hector","Pocon",19));
        alumnos.add(new Alumno("Dania","Luna",20));
        alumnos.add(new Alumno("Sofia","Perez",17));

        return alumnos;
    }
}
