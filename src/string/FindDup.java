package string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDup {
    public static void main(String[] args) {

        String s = "abbcdeef";

        String[] arr = {"apple", "mango", "pineapple", "ab", "cd", "apple", "mango"};

        //
        Map<String, Long> collect = Arrays.stream(arr).filter(e -> Collections.frequency(Arrays.asList(arr), e) == 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        //java8 way
//        Set<String> set = new HashSet<>();
//        Arrays.stream(s.split("")).filter(e -> !set.add(e)).forEach(System.out::println);

        getDup(s);
    }

    static void getDup(String s){

        Map<String, Integer> map = new HashMap<>();
        for(String str : s.split("")){
            map.put(str, map.containsKey(str) ? map.get(str)+1 : 1);
        }

        map.entrySet().stream().filter(e -> e.getValue()==1).map(Map.Entry::getKey).forEach(System.out::println);



    }


}
