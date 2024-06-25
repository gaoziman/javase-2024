package org.javatop.day02;

import org.javatop.day02.domain.Trader;
import org.javatop.day02.domain.Transaction;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 代码练习
 */
public class Sample14 {
    public static void main(String[] args) {
        // 4个交易员
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        // 4个交易员的订单总表
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        /**
         * (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
         * (2) 交易员都在哪些不同的城市工作过？
         * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
         * (4) 返回所有交易员的姓名字符串，按字母顺序排序。
         * (5) 有没有交易员是在米兰工作的？
         * (6) 打印生活在剑桥的交易员的所有交易额。
         * (7) 所有交易中，最高的交易额是多少？
         * (8) 找到交易额最小的交易。
         */


        //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        List<Transaction> tr2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(tr2011);
        // 找出2011年发生的所有交易，并按交易额排序（从低到高）
        // List<Transaction> transactions_2011 = transactions.stream()
        //         .filter(t -> t.getYear() == 2011)
        //         .sorted(comparing(Transaction::getValue))
        //         .collect(toList());
        // System.out.println(transactions_2011);



        //(2) 交易员都在哪些不同的城市工作过？
        List<String> stream = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());

        stream.forEach(System.out::println);



        // (3) 查找所有来自于剑桥的交易员，并按姓名排序
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .collect(toList());

        traders.forEach(System.out::println);


        //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
        String names = transactions.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);

        System.out.println(names);


        //(5) 有没有交易员是在米兰工作的？
        boolean isMilan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        System.out.println(isMilan);



        //(6) 打印生活在剑桥的交易员的所有交易额。
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //(7) 所有交易中，最高的交易额是多少？
        transactions.stream()
               .max(comparing(Transaction::getValue))
                .ifPresent(System.out::println);

        //(8) 找到交易额最小的交易。
        transactions.stream()
                .min(comparing(Transaction::getValue))
                .ifPresent(System.out::println);

    }
}
