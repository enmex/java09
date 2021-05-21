import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static final Function<String, Integer> length = String::length;
    public static final Function<String, Character> getFirstChar = (String str)->str.charAt(0);
    public static final Predicate<String> isWithoutSpaces = (String str)->str.length() == str.replaceAll("\\s+", "").length();
    public static final Function<String, Integer> getSumOfWords = (String str)->str.split(",").length;
    public static final Function<? extends Human, Integer> getAge = Human::getAge;
    public static final BiPredicate<? extends Human, Human> isSimilarSurnames = (Human a, Human b) -> {return a.getSurname().equals(b.getSurname());};
    public static final Function<? extends Human, String> getFullName = (Human human)->{return
                                                human.getName() + " " + human.getSurname() + " " + human.getMiddlename();};
    public static final Function<Human, Human> makeHumanOlder = (Human human) -> {return
                                                    new Human(human.getName(), human.getSurname(), human.getMiddlename(), human.getAge()+1, human.getSex());};
    public static final BiPredicate<List<Human>, Integer> isGuysYoungerThatAge = (List<Human> list, int maxAge) -> {
                                                        return list.get(0).getAge() < maxAge && list.get(1).getAge() < maxAge && list.get(2).getAge() < maxAge;};
    public static final TetraPredicate<Human, Human, Human, Integer> checkIfYounger = (Human a, Human b, Human c, Integer maxAge) -> {
        if(a == null || b == null || c == null){
            throw new IllegalArgumentException("Human required to be not null");
        }
        if(maxAge < 0){
            throw new IllegalArgumentException("Illegal age");
        }
        return a.getAge() < maxAge && b.getAge() < maxAge && c.getAge() < maxAge;
    };
}
