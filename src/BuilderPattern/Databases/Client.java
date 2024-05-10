package BuilderPattern.Databases;

public class Client {
    public static void main(String[] args) {
        //here 1 line initiation and setup of QueryBuilder will work unlike MessageBuilder because
        //here we are returning the Builder object everytime we are calling set methods;
        QueryBuilder q1=QueryBuilder.getBuilder().setSelect("byNumbers")
                .setFrom("SampleFrom").setJoin("SampleJoin").build();
    }
}
