package coin.changer;

import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
    public List<Integer> change(Integer amount) {
        List<Integer> coins = new ArrayList<Integer>();

        while (amount >= 5) {
            coins.add(5);
            amount -= 5;
        }

        while (amount >= 2) {
            coins.add(2);
            amount -= 2;
        }

        while (amount >= 1) {
            coins.add(1);
            amount -= 1;
        }

        return coins;
    }
}
