package pro.sky.hw211market;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    private Basket temp;
    public MarketServiceImpl(Basket temp) { this.temp = temp; }

    @Override
    public String add(List<Integer> items) {
        if (temp == null) {
            temp = new Basket(items);
        } else { temp.addItem(items); }
        return "Успех. Добавлены значения: " + items.toString();
    }

    @Override
    public List<Integer> get() {
        return temp.getItem();
    }

}
