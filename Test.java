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

        System.out.println("\nTest if .remove(index) works");
        IntegerArrayList list2 = new IntegerArrayList();
        for(int val = 10; val<110; val+=10){
            list2.add(val);
        }


        list2.remove(0);
        System.out.println("Expected: 20, 30, 40, 50 60 70 80 90 100");
        System.out.println(list2);

        System.out.println("\nTest if .add(val, index) work");
        list2.add(0, 10);
        System.out.println("Expected: 10 20, 30, 40, 50 60 70 80 90 100");
        System.out.println(list2);

        System.out.println("\nTest if .isEmpty() works");
        IntegerArrayList list3 = new IntegerArrayList();
        System.out.println("Expected: True");
        System.out.println(list3.isEmpty());

        System.out.println("\nTest if .contains(val) and .indexOf(val) works");
        IntegerArrayList list4 = new IntegerArrayList();
        for(int val = 10; val<110; val+=10){
            list4.add(val);
        }

        System.out.println("Expected: true, 1");
        System.out.println(list4.contains(20) + ", " + list4.indexOf(20));

        System.out.println("\nTest if .equals() works");
        IntegerArrayList list5 = new IntegerArrayList();
        for(int val = 10; val<110; val+=10){
            list5.add(val);
        }
        list5.remove(0);
        list5.add(0, 20);

        System.out.println("Expected: False");
        System.out.println(list5.equals(list4));

        System.out.println("Expected: True");
        list5.remove(0);
        list5.add(0, 10);
        System.out.println(list5.equals(list4));


    }
}