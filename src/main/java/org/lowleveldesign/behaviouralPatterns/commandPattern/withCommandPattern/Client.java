package org.lowleveldesign.behaviouralPatterns.commandPattern.withCommandPattern;

public class Client {
    public static void main(String args[]) {
        // Create a TextEditor instance.
        TextEditor textEditor = new TextEditor();

        // Create command instances for different formatting actions.
        Command boldCommand = new BoldTextCommand(textEditor);
        Command boldItalicCommand = new BoldItalicTextCommand(textEditor);
        Command underlineCommand = new UnderlineTextCommand(textEditor);

        // Execute the commands to apply formatting.
        Button button = new Button();
        button.setCommand(boldCommand);
        button.click(); // Applies bold formatting
        button.setCommand(boldItalicCommand);
        button.click(); // Applies bold and italic formatting
    }
}
