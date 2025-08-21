package org.lowleveldesign.behaviouralPatterns.commandPattern.withCommandPattern;

public class BoldTextCommand implements Command {
    private TextEditor textEditor;

    public BoldTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        // When the command is executed, apply bold formatting.
        textEditor.boldText();
    }
}
