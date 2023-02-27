package teoryHashSet;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer left, Integer right){
        return right-left;
    }
    
}
