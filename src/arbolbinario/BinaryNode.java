/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Estudiante
 */
public class BinaryNode<T> implements Comparable<T>{
    T data;
    BinaryTree<T> izq;
    BinaryTree<T> der;

    public BinaryNode(T data, BinaryTree<T> izq, BinaryTree<T> der) {
        this.data = data;
        this.izq = izq;
        this.der = der;
    }

    public BinaryNode( T data){
        this.data = data;
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
