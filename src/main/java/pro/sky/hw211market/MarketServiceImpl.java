package pro.sky.hw211market;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    static Basket temp = null;

    @Override
    public Basket add(List<Integer> items) {
        if (temp == null) {
            temp = new Basket(items);
        } else { temp.addItem(items); }
        return temp;
    }

    @Override
    public List<Integer> get() {
            List<Integer> temporary = temp.getItem();
        return temporary;
    }

}
