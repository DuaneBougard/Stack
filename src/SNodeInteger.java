/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class SNodeInteger {
    Integer element; //assume elements are strings
    SNodeInteger next;
    /** Creates a node with null references to its element
    *and next node. */
    public SNodeInteger() {
        this(null,null);
    }
    /** Creates a node with the given element
    *and next node. */
    public SNodeInteger(Integer s,SNodeInteger n) {
        element = s;
        next = n;
    }
    // Accessor methods:
    public Integer getElement() {
        return element;
    }
    public SNodeInteger getNext() {
        return next;
    }
    // Modifier methods:
    public void setElement(Integer s) {
        element = s;
    }
    public void setNext(SNodeInteger n) {
        next = n;
    }
    public void displayNode()
    {
        System.out.print(element+"");
    }
}

