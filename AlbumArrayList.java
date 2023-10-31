/**
 * AlbumArrayList.java
 * A program for creating an Array List for a list of albums
 * Part of Homework 4, Part 1
 */

import java.util.List;

public class AlbumArrayList extends AlbumList{

    
    Album[] list;

    /**
     * Creates a new List if there is no input
     */
    public AlbumArrayList(){
        list = new Album[10];
    }

    /**
     * Creates a List of a size if there is an input
     * @param size int
     */
    public AlbumArrayList(int size){
        list = new Album[size];
    }
    
    /**
     * Adds a new album to the end of the list
     * @param newA Album
     */
    @Override
    public void add(Album newA) {            
        if (list.length == 0){
            Album[] tempList = new Album[1];
            list = tempList;
        } if (list.length == size()){           //is this always going to be the case???
            Album[] tempList = new Album[2 * numItems];
            for (int i = 0; i < numItems; i++){
                if (list[i] == null){
                    tempList[i] = newA;
                } else {
                    tempList[i] = list[i];
                }
            }
            list = tempList;
        }
        list[numItems++] = newA;
    }

    /**
     * Removes the first instance of an album based on its name
     * @param targetA Album
     * @return targetA Album
     */
    @Override
    public Album remove(Album targetA){
        for (int i = 0; i < numItems; i++){
            System.out.println(list[i]);
            if (list[i].equals(targetA)){
                remove(i);
                return targetA;
            }
        }
        return null;
    }

    /**
     * Removes an Album at a certain index
     * @param idx int
     * @return albumAtIdx Album
     */
    @Override
    public Album remove(int idx) {
        if (idx < 0 || idx >= size()){
            return null;
        }
        Album albumAtIdx = list[idx];
        for (int i = idx; i < numItems -1; i++){
            list[i] = list[i + 1];
        }
        numItems--;
        return albumAtIdx;
    }

    /**
     * gets an album from a certain index
     * @param idx int
     * @return List[idx]
     */
    @Override
    public Album get(int idx) {
        if (idx < 0 || idx >= size()){
            return null;
        }
        return list[idx];
    }

    /**
     * sets an index to an Album
     * @param idx int and newA Album
     */
    @Override
    public void set(int idx, Album newA) {
        if (idx > 0 || idx <= size()){
            list[idx] = newA;        
        }
    }

    // /**
    //  * prints a list of albums
    //  * @param list AlbumArrayList
    //  */
    // public static void printList(AlbumArrayList list){
        
    //     } else{
    //         for (int i = 0; i < list.size(); i++){
    //             System.out.println(list.get(i));
    //         }
    //     }
    // }

    public void toString(AlbumArrayList list){
        String str = "";
        if(list.size() == 0){
            System.out.println("empty list");
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString()+ "\n");
            //System.out.println(str);
        }
        //return str;
    }
}
