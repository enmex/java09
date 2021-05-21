import java.util.function.Function;
import java.util.*;

public class StreamApiDemo extends LambdaDemo{
    public static Function<List<Object>, List<Object>> deleteNull = (List<Object> list)->
                                                        {
                                                            list.removeIf(Objects::isNull);
                                                            return list;
                                                        };
    public static Function<Set<Integer>, Integer> sumOfPositive = (Set<Integer> set) ->
                                                            {
                                                                int sum = 0;
                                                                for(Integer number : set){
                                                                    if(number>0){
                                                                        sum++;
                                                                    }
                                                                }
                                                                return sum;
                                                            } ;
    public static Function<List<Object>, List<Object>> getLastThree = (List<Object> list) -> {
        List<Object> result = new ArrayList<>(3);
        result.add(list.get(list.size()-1));
        result.add(list.get(list.size()-2));
        result.add(list.get(list.size()-3));
        return result;
    };
    public static Function<List<Integer>, Integer> getFirstEvenNumber = (List<Integer> list) -> {
        for(Integer number : list){
            if(number%2 == 0){
                return number;
            }
        }
        return null;
    };
    public static Function<List<Integer>, List<Integer>> toSquareList = (List<Integer> list) -> {
        Set<Integer> set = new HashSet<>();
        for(Integer number : list){
            set.add(number*number);
        }
        return new ArrayList<>(set);
    };
}
