package mirea;

import java.util.*;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /*Упражнение 1*/
        Stack<Integer> stackFirst = new Stack<>();
        Stack<Integer> stackSecond = new Stack<>();

        fill(stackFirst);
        fill(stackSecond);
        game(stackFirst, stackSecond);

        /*Упражнение 2*/
        Queue<Integer> queueFirst = new LinkedList<>();
        Queue<Integer> queueSecond = new LinkedList<>();

        fill(queueFirst);
        fill(queueSecond);
        game(queueFirst, queueSecond);

        /*Упражнение 3*/
        Deque<Integer> dequeFirst = new LinkedList<>();
        Deque<Integer> dequeSecond = new LinkedList<>();

        fill(dequeFirst);
        fill(dequeSecond);
        game(dequeFirst, dequeSecond);

        /*Упражнение 4*/
        ArrayList<Double> listFirst = new ArrayList<>();
        ArrayList<Double> listSecond = new ArrayList<>();

        fillList(listFirst);
        fillList(listSecond);
        game(listFirst, listSecond);
    }

    private static void fill(Collection<Integer> arr) {
        for (int i = 0; i < 5; i++) {
            int a = in.nextInt();
            arr.add(a);
        }
    }

    private static void fillList(ArrayList<Double> list) {
        for (int i = 0; i < 5; i++) {
            double a = in.nextDouble();
            list.add(a);
        }
    }

    private static <T> boolean result(Collection<T> arr1, Collection<T> arr2, int k) {
        if(arr1.isEmpty()) {
            System.out.println("second " + k);
            return true;
        }
        if(arr2.isEmpty()) {
            System.out.println("first " + k);
            return true;
        }
        if(k == 1000_001) {
            System.out.println("botva");
           return false;
        }

        return true;
    }

    private static void game(Stack<Integer> stackFirst, Stack<Integer> stackSecond) {
        int k = 0;

        while(!stackFirst.empty() && !stackSecond.empty()) {
            k++;
            int cardFirst = stackFirst.pop();
            int cardSecond = stackSecond.pop();

            if((cardFirst == 0 && cardSecond == 9) || (cardFirst == 9 && cardSecond == 0)) {
                if (cardFirst == 0) {
                    stackFirst.add(0, cardFirst);
                    stackFirst.add(0, cardSecond);
                }
                if (cardFirst == 9) {
                    stackSecond.add(0, cardFirst);
                    stackSecond.add(0, cardSecond);
                }
            } else {
                if (cardFirst > cardSecond) {
                    stackFirst.add(0, cardFirst);
                    stackFirst.add(0, cardSecond);
                }
                if (cardFirst < cardSecond) {
                    stackSecond.add(0, cardFirst);
                    stackSecond.add(0, cardSecond);
                }
            }

            if(!result(stackFirst, stackSecond, k))
                break;
        }
    }

    private static void game(Queue<Integer> queueFirst, Queue<Integer> queueSecond) {
        int k = 0;

        while(!queueFirst.isEmpty() && !queueSecond.isEmpty()) {
            k++;
            int cardFirst = queueFirst.poll();
            int cardSecond = queueSecond.poll();

            myAdd(queueFirst, queueSecond, cardFirst, cardSecond);

            if(!result(queueFirst, queueSecond, k))
                break;
        }
    }

    private static void game(Deque<Integer> dequeFirst, Deque<Integer> dequeSecond) {
        int k = 0;

        while(!dequeFirst.isEmpty() && !dequeSecond.isEmpty()) {
            k++;
            int cardFirst = dequeFirst.pollFirst();
            int cardSecond = dequeSecond.pollFirst();

            myAdd(dequeFirst, dequeSecond, cardFirst, cardSecond);

            if(!result(dequeFirst, dequeSecond, k))
                break;
        }
    }

    private static void game(ArrayList<Double> listFirst, ArrayList<Double> listSecond) {
        int k = 0;

        while(!listFirst.isEmpty() && !listSecond.isEmpty()) {
            k++;
            double cardFirst = listFirst.get(0);
            double cardSecond = listSecond.get(0);
            listFirst.remove(0);
            listSecond.remove(0);

            if((cardFirst == 0 && cardSecond == 9) || (cardFirst == 9 && cardSecond == 0)) {
                if (cardFirst == 0) {
                    listFirst.add(cardFirst);
                    listFirst.add(cardSecond);
                }
                if (cardFirst == 9) {
                    listSecond.add(cardFirst);
                    listSecond.add(cardSecond);
                }
            } else {
                if (cardFirst > cardSecond) {
                    listFirst.add(cardFirst);
                    listFirst.add(cardSecond);
                }
                if (cardFirst < cardSecond) {
                    listSecond.add(cardFirst);
                    listSecond.add(cardSecond);
                }
            }

            if(!result(listFirst, listSecond, k))
                break;
        }
    }

    private static void myAdd(Collection<Integer> arr1, Collection<Integer> arr2, int a1, int a2) {
        if((a1 == 0 && a2 == 9) || (a1 == 9 && a2 == 0)) {
            if (a1 == 0) {
                arr1.add(a1);
                arr1.add(a2);
            }
            if (a1 == 9) {
                arr2.add(a1);
                arr2.add(a2);
            }
        } else {
            if (a1 > a2) {
                arr1.add(a1);
                arr1.add(a2);
            }
            if (a1 < a2) {
                arr2.add(a1);
                arr2.add(a2);
            }
        }
    }
}