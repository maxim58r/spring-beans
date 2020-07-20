package ru.max;

public class MessageRendererErrImpl implements MessageRenderer {
    private Message message;

    public MessageRendererErrImpl(Message message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.err.println(message.getText());
    }
}
