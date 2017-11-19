package DataStructures.Stack.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/simple-text-editor/problem
 */
public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        StringBuilder textEditor = new StringBuilder("");
        int type = 0;
        String appendString = null;
        int deleteLastCharacters;
        String lastDeleteCharacters="";

        int printKCharacter;
        List<Character> result = new ArrayList<>();

        Stack<String> stack = new Stack<>();
        for(int i = 1; i <= q; i++) {
            type = scanner.nextInt();

            if(type == 1) { // append(W)
                appendString = scanner.next();
                textEditor.append(appendString);
                stack.push(type +","+appendString);
            }

            if(type == 2) { // delete(k) last k characters
                deleteLastCharacters = scanner.nextInt();
                lastDeleteCharacters = textEditor.substring(textEditor.length()- deleteLastCharacters, textEditor.length());
                textEditor.delete(textEditor.length()- deleteLastCharacters, textEditor.length());
                stack.push(type +","+lastDeleteCharacters);
            }

            if(type == 3) { // print(k) print kth character
                printKCharacter = scanner.nextInt();
                result.add(textEditor.substring(printKCharacter - 1, printKCharacter).charAt(0));
            }

            if(type == 4) { // undo 1 or 2 operation
                String lastOperation = stack.pop();
                String[] lastOperationData = lastOperation.split(",");
                if(lastOperationData[0].equals("1")) {
                    appendString = lastOperationData[1];
                    textEditor.delete(textEditor.length() - appendString.length(), textEditor.length());
                } else if(lastOperationData[0].equals("2")) {
                    lastDeleteCharacters = lastOperationData[1];
                    textEditor.append(lastDeleteCharacters);

                } else {

                }

            }
        }

        for(Character c : result) {
            System.out.println(c);
        }
    }
}
