package org.lowleveldesign.behaviouralPatterns.mementoPattern;

// This class represents internal states for the text editor.
public class EditorMemento {
    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
