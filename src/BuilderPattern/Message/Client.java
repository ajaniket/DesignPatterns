package BuilderPattern.Message;

public class Client {
    public static void main(String[] args) {
        /*the below line will show an error if "setters" of builder classes are void. We can return the builder object
        everytime from the setters method to build in 1 line:*/
        //MessageBuilder m1=MessageBuilder.getBuilder().setContent("ASA").build();
        System.out.println("gy");
    }
}
