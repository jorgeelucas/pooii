package br.com.ada.pooii.aula02.exercicio_1;

public class Caixa<T> {

    /**
     * E - Element (used extensively by the Java Collections Framework)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     * */

    private T obj;

    public Caixa(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

//    public Integer getNext() {
//        Integer integer = (Integer) this.obj;
//        return integer+1;
//    }

    public void getInt(T numero) {
        System.out.println(numero);
    }

    public String imprimir() {
        return this.obj.toString();
    }
}
