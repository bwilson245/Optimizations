package com.methods;

import com.Optimizations;

import java.util.*;

public class ContainsMethod extends Optimizations {
    private Set<Integer> set;
    private List<Integer> list;
    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private int target;

    public ContainsMethod(int totalCalls, int iterationCount, int target) {
        super(totalCalls, iterationCount);
        this.set = buildSet();
        this.list = buildList();
        this.queue = buildQueue();
        this.stack = buildStack();
        this.target = target;
    }

    public void execute(String method) {
        for (int i = 0; i < totalCalls; i++) {
            System.gc();
            switch (method) {
                case "setContains": {
                    addTime(setContains());
                    break;
                }
                case "listContains": {
                    addTime(listContains());
                    break;
                }
                case "queueContains": {
                    addTime(queueContains());
                    break;
                }
                case "stackContains": {
                    addTime(stackContains());
                    break;
                }
                default:
            }
        }
        calculateAverageTime();
    }

    public long setContains() {
        long time = System.nanoTime();
        boolean test = set.contains(target);
        return System.nanoTime() - time;
    }

    public long listContains() {
        long time = System.nanoTime();
        boolean test = list.contains(target);
        return System.nanoTime() - time;
    }

    public long queueContains() {
        long time = System.nanoTime();
        boolean test = queue.contains(target);
        return System.nanoTime() - time;
    }

    public long stackContains() {
        long time = System.nanoTime();
        boolean test = stack.contains(target);
        return System.nanoTime() - time;
    }

    private Set<Integer> buildSet() {
        Set<Integer> set = new HashSet<>();
        int i;
        for (i = 0; i < iterationCount; i++) {
            set.add(i);
        }
        return set;
    }
    private List<Integer> buildList() {
        List<Integer> list = new ArrayList<>();
        int i;
        for (i = 0; i < iterationCount; i++) {
            list.add(i);
        }
        return list;
    }
    private Queue<Integer> buildQueue() {
        Queue<Integer> queue = new LinkedList<>();
        int i;
        for (i = 0; i < iterationCount; i++) {
            queue.add(i);
        }
        return queue;
    }
    private Stack<Integer> buildStack() {
        Stack<Integer> stack = new Stack<>();
        int i;
        for (i = 0; i < iterationCount; i++) {
            stack.push(i);
        }
        return stack;
    }
}
