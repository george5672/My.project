public interface Printer<T> {
    void print(T message);
}

class ConsolePrinter implements Printer<ConsolePrinter.Message> {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() { return text; }
        public void setText(String text) { this.text = text; }
        public String getSender() { return sender; }
        public void setSender(String sender) { this.sender = sender; }
    }

    @Override
    public void print(Message message) {
        boolean isTextEmpty = message.text == null || message.text.isEmpty();
        boolean isSenderEmpty = message.sender == null || message.sender.isEmpty();

        if (isTextEmpty && isSenderEmpty) {
            new Runnable() {
                @Override
                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }.run();
        } else if (isSenderEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.text);
        } else {
            System.out.println("Користувач " + message.sender + " відправив повідомлення: " + message.text);
        }
    }

    public static void main(String[] args) {
        ConsolePrinter cp = new ConsolePrinter();
        cp.print(new Message("Привіт!", "Жора"));
        cp.print(new Message("Тест", null));
        cp.print(new Message(null, ""));
    }
}