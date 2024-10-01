package pro.sky.hw211market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

public class Basket {
    private List<Integer> item;

    public Basket(List<Integer> item) {
        this.item = item;
    }
    //@SessionScope
    public List<Integer> getItem() { return item; }
    public void setItem(List<Integer> item) { this.item = item; }
    public void addItem(List<Integer> temp) {
        List<Integer> ite = this.getItem();
        ite.addAll(temp);
        this.item = ite;
    }


    @Override
    public String toString() {
        return this.item.toString();
    }
}
