package org.lowleveldesign.behaviouralPatterns.mementoPattern;

public class Client {
    public static void main(String[] args) {
        // Create a text editor instance.
        TextEditor editor = new TextEditor();

        // Create a history manager to manage the mementos.
        HistoryManager historyManager = new HistoryManager();

        // Write some text and save the state.
        editor.write("Hello, ");
        historyManager.saveState(editor);
        editor.getContent(); // Output: Hello,

        // Write more text and save the state.
        editor.write("World!");
        historyManager.saveState(editor);
        editor.getContent(); // Output: Hello, World!

        // Restore to the previous state.
        historyManager.restoreState(editor);
        editor.getContent(); // Output: Hello,

        // Restore to the initial state.
        historyManager.restoreState(editor);
        editor.getContent(); // Output: (empty)
    }
}
