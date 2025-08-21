package org.lowleveldesign.behaviouralPatterns.commandPattern.withoutCommandPattern;

public class Client {
    public static void main(String[] args) {
        // Create a text editor instance.
        TextEditor textEditor = new TextEditor();

        // Create buttons for different formatting actions.
        BoldButton boldButton = new BoldButton(textEditor);
        BoldItalicButton boldItalicButton = new BoldItalicButton(textEditor);
        UnderlineButton underlineButton = new UnderlineButton(textEditor);

        // Simulate button clicks to apply formatting.
        boldButton.click();          // Output: Applying bold formatting to the text.
        boldItalicButton.click();    // Output: Applying bold and italic formatting to the text.
        underlineButton.click();      // Output: Applying underline formatting to the text.
    }
}
