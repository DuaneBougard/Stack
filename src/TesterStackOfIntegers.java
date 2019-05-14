
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class TesterStackOfIntegers {
    public void Menu()
    {
        System.out.println("Menu: Select an operation from 1 to 6.");
        System.out.println("1 - Get the Height of the stack.");
        System.out.println("2 - Is the stack empty?");
        System.out.println("3 - Push/add an element to the stack.");
        System.out.println("4 - Pop an element.");
        System.out.println("5 - Reveal the top element.");
        System.out.println("6 - Display the list.");
    }
    
        public static void main(String[] args) 
        {
            SNodeInteger li = new SNodeInteger(1,null);
            SNodeInteger li2 = new SNodeInteger(2,li);
            SNodeInteger li3 = new SNodeInteger(3,li2);
            SNodeInteger li4 = new SNodeInteger(4,li3);
            LinkedStackInteger list = new LinkedStackInteger();
            list.push(li);
            list.push(li2);
            list.push(li3);
            list.push(li4);
            TesterStackOfIntegers object = new TesterStackOfIntegers();
            object.Menu();
            Scanner key = new Scanner(System.in);
            int responce = key.nextInt();
            while (responce!=0)
            {
            if(responce == 1){System.out.println("Result:");list.getHeight();}
            else if(responce == 2){System.out.println("Result:");list.isEmpty();}
            else if(responce == 3){
                System.out.println("Result:");
                System.out.println("Please enter a number to push/add:");
                int num = key.nextInt();
                SNodeInteger li5 = new SNodeInteger(num,null);
                list.push(li5);}
            else if(responce == 4){System.out.println("Result:");list.pop();}
            else if(responce == 5){System.out.println("Result:");list.head();}
            else if(responce == 6){System.out.println("Result:");list.display();}
            else
                System.out.println("Please enter a valid number! eg. 1,2,3,4,5 or 6");
            System.out.println("Insert an operation:");
            responce = key.nextInt();
            }
            
        }

}
