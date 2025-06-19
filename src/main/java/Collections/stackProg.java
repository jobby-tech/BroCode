package Collections;

import java.util.Stack;

public class stackProg {

    public static void main(String[] args) {

        Stack<Integer> stk = new Stack();
        stk.add(7);
        stk.add(3);

        System.out.println(stk.get(0));
        System.out.println(stk);

        stk.remove(0);
        System.out.println(stk);

    }
}
