package Fundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class E07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list.toString().replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
