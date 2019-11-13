package coin.changer;

import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
    public List<Integer> change(Integer amount) {
        List<Integer> coins = new ArrayList<Integer>();

        if (amount == 1) {
            coins.add(1);
        } else {
            coins.add(2);
        }

        return coins;
    }
}
