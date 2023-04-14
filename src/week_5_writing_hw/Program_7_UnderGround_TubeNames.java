package week_5_writing_hw;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Program_7_UnderGround_TubeNames {

    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_lines");
        tubeNames.add("Circle_lines");
        tubeNames.add("District_lines");
        tubeNames.add("Hammersmith_and_City_lines");
        tubeNames.add("Jubilee_lines");
        tubeNames.add("Metropolitan_lines");
        tubeNames.add("Northern_lines");
        tubeNames.add("Piccadilly_lines");
        tubeNames.add("Victoria_lines");
        tubeNames.add("Waterloo_and_City_lines");
        System.out.println("Given Array List : " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("Given Array List is Empty!!");
        } else {
            System.out.println("Given Array List is not Empty!!");
        }
    }

    public static void main(String[] args) {
        Program_7_UnderGround_TubeNames obj = new Program_7_UnderGround_TubeNames();
        obj.isEmpty();
    }
}
