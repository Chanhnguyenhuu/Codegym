package SS11_Stack_Queue.Thuc_hanh.Dem_tu_trong_chuoi_su_dung_map;

import java.util.TreeMap;

public class CountWord {

    public CountWord() {

    }

    TreeMap<String, Integer> tree = new TreeMap<>();

    public void push(String key, Integer value) {
        if (tree.containsKey(key)){
            tree.put(key, tree.get(key) + 1);
        } else {
            tree.put(key, value);
        }
    }

    public TreeMap<String, Integer> getTree() {
        return tree;
    }
}
