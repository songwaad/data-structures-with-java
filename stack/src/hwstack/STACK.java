/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwstack;

/**
 *
 * @author Dell
 */
public class STACK {

    int MAXSTK;
    int DATA[];
    int TOP;

    public STACK(int maxstk) {
        MAXSTK = maxstk - 1;
        DATA = new int[maxstk];
        TOP = -1;
    }

    public void PUSH(int ITEM) {
        if (TOP == MAXSTK) {
            System.out.println("OVERFLOW");
        } else {
            TOP++;
            System.out.println("PUSH :" + ITEM + "  OK.");
            DATA[TOP] = ITEM;
        }
    }

    public int POP() {
        int ITEM = 1;
        if (TOP == -1) {
            System.out.println("UNDERFLOW");
        } else {
            ITEM = DATA[TOP];
            TOP--;
        }
        System.out.println("Pop Data: " + ITEM);
        return ITEM;
    }

}
