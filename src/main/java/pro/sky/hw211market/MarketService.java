package pro.sky.hw211market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public interface MarketService {
    Basket add(List<Integer> items);
    List get();
}
