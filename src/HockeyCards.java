public class HockeyCards implements TimMerchandise{
    @Override
    public String toString() {
        return "A hockey card is a type of trading card typically printed on some sort of card stock, featuring one or more ice hockey players.";
    }
    @Override
    public String getFeature() {
        return "A hockey card is a type of trading card typically printed on some sort of card stock, featuring one or more ice hockey players";
    }

    @Override
    public double getPrice() {
        return 4;
    }
}
