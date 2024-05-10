package BuilderPattern.DatabaseConfiguration;

public class Client {
    public static void main(String[] args) {
        DatabaseConfigurationBuilder config=DatabaseConfigurationBuilder.getBuilder()
                .setDatabaseUrl("Sample URL").build();
    }
}
