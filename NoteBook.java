package Seminar_3.Home_Work;

import java.util.ArrayList;
import java.util.Random;

public class NoteBook implements Comparable<NoteBook>{
    protected String nameCompany;
    protected int coast;
    protected int ramMemory;
    protected static Random rnd;
    public ArrayList<Integer> ramList = new ArrayList<>();
    // public ArrayList <String> listCompanyName;
    private long index;

    private static int defaultIndex = 1;
    static {
        rnd = new Random();
    }
    
    public ArrayList<Integer> createListRAM(){
        for (int i = 1024; i < 66000; i = i * 2) {
            ramList.add(i);
        }
        return ramList;
    }
    public ArrayList<String> createListNameCompany(){
    final ArrayList <String> listCompanyName = new ArrayList<>();
        listCompanyName.add("Samsung");
        listCompanyName.add("Apple  ");
        listCompanyName.add("Haier  ");
        listCompanyName.add("Asus   ");
        listCompanyName.add("Acer   ");
        listCompanyName.add("HP     ");
        listCompanyName.add("Xiaomi ");
        return listCompanyName;
    }

    public int getCoast(){
        return coast;
    }
    public int getRamMemory(){
        return ramMemory;
    }
    public long getIndex(){
        return index;
    }
    public String getNameCompanyNotebook(){
        return nameCompany;
    }

    public NoteBook(){
        this.nameCompany = createListNameCompany().get(rnd.nextInt(7));
        this.coast = rnd.nextInt(30000,150000);
        this.ramMemory = createListRAM().get(rnd.nextInt(7));
        index = defaultIndex;
        defaultIndex++;
    }

    @Override
    public String toString() {
        if (index < 10 && coast < 100000){
            return nameCompany + " " + index + " " + " coast = " + coast + " " + " ramMemory = " + ramMemory;
        } else if(index < 10){
            return nameCompany + " " + index + " " + " coast = " + coast + " ramMemory = " + ramMemory;
        } else if (coast < 100000){
            return nameCompany + " " + index + " coast = " + coast + " " + " ramMemory = " + ramMemory;
        } else {
            return nameCompany + " " + index + " coast = " + coast + " ramMemory = " + ramMemory;
        }
        
    }

    @Override
    public int compareTo(NoteBook o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


}

    

    

