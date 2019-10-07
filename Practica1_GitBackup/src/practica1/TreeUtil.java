package practica1;
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
     * @param <T>
     * @param source
     * @param dest 
     */
    public static <T> void  clone(NAryTree<T> source, NAryTree<T> dest) {
        Queue <T> queue = new LinkedList<T>() ; //Crea una LinkedList cola
       if(dest.isEmpty()){
           queue.add((T) source.root());
           completarCola(source,quieue);
           
       
       }
    
    
    }

    /**
     * Modifies tree to make pos the root maintaining all the distances between nodes.
     * @param <T>
     * @param tree
     * @param pos 
     */
    public static <T> void rearranger(NAryTree<T> tree, Position<T> pos) {
        throw new RuntimeException("Not implemented yet");
    }
    
}
