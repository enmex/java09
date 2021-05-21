public class LambdaRunner {
    public static int length(String string){
        return LambdaDemo.length.apply(string);
    }
    public static char getFirstChar(String string){
        return LambdaDemo.getFirstChar.apply(string);
    }
    public static boolean isWithoutSpaces(String string){
        return LambdaDemo.isWithoutSpaces.test(string);
    }
    public static int getSumOfWords(String string){
        return LambdaDemo.getSumOfWords.apply(string);
    }
    public static int getAge(Human human){
        return LambdaDemo.getAge.apply(human);
    }
}
