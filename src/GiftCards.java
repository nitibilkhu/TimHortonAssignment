public class GiftCards implements TimMerchandise{

    @Override
    public String toString() {
        return "a card or token that can be exchanged for a specified cash value of goods or services from a particular business, given as a gift.";
    }

    @Override
    public String getFeature() {
        return "a card or token that can be exchanged for a specified cash value of goods or services from a particular business, given as a gift.";
    }

    @Override
    public double getPrice() {
        return 6;
    }
}
