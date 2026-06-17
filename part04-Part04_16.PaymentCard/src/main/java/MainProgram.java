public class MainProgram{
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul eats heartily
        paulsCard.eatHeartily();

        // Matt eats affordably
        mattsCard.eatAffordably();

        // Print balances
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul tops up 20 euros
        paulsCard.addMoney(20);

        // Matt eats heartily
        mattsCard.eatHeartily();

        // Print balances
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul eats affordably twice
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        // Matt tops up 50 euros
        mattsCard.addMoney(50);

        // Print balances
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
