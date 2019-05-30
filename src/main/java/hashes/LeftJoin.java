package hashes;

import java.util.ArrayList;

public abstract class LeftJoin {
    public static <T> HashMap<ArrayList<T>> leftJoin(HashMap<T> mapA, HashMap<T> mapB) {
        HashMap<ArrayList<T>> output = new HashMap();
        for (HashMap.Node node : mapA.buckets) {
            ArrayList<T> list = new ArrayList<>();
            list.add((T) node.value);
            output.add(node.key, list);
        }

        for (HashMap.Node node : mapB.buckets) {
            if (output.contains(node.key)) {
                output.get(node.key).add((T) node.value);
            } else {
                ArrayList<T> list = new ArrayList<>();
                list.add((T) node.value);
                output.add(node.key, list);
            }
        }

        return output;
    }
}
