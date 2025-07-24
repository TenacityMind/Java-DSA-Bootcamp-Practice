package solutions.first_java;

public class GreetingMessage {
    private String greetingMessage;
    public GreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
    public String getGreetingMessage() {
        return greetingMessage;
    }
    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
    public void printGreetingMessage() {
        System.out.println(greetingMessage);
    }
}
