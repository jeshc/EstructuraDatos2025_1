package ico.fesa.unam.mx.listas;

public class NodoMainRepaso {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo<>(11);
        head.setSiguiente(new Nodo<>(22));
        head.getSiguiente().setSiguiente(new Nodo<>(33));

        // recorrer
        Nodo<Integer> aux = head;
        while (aux != null){
            //System.out.print(aux.getDato() + "--> ");
            System.out.println(aux);
            aux = aux.getSiguiente();
        }

        head.getSiguiente().setSiguiente(new Nodo<>(29, head.getSiguiente().getSiguiente()));

        aux = head;
        while (aux != null){
            System.out.print(aux.getDato() + "--> ");
            //System.out.println(aux);
            aux = aux.getSiguiente();
        }

        head = new Nodo<>(5, head);
        System.out.println(".....");
    aux = head;
        while (aux != null){
            System.out.print(aux.getDato() + "--> ");
            //System.out.println(aux);
            aux = aux.getSiguiente();
        }


    }
}
