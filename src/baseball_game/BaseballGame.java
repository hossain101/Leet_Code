package baseball_game;

import java.util.*;
import java.util.List;

public class BaseballGame {

    private String[] input;
    private List<Integer> newList;

    BaseballGame(String[] input) {
        this.input = input;
        this.newList = new ArrayList<>();
    }

    public boolean checkNumber(String input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int checkScore() {
        int result = 0;

        for (String c : input) {
            if (checkNumber(c)) {
                newList.add(Integer.parseInt(String.valueOf(c)));
            } else if (c == "C") {
                if (!newList.isEmpty()) {
                    newList.remove(newList.size() - 1);
                }
            } else if (c == "D") {
                if (!newList.isEmpty()) {
                    int last = newList.get(newList.size() - 1);
                    newList.add(last * 2);
                }
            } else if (c == "+") {
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



        public int calPoints() {

            Deque<Integer> stack = new ArrayDeque<>();
            int total = 0;

            for (String op : input) {
                if (op.equals("+")) {
                    int top = stack.pop();
                    int newScore = top + stack.peek();
                    stack.push(top);
                    stack.push(newScore);
                    total += newScore;

                } else if (op.equals("D")) {
                    stack.push(stack.peek() * 2);
                    total += stack.peek();

                } else if (op.equals("C")) {
                    total -= stack.pop();

                } else {
                    int val = Integer.valueOf(op);
                    stack.push(val);
                    total += val;
                }
            }

            return total;
        }



}
