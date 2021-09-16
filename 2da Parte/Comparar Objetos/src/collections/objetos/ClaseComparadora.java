package collections.objetos;

import java.util.*;
public class ClaseComparadora implements Comparator{ 
    @Override
    public int compare(Object o1,Object o2){
        Persona p1=(Persona)o1;
        Persona p2=(Persona)o2; 
        return p1.getNombre().compareTo(p2.getNombre()); 
    }
}
