public class Test {

    public static void main(String[] args) {
        IntegerArrayList list  = new IntegerArrayList();

        System.out.println("Test add(val) and get(index): add 11 values to the list and then get the 11 values from the list");
        System.out.println("Expected: 10 20 30 40 50 60 70 80 90 100 110");

        for(int val = 10; val<=110; val+=10){
            list.add(val);
        }
        System.out.println(list);
        for(int i = 0; i<11; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Test if out of bounds exception works on get method");
        try{
            System.out.println(list.get(12));

        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}