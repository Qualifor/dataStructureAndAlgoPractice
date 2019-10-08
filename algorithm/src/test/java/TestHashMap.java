import HashTableAndString.ListHashTable;
import org.junit.Test;

public class TestHashMap {

    @Test
    public void testHashMap(){
        ListHashTable map = new ListHashTable();
        for(int i = 0; i < 20; i++){
            map.put(i, i+30);
        }

        for(int i = 0; i < 20; i++){
            System.out.print(map.get(i)+ " ");
        }
        map.get(-1);
    }
}
