public class IntegerArrayList implements IntegerList{
    private Integer[] data;
    private int size;

    public IntegerArrayList(){
        data = new Integer[10];
        size = 0;
    }
   
    public void add(Integer val){
        if(size >= data.length){
            Integer[] bigger = new Integer[data.length*2];
            for(int i=0; i<data.length; i++){
                bigger[i] = data[i] ;
            }
            data = bigger;
        }
        data[size] = val;
        size++;
    
    }

    public void add(int index, Integer val){
        data[index] = val;
    }

    public void set(int index, Integer val){

    }
    public void clear(){
        for(int i = 0; i<size; i++){
            data[i] = 0;
    
        }
        size = 0;

    }
    public Integer remove(int index){
        return -1;
    }
    public Integer get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index:" + index);
        }
        return data[index];
    }
    public int size(){
        return -1;
    }
    public boolean isEmpty(){
        return false;
    }
    public boolean contains(Integer val){
        return false;
    }
    public int indexOf(Integer val){
        return -1;
    }
    public boolean equals(List<Integer> other){
        return false;
    }
    public String toString(){
        String result = "[";
        for(int i = 0; i<size; i++){
            if(i == size-1){
                result += data[i];
            }
            else{
                result += data[i] + ",";
            }
            
        }
        result += "]";
        return result;

    }
}
