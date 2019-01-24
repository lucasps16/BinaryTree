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
public class BinaryTree<T> {
    private BinaryTree<T> root;

    public BinaryTree(T data) {
        createLeaf(data);
    }
    
    public void createLeaf(T data) {
        root = new BinaryNode<T>(data);
    }
    
    
    
   
    

   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

   
    
}
