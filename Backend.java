package org.example;

import java.io.*;
import java.util.ArrayList;

// David Vu's, Ben's, and Aathi's Peer Credit Tracker

// David's Code
public class Backend {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        readInData("friends.csv");

    }


    private static ArrayList<Person> readInData(String fileName) {
        ArrayList<Person> people = new ArrayList<Person>();
        System.getProperty("user.dir");
        try {
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = file.readLine()) != null) {
                String[] data = line.split(",");

            }
        } catch (Exception e) {
            System.out.println("There was an error with the file." + e.getMessage());
        }
        return people;
    }

    // sort by names
    private static void sortNames(ArrayList<Person> peopleList) {

        // make 2 different lists
        ArrayList<Person> first = new ArrayList<Person>();
        ArrayList<Person> second = new ArrayList<Person>();

        //split the list into two halves
        for (int i = 0; i < peopleList.size(); i++)
            if (i < peopleList.size() / 2)
                first.add(peopleList.get(i));
            else
                second.add(peopleList.get(i));

        // keep splitting the lists until they are one - base case
        if (first.size() > 1)
            sortNames(first);
        if (second.size() > 1)
            sortNames(second);

        // merge the lists together by name
        int index1 = 0, index2 = 0;
        for (int i = 0; i < first.size() + second.size() && index1 < first.size() && index2 < second.size(); i++) {
            String listOneBookNum = first.get(index1).getName();
            String listTwoBookNum = second.get(index2).getName();

            if (listOneBookNum.compareTo(listTwoBookNum) < 0) {
                peopleList.set(i, first.get(index1));
                index1++;
            } else {
                peopleList.set(i, second.get(index2));
                index2++;
            }

        }

        // copy the remaining elements from the first list if any
        while (index1 < first.size()) {
            peopleList.set(index1 + index2, first.get(index1));
            index1++;
        }

        // copy the remaining elements from the second list if any
        while (index2 < second.size()) {
            peopleList.set(index1 + index2, second.get(index2));
            index2++;
        }


    }


    // Sort list by Debt Owed
    private static void sortDebtOwed(ArrayList<Person> peopleList) {

        // make 2 different lists
        ArrayList<Person> first = new ArrayList<Person>();
        ArrayList<Person> second = new ArrayList<Person>();

        //split the list into two halves
        for (int i = 0; i < peopleList.size(); i++)
            if (i < peopleList.size() / 2)
                first.add(peopleList.get(i));
            else
                second.add(peopleList.get(i));

        // keep splitting the lists until they are one - base case
        if (first.size() > 1)
            sortNames(first);
        if (second.size() > 1)
            sortNames(second);

        // merge the lists together by name
        int index1 = 0, index2 = 0;
        for (int i = 0; i < first.size() + second.size() && index1 < first.size() && index2 < second.size(); i++) {
            int listOneBookNum = first.get(index1).getDebtOwed();
            int listTwoBookNum = second.get(index2).getDebtOwed();

            if (listOneBookNum < listTwoBookNum) {
                peopleList.set(i, first.get(index1));
                index1++;
            } else {
                peopleList.set(i, second.get(index2));
                index2++;
            }

        }

        // copy the remaining elements from the first list if any
        while (index1 < first.size()) {
            peopleList.set(index1 + index2, first.get(index1));
            index1++;
        }

        // copy the remaining elements from the second list if any
        while (index2 < second.size()) {
            peopleList.set(index1 + index2, second.get(index2));
            index2++;
        }


    }

    private Person addPerson(String name, int age, int debtOwed, int debtReturned) throws IOException
    {
        Person newPerson = new Person(name, age, debtOwed, debtReturned);
        BufferedWriter writer = new BufferedWriter(new FileWriter("peerList.csv",true));
        writer.newLine();
        writer.append(newPerson.toString());
        writer.close();
        return newPerson;

    }

    private static ArrayList<Person> removePerson(Person remPerson, ArrayList<Person> people)
    {
       people.remove(remPerson);
       return people;
    }

}