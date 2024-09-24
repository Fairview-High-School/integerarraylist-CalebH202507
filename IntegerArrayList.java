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
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index:" + index);
        }
        Integer[] temp = new Integer[data.length*2];
        for(int i = 0; i<index; i++){
            temp[i] = data[i];
        }
        
        temp[index] = val;
        
        for(int j = index+1; j<data.length+1; j++){
            temp[j] = data[j-1];
        }
        size++;
        data = temp;
    }

    public void set(int index, Integer val){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index:" + index);
        }
        data[index] = val;

    }
    public void clear(){
        for(int i = 0; i<size; i++){
            data[i] = 0;
    
        }
        size = 0;

    }
    public Integer remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index:" + index);
        }
        Integer value = data[index];
        Integer[] temp = new Integer[data.length-1];
        for(int i = 0; i<index; i++){
            temp[i] = data[i];
            
        }
        for(int j = index; j<data.length-1; j++){
            temp[j] = data[j+1];
            
        }
        data = temp;
        size--;
        return value;
    }
    public Integer get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index:" + index);
        }
        return data[index];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean contains(Integer val){
        boolean num = false;
        for(int i = 0; i<size; i++){
            if(data[i] == val){
                num = true;
            }
        }
        return num;
    }
    public int indexOf(Integer val){
        int num = -1;
        for(int i = 0; i<size; i++){
            if(data[i] == val){
                num = i;
            }
        }
        return num;

    }
    public boolean equals(List<Integer> other){
        for(int i = 0; i<size; i++){
            if(other.get(i) != data[i]){
                return false;
            }
        }
        return true;
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
