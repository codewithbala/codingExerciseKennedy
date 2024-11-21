package com.kabaso.mock.week11.task4;
import java.util.Stack;
//Write a program to implement a simple version of a text editor with undo functionality
public class SimpleTextEditor {
    private StringBuilder text;
    private Stack<String> undoStack;

    public SimpleTextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
    }

    public void append(String str) {
        undoStack.push(text.toString());
        text.append(str);
    }

    public void delete(int k) {
        if (k > text.length()) {
            k = text.length();
        }
        undoStack.push(text.toString());
        text.delete(text.length() - k, text.length());
    }

    public char print(int k) {
        if (k > text.length()) {
            return ' ';
        }
        return text.charAt(k - 1);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            text = new StringBuilder(undoStack.pop());
        }
    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        SimpleTextEditor editor = new SimpleTextEditor();
        editor.append("Hello");
        System.out.println(editor.getText());

        editor.append(" World!");
        System.out.println(editor.getText());

        editor.undo();
        System.out.println(editor.getText());

        editor.delete(2);
        System.out.println(editor.getText());
    }
}