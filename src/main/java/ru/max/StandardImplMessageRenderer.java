package ru.max;

public class StandardImplMessageRenderer implements MessageRenderer {
    private Message message;

    public StandardImplMessageRenderer(Message message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.println(message.getText());
    }
}
