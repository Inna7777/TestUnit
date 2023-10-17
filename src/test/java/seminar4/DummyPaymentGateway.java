package seminar4;

public class DummyPaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        return false;
    }
}
