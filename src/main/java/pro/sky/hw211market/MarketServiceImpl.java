package pro.sky.hw211market;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    private Basket temp;
    public MarketServiceImpl(Basket temp) { this.temp = temp; }

    @Override
    public Basket add(List<Integer> items) {
        if (temp == null) {
            temp = new Basket(items);
        } else { temp.addItem(items); }
        return temp;
    }

    @Override
    public List<Integer> get() {
        return temp.getItem();
    }

}
