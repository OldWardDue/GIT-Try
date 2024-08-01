import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        NetUtils netUtils = new NetUtils();

        List<Stock> stocks = netUtils.getStocks();

        stocks.sort(new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                Float val1 = (o1.getValue());
                Float val2 = (o2.getValue());
                return val1.compareTo(val2);
            }
        });

        System.out.println("The cheapest one was on " +
                stocks.get(0).getDate() + " with value " +
                stocks.get(0).getValue());

        System.out.println("The most expensive one was on " +
                stocks.get(stocks.size() - 1).getDate() + " with value " +
                stocks.get(stocks.size() - 1).getValue());



    }
}