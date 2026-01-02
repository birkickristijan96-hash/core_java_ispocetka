package com.itacademy.ten;

import com.itacademy.ten.animal.*;
import com.itacademy.ten.human.Employee;
import com.itacademy.ten.human.Pensioner;
import com.itacademy.ten.human.Student;

import java.time.LocalDate;
import java.util.EnumMap;


/**
 * DRY - dont repaet yourself
 *
 * SOLID principles
 *      -- s - single responsibility
 *      -- o -- open/close
 *      -- liskov substitution
 *      --inversion of control
 *      --dependency inversion
 *
 *
 *     Open Close principles
 *     --kad smo jednom dizajnirali klasu ona je zatvorena za modifiication  ali je otvorena za extension
 *
 */

public class CreatureDemo {
    public static void main(String[] args) {

        Student student = new Student("kristijan", "birkic", LocalDate.now(), "396837928");
        Dog dog = new Dog("lesi");
        Cat cat = new Cat("cicko");
        student.setAnimal(dog);
        System.out.println(student.getName() + " ima " + student.getAnimal().getName());
        student.setAnimal(cat);
        System.out.println(student.getName() + " ima " + student.getAnimal().getName());
        student.setAnimal(new Hamster("hrcak hrki"));
        student.setAnimal(new Fish("ribica zlatna"));
        student.setAnimal(new Sheep("pegi"));
        System.out.println(student.getName() + " ima " + student.getAnimal().getName());




        Pensioner pensioner = new Pensioner("aco", "kokic", LocalDate.now(), 5434);
        pensioner.setAnimal(dog);
        Employee employee = new Employee("ivan", "sakic", LocalDate.now(), 3332);
        //nismo dotakli employee,, lose for modification
        //extendat klase ne ih dirati
        employee.setAnimal(dog);
    }

}
