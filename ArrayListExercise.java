import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("white");

        // Iterating Over the ArrayList
        for (String color : colors) {
            System.out.println(color);
        }
        colors.add(2, "cyan");
        colors.remove(1);

        System.out.println("New ArrayList: " + colors);

        String searchTerm = "cyan";
        System.out.println("Color: " + searchTerm);
        System.out.println(searchColor(colors, searchTerm));
    }
        public static String searchColor(ArrayList<String> colors, String searchTerm) {
            int position = colors.indexOf(searchTerm);
            if (position == -1) {
                return "Color not found.";
            } else {
                return "Color is at position " + (position + 1) + ".";

        }


    }
