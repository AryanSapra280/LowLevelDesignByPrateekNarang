package org.lowleveldesign.behaviouralPatterns.commandPattern.withCommandPattern;

public class UnderlineTextCommand implements Command {
    private TextEditor textEditor;

    public UnderlineTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        // When the command is executed, apply underline formatting.
        textEditor.underLineText();
    }
}
