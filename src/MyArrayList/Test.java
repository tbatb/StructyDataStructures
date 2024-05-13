package MyArrayList;

public class Test {
    public static void main(String[] args){

        MyArrayList employees = new MyArrayList();
        employees.add("Franz");
        employees.add("Josef");
        employees.add("Kurt");
        employees.add("sepp");
        employees.add("Niko");
        employees.add("Irina");

        employees.remove(2);
        for (int i = 0; i < 4; i++) {
            employees.add("Employee " + i);
        }
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.print(employees.get(i) + "-->");
        }
        System.out.println();

        employees.remove("Franz");


    }
}
