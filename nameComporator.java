package Seminar_3.Home_Work;

import java.util.Comparator;

public class nameComporator implements Comparator<NoteBook> {
    
    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        return o1.getNameCompanyNotebook().compareTo(o2.getNameCompanyNotebook());    
        }
    }

    

