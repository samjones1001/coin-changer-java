package coin.changer;

import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
    public List<Integer> change(Integer amount) {
        Integer[] denominations = {200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> coins = new ArrayList<Integer>();

        for (Integer denomination: denominations) {
            while (amount >= denomination) {
                coins.add(denomination);
                amount -= denomination;
            }
        }

        return coins;
    }
}
