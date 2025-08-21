package org.lowleveldesign.behaviouralPatterns.commandPattern.withoutCommandPattern;

public class TextEditor {

    public void boldText() {
        // Apply bold formatting to the text.
        System.out.println("Applying bold formatting to the text.");
    }

    public void boldItalicText() {
        // Apply bold and italic formatting to the text.
        System.out.println("Applying bold and italic formatting to the text.");
    }

    public void underLineText() {
        // Apply underline formatting to the text.
        System.out.println("Applying underline formatting to the text.");
    }
}

// UI button class that uses the TextEditor class directly

// For each command we are creating a button class that interacts with the TextEditor.
// This is not the command pattern, but rather a direct interaction with the TextEditor.
// Each button class has a click method that performs the action directly on the TextEditor instance.
// This approach is less flexible and does not allow for command encapsulation or undo functionality,
// Example: if tomorrow we want to add undo functionality with BoldButton, we will have to modify the BoldButton class.
class BoldButton {
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        // When the button is clicked, apply bold formatting.
        textEditor.boldText();
    }
}

class BoldItalicButton {
    private TextEditor textEditor;

    public BoldItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        // When the button is clicked, apply bold and italic formatting.
        textEditor.boldItalicText();
    }
}

class UnderlineButton {
    private TextEditor textEditor;

    public UnderlineButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        // When the button is clicked, apply underline formatting.
        textEditor.underLineText();
    }
}
