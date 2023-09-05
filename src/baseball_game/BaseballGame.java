package baseball_game;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private String input;
    private List<Integer> newList;

    BaseballGame(String input) {
        this.input = input;
        this.newList = new ArrayList<>();
    }

    public boolean checkNumber(char input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int checkScore() {
        int result = 0;

        for (char c : input.toCharArray()) {
            if (checkNumber(c)) {
                newList.add(Integer.parseInt(String.valueOf(c)));
            } else if (c == 'C') {
                if (!newList.isEmpty()) {
                    newList.remove(newList.size() - 1);
                }
            } else if (c == 'D') {
                if (!newList.isEmpty()) {
                    int last = newList.get(newList.size() - 1);
                    newList.add(last * 2);
                }
            } else if (c == '+') {
                if (newList.size() >= 2) {
                    int last = newList.get(newList.size() - 1);
                    int last2 = newList.get(newList.size() - 2);
                    newList.add(last + last2);
                }
            }
        }

        for (Integer i : newList) {
            result += i;
        }

        return result;
    }


}
