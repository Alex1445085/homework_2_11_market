package pro.sky.hw211market;

import java.util.List;

public interface MarketService {
    String add(List<Integer> items);
    List<Integer> get();
}
