package ico.fesa.unam.mx;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static List<Integer> eliminarDuplicados(List<Integer> listaOriginal){
        Set<Integer> conjunto = new HashSet<>();
        for (Integer item:  listaOriginal) {
            conjunto.add(item);
        }
        return conjunto.stream().toList();
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de Sets");
        //lista_con_duplicados = [1,2,3,2,3,4,5,6,6,7,8,8,1,4,6,5,1,2]
        List<Integer> listaConDuplicados = List.of(1,2,3,2,3,4,5,6,6,7,8,8,1,4,6,5,1,2);
        System.out.println(eliminarDuplicados(listaConDuplicados));

    }
}