package map;

import datastructure.util.FileOperation;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Description:
 * Created By xxm
 */
public class LinkedListMapTest {

    @Test
    public void LinkedListMapTest() {

        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("src/test/java/datastructure/util/pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            LinkedListMap<String, Integer> map = new LinkedListMap<>();
            for (String word : words1) {
                if (map.contains(word))
                    map.set(word, map.get(word) + 1);
                else
                    map.add(word, 1);
            }

            System.out.println("Total different words: " + map.getSize());
            System.out.println("'Pride' wordCount: " + map.get("pride")); // poor performance

        }

    }
}