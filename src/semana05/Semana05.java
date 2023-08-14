package semana05;

import java.util.ArrayList;

public class Semana05 {

    public static void main(String[] args) {

        ArrayList<Cachorro> listadog = new ArrayList<>();
        
        
        
        listadog.add(new Cachorro("bruno","pincher",3,"grande","maçaneiro"));
       
        for(Cachorro dog : listadog){
            System.out.println(dog.getNome());
        }
        
       Cachorro cdois = new Cachorro("tulipa","cuzcuz",32,"pequeno","jão");
       
       
    }

}
