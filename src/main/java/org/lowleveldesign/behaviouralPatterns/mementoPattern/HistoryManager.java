package org.lowleveldesign.behaviouralPatterns.mementoPattern;

import java.util.Stack;

// This class manages the history of mementos for the text editor.
public class HistoryManager {
    private Stack<EditorMemento> history = new Stack<>();

    // Saves the current state of the text editor.
    public void saveState(TextEditor editor) {
        EditorMemento memento = editor.save();
        history.push(memento);
    }
    // Restores the last saved state of the text editor.
    public void restoreState(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            if (!history.isEmpty()) {
                editor.restore(history.peek());
            }
            else {
                editor.restore(new EditorMemento("I am empty")); // Restore to empty state if history is empty
            }
        }
    }

}
