import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String input = "Представьте, что вы попали на некоторый остров, а местные жители пытаются с вами коммуницировать, записывая непонятные слова на бумажке. Вы хотите разобраться, что именно вам пишут и решаете начать с составления словаря.\n" +
                "\n" +
                "Задача заключается в том, чтобы написать генератор словаря аборигенов в функциональном стиле. Представьте, что у вас есть исходный текст сообщения местного жителя. Программа должна разбить текст на слова и отсортировать их в естесственном порядке. В комментариях укажите, какие отличительные черты функционального стиля присутствуют в вашей программе.\n" +
                "\n" +
                "Функция, которая составляет словарь, должна быть оформлена как реализатор Function";
        System.out.println("Входной текст: " + input);

        List<String> collect = Arrays.stream(input.replaceAll("^[.,\\s]+", "")
                .split("[.,\\s]+"))
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Получивишийся словарь: ");
        collect.forEach(System.out::println);
    }
}
