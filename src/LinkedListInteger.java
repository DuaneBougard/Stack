/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class LinkedListInteger implements SLinkedListInteger {
    private SNodeInteger head; //head node of the list
    private SNodeInteger tail;
    private long size; //number of nodes in the list
    /** Default constructor that creates an empty list */
    public LinkedListInteger()
    {
        head=null;
        tail=null;
        size=0;
    }
    
    public void displayList()
    {
        System.out.println("Displaying LinkedList data:");
        SNodeInteger tempDisplay = head;
        while (tempDisplay != null)
        {
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.getNext();
            System.out.println();
        }
        System.out.println();
    }
    
    public int length()
    {
        int count = 0;
        SNodeInteger current = this.getHead();
        while (current != null)
        {
            count++;
            current = current.getNext();
        }
        return count;
    }
    
    public void addANodeToTheStart(SNodeInteger itemToAdd)
    {
        if (isEmpty())
        {
            head=itemToAdd;
            tail=itemToAdd;
        }
        else
        {
            itemToAdd.setNext(head);
            head=itemToAdd;
        }
    }
    
        public SNodeInteger deleteHeadNode()
    {
        if(!isEmpty())
        {
            head = head.getNext();
            size-=1;
            System.out.println(head.getElement());
        }
        else System.out.println("Can't remove from the list, list is empty!");
        return null;
    }
    
    public boolean isOnList(Integer dataItem)
    {
        boolean foundValue=false;
        SNodeInteger temp=head;
        while((temp!=null)&&(foundValue==false)){
        if (temp.getElement().equals(dataItem)) foundValue=true;
        else temp=temp.getNext();
        }
        return foundValue;
    }
    
    /**return the size of the list
     * @return  */
    public long getSize()
    {
        return size;
    }
    /**return the head of the list
     * @return t*/
    public SNodeInteger getHead()
    {
        return head;
    }
    
    public SNodeInteger getTail()
    {
        return tail;
    }
    /**is the list empty
     * @return ?*/
    public boolean isEmpty()
    {
        return(head==null);
    }
    
    /**Add a new node n to tail of list*/
    public void addLast(SNodeInteger n){
        if (isEmpty()) {head=n; tail=n;}
        else {tail.setNext(n);head=n;}
    }
    /**Add note to tail of list containing a given value*/
    public void addLastValue(Integer s){
        SNodeInteger temp = new SNodeInteger(s,null);
        addLast(temp);
    }

    /** add node to front of list containing a given value */
    public void addValue(Integer s){
        SNodeInteger temp = new SNodeInteger(s,null);
        addFirst(temp);
    }

        /**add a new node at front of list */
    public void addFirst(SNodeInteger n){
        if (isEmpty()){head=n;tail=n;}
        else{n.setNext(head);head=n;}
    }

    @Override
    public void addANodeToTheStart(Integer itemToAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
