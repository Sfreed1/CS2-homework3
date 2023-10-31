/**
 * AlbumListTest.java
 * A program for testing an Array List of albums
 * Part of Homework 4, Part 1,2
 */

public class AlbumListTest {

    public static void main(String[] args) {
        AlbumArrayList testList = new AlbumArrayList();
        Album TheScore = new Album("Fugees - The Score");
        Album Rappa = new Album("T-pain - Rappa Ternt Sanga");
        Album BAD = new Album("Michael Jackson - BAD");
        Album ColoringBook = new Album("Chance the Rapper - Coloring Book");
        Album PlanetHer = new Album("Planet Her - Doja Cat");

        String tempList;
        testList.toString(testList);

        System.out.println("\ntest 1:\n");
        testList.add(TheScore);
        testList.toString(testList);
        //System.out.println("testList= " + tempList);
        
        System.out.println("\ntest 2:\n");
        testList.remove(0);
        testList.toString(testList);
        //System.out.println("testList= " + tempList);
    }
       

        // System.out.print("\ntest 3:\n");
        // testList.add(ColoringBook);
        // printList(testList);

        // System.out.print("\ntest 4:\n");
        // testList.add(BAD);
        // printList(testList);

        // System.out.print("\ntest 4:\n");
        // testList.add(BAD);
        // printList(testList);

        // System.out.print("\ntest 5:\n");
        // testList.add(PlanetHer);
        // printList(testList);

        // System.out.print("\ntest 6:\n");                    //remov(album) is not working very well
        // testList.remove(5);                                 //it gives a null where index(1) was
        // printList(testList);

        

        // System.out.println(testList);
        // System.out.println("get 1" + testList.get(0));
        // System.out.println(testList);
        // System.out.println(testList.get(1));
        // System.out.println(testList);
        // System.out.println(testList.remove(1));
}
