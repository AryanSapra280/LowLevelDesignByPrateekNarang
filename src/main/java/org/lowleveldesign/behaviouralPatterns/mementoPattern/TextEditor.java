package org.lowleveldesign.behaviouralPatterns.mementoPattern;

public class TextEditor {
    private String content;

    public TextEditor() {
        this.content = "";
    }
    public EditorMemento save() {
        // Save the current state of the text editor.
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        // Restore the text editor to a previous state.
        this.content = memento.getContent();
    }

    public void write(String text) {
        // Write text to the editor.
        this.content += text;
    }

    public void getContent() {
        // Get the current content of the text editor.
        System.out.println("Current Content: " + content);
    }
}
