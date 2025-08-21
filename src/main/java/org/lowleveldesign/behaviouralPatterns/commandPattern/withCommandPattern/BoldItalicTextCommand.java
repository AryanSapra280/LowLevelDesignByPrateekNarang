package org.lowleveldesign.behaviouralPatterns.commandPattern.withCommandPattern;

public class BoldItalicTextCommand implements Command {
    private TextEditor textEditor;

    public BoldItalicTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        // When the command is executed, apply bold and italic formatting.
        textEditor.boldItalicText();
    }
}
