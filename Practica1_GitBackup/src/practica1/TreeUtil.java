package practica1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import material.Position;
import material.tree.narytree.NAryTree;

/**
 *
 * @author jvelez
 */
public class TreeUtil {

    /**
     * Clone source in dest. Dest must be a empty tree.
     *
     * @param <T>
     * @param source
     * @param dest
     */
    public static <T> void clone(NAryTree<T> source, NAryTree<T> dest) {
        //Crea una LinkedList cola
        if (source.isEmpty() && dest.isEmpty()) {
            //Try catch?
            System.out.println("Ambos arboles estan vacios");
        }
        if (!dest.isEmpty()) {
            //Try catch 
            System.out.println("El arbol que me has dado como destino no esta vacio");
        } else {
            Queue <T> queue = new LinkedList<>();
            queue.add((T) source.root());            
            for (T node: queue) {
            }
            dest.addRoot(queue.element());
            T aux = queue.element();
                for (T n : queue) {
                    if (n.father.equals (aux)) {
                        //Se comprueba si el padre  es aux, si lo es se añade al arbol como hijo de aux. sino, se establece el padre como nuevo padre
                        //y se añade el hijo al nuevo padre en el arbol .
                    
                      
                    }
                }

        }

    }

    /**
     * Modifies tree to make pos the root maintaining all the distances between
     * nodes.
     *
     * @param <T>
     * @param tree
     * @param pos
     */
    public static <T> void rearranger(NAryTree<T> tree, Position<T> pos) {
        throw new RuntimeException("Not implemented yet");
    }

}
