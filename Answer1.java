/**
 *
 * @author Akbar Yudhanto
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Answer1 {
    
    // Variable "addElement"
    public static String[] addElement(String[] arr, String element) {
    String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
    newArr[newArr.length - 1] = element;
    return newArr;
}
    
    // Variable "addElementAtFirst"
    public static String[] addElementAtFirst(String[] arr, String element) {
    String[] newArr = new String[arr.length + 1];
    newArr[0] = element;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
    return newArr;
}
    
    // Variable "combineArrays"
    public static String[] combineArrays(String[] arr1, String[] arr2) {
    String[] combinedArr = new String[arr1.length + arr2.length];
    int index = 0;
    for (String element : arr1) {
        combinedArr[index] = element;
        index++;
    }
    for (String element : arr2) {
        combinedArr[index] = element;
        index++;
    }
    return combinedArr;
}
    
    public static void main(String args[]) {

        // Variable "arrayA" is a string array of car brands: ["Honda", "Toyota", "Proton"]
        String[] arrayA = {"Honda", "Toyota", "Proton"};

        // Add "Nissan" to it. Print it out.
        arrayA = addElement(arrayA, "Nissan");
        System.out.println("arrayA after adding \"Nissan\": " + Arrays.toString(arrayA));

        // Add "Mazda" as the first element within the string array. Print it out.
        arrayA = addElementAtFirst(arrayA, "Mazda");
        System.out.println("arrayA after adding \"Mazda\" as the first element: " + Arrays.toString(arrayA));

        // Now make a new variable "arrayB" which is a string array of animals. Combine both arrays into variable "arrayA". Print it out.
        String[] arrayB = {"Dog", "Cat", "Lion"};
        arrayA = combineArrays(arrayA, arrayB);
        System.out.println("arrayA after combining with arrayB: " + Arrays.toString(arrayA));

        // Variable "mapC" & "mapD" are both separate Map[String, String] objects of employee IDs and employee names
        Map<String, String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        Map<String, String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        // Combine them both into the variable "mapC" and print it out.
        mapC.putAll(mapD);
        System.out.println("mapC after combining with mapD: " + mapC);

        // Print out the reason why the result no longer has the value "Justin"?
        System.out.println("The reason why \"Justin\" is no longer in mapC is that it has been overwritten by the value in mapD with the same key.");

        // Return values in "mapC" where key contains "5"
        List<String> keysWith5 = new ArrayList<>();
        for (String key : mapC.keySet()) {
            if (key.contains("5")) {
                keysWith5.add(key);
            }
        }
        System.out.println("Values in mapC where key contains \"5\":");
        for (String key : keysWith5) {
            System.out.println(mapC.get(key));
        }

        // Remove map entries where the value contains the "o" character in "mapC". (ignore case)
        Iterator<Map.Entry<String, String>> iterator = mapC.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().toLowerCase().contains("o")) {
                iterator.remove();
            }
        }
        System.out.println("mapC after removing entries with values containing \"o\" (ignore case): " + mapC);

        // I have a string variable "str" of "111222888222555". Reverse this string and assign it back to variable "str". Print it out.
        String str = "111222888222555";
        System.out.println("str: " + str);
        str = new StringBuilder(str).reverse().toString();
        System.out.println("str after reversing: " + str);
        
        // Then, replace the last occurrence of "222" in variable “str” with "aaa" and assign it back to variable “str”. Print it out.
        str = str.replaceFirst("222(?=[^222]*$)", "aaa");
        System.out.println("str last occurrence of \"222\" in variable str with \"aaa\": " + str);
    }
}
