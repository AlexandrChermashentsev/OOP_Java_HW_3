package Seminar_3.Home_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Создать класс Notebook с полями:
1. Стоимость (int)
2. Оперативная память (int)
Нагенерить объектов этого класса, создать список и отсортировать его в трех вариантах:
    1. По возрастанию цены
    2. По убыванию цены
    3. По оперативке по убыванию. Если оперативки равны - по убыванию цены.
    4.+ придумать свои параметры и отсортировать по ним

 */

public class Main {
    public static void main(String[] args) {
        ArrayList<NoteBook> arrListNotebook = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrListNotebook.add(new NoteBook());
        }
        getInfoList(arrListNotebook);

        System.out.println("По возрастанию цены");
        Comparator<NoteBook> coastComparator = new coastComporator();
        Collections.sort(arrListNotebook, coastComparator);
        getInfoList(arrListNotebook);

        System.out.println("По убыванию цены");
        coastComparator = (n1, n2) -> n2.getCoast() - n1.getCoast();
        Collections.sort(arrListNotebook, coastComparator);
        getInfoList(arrListNotebook);

        System.out.println("По оперативной памяти");
        Comparator<NoteBook> ramComporator_v2 = (n1, n2) -> n2.getRamMemory() - n1.getRamMemory();
        Collections.sort(arrListNotebook, ramComporator_v2);
        getInfoList(arrListNotebook);

        System.out.println("По алфавиту");
        nameComporator nameComporator = new nameComporator();
        Collections.sort(arrListNotebook, nameComporator);
        getInfoList(arrListNotebook);

        System.out.println("По алфавиту по убыванию");
        Comparator<NoteBook> nameReverseComparator = (n1, n2) -> n2.getNameCompanyNotebook().compareTo(n1.getNameCompanyNotebook());
        Collections.sort(arrListNotebook, nameReverseComparator);
        getInfoList(arrListNotebook);
        
    }

    public static void getInfoList(ArrayList<NoteBook> lst){
        for (NoteBook noteBook : lst) {
            System.out.println(noteBook);
        }
        System.out.println();
    }
}
