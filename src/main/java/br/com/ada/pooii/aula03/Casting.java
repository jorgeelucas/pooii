package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;

public class Casting {

    public static void main(String[] args) {

        long id = 123;
        String idString = "123-abc";
        int idInt = 456;

        List ids = new ArrayList();
        ids.add(id);
        ids.add(idString);
        ids.add(idInt);

        // CASTING EXPLICITOS
        // processo do java para converter um objeto de um tipo em outro tipo

        // [123, "123-abc"]
        //  0       1

        Long idLong = (long) ids.get(0); //casting

        System.out.println(idLong);


        // ClassCastException

        if (ids.get(1) instanceof Long) {
            Long idLong2 = (long) ids.get(1);
            System.out.println(idLong2);
        }

        if (ids.get(2) instanceof Long || ids.get(2) instanceof Integer) {
            Integer i = (Integer) ids.get(2);
            Long idLong2 = (long) i;
            System.out.println(idLong2);
        }

    }

}
