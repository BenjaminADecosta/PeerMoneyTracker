package org.example;

public class Person
{

    private String name;
    private int age;
    private int debtOwed;
    private int debtReturned;


    public Person(String name, int age, int debtOwed, int debtReturned)
    {
        this.name = name;
        this.age = age;
        this.debtOwed = debtOwed;
        this.debtReturned = debtReturned;

    }

    public String getName()
    {
        return name;
    }

    public int getDebtOwed()
    {
        return debtOwed;
    }

    public String toString()
    {
        return name+ ", " + age + ", " + debtOwed + ", " + debtReturned;
    }
}
