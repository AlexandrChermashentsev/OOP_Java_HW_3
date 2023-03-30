package Seminar_3.Home_Work;

import java.util.Comparator;

public class ramComporator implements Comparator<NoteBook> {

    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        if (o1.getRamMemory() - o2.getRamMemory() > 1){
            return o1.getRamMemory() - o2.getRamMemory();

        } else if (o1.getRamMemory() - o2.getRamMemory() == 0){
            return o1.getCoast() - o2.getCoast();

        } else {
            return o1.getRamMemory() - o2.getRamMemory();
            
        }
    }
    
}
