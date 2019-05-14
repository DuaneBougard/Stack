/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public interface SLinkedListInteger {
    public void displayList(); //displays the data on the list
    public int length(); //returns the number of nodes on the list
    public void addANodeToTheStart(Integer itemToAdd); //adds a node in front of the first node
    
    public SNodeInteger deleteHeadNode(); //Deletes the first node on the list
    public boolean isOnList(Integer dataItem); //Returns a reference to the first node containing the integer data item, returns null if data item is not on the list
}
