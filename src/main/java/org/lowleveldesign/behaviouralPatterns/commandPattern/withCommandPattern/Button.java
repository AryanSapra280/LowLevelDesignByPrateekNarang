package org.lowleveldesign.behaviouralPatterns.commandPattern.withCommandPattern;


// The Button class represents a button that can execute a command when clicked.
// It encapsulates the command to be executed, allowing for flexible command execution.
// This is part of the Command Pattern implementation, where the button acts as an invoker.
// The Button class is designed to be simple and focused on executing the command without knowing the details
// of the command's implementation. This allows for easy addition of new commands without modifying the Button class.
public class Button {
    private Command command;

    public Button() {
        // Default constructor for Button, can be used to set a command later.
    }

    // When the button is clicked, execute the command.
    public void click() {
        command.execute();
    }
    // Set the command to be executed when the button is clicked.
    public void setCommand(Command command) {
        this.command = command;
    }
}
