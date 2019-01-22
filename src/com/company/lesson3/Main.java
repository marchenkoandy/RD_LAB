package com.company.lesson3;

public class Main {

    //    public static void main(String[] args) {
//
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(1);
//
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Andy");
//        list2.add("Lesya");
//        list2.add("Nastya");
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Andy");
//        list.add("Lesya");
//        list.add("Nastya");
//
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        System.out.println(list.addAll(list2));
//
//        System.out.println(list.indexOf("Andy"));
//
//        if (list.contains("Andy")){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
    public static void main(String[] args) {
        Test test = new Test();

        test.myCompany();
        Company company = test.myCompany();

        for (Person employee : company.getEmployees()) {
            if (employee.getFirstName().contains("a")) {
                System.out.println(employee.getLastName());
            }
        }
    }

}
