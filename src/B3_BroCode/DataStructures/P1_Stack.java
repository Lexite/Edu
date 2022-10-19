package B3_BroCode.DataStructures;

import java.util.Stack;
// *****************************************************

// stack = LIFO data structure. Last-In First-Out
//               stores objects into a sort of "vertical tower"
//    push() to add objects to the top
//    pop() to remove objects from the top

// uses of stacks?
// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)

// *****************************************************

public class P1_Stack {
	public static void main(String[] args) {

    Stack<String> stackEx = new Stack<String>();

    //System.out.println(stackEx.empty());

		stackEx.push("Minecraft");
		stackEx.push("Skyrim");
		stackEx.push("DOOM");
		stackEx.push("Borderlands");
		stackEx.push("FFVII");

    //String myFavGame = stack.pop();
    //System.out.println(stack.peek());
    //System.out.println(stack.search("Fallout76"));

		System.out.println(stackEx);
	}

}
