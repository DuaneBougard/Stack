
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class LinkedStackInteger {
    private SNodeInteger top;
    private int size;
    LinkedListInteger list = new LinkedListInteger();
    
    public LinkedStackInteger()
    {
        top = null;
        size = 0;
    }
    
    public int getHeight()
    {
        System.out.println("4");
        return ((int)list.getSize());
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public void push(SNodeInteger element)
    {
        list.addANodeToTheStart(element);
        list.addFirst(element);
        /**list.displayList();*/
        /**SNodeInteger oldHead = top;
        top = new SNodeInteger();
        top.setElement(element.getElement());
        top.setNext(oldHead);
        size++;*/
    }
    
    public void pop()
    {
        if(!list.isEmpty()){list.deleteHeadNode();}
        /**while (!list.isEmpty()){list.deleteHeadNode();list.displayList();}*/

        /**Integer element = top.getElement();
        top=top.getNext();
        size--;
        return element;*/
    }
    
    public Integer head()
    {
        if (isEmpty())
        {throw new NoSuchElementException("Stack underflow");}
        return top.getElement();
        
    }
    
    public void display()
    {
        list.displayList();
        /**SNodeInteger current = top;
        while(current != null)
        {
            current.displayNode();
            current = current.prev;*/
    }
}
