public class Main {
    public static void main(String[] args)
    {
        Landline l1 = new Landline("12345");
        Landline l2 = new Landline("67890");

        l1.callNumber("12345");
        l2.reciveCall("67890");
        System.out.println(l2.answerCall());



    }
}