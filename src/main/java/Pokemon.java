package main.java;

/**
 * Created on 6/3/2017.
 */
public class Pokemon {
    String pokemonName;
    int pokemonNatId;
    String pokemonType1;
    String pokemonType2;

    public static void main (String []args){
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
    }

    public Pokemon(){

    }

    public Pokemon(String name, int id, String type1, String type2){
        String pokemonName = name;
        int pokemonNatId = id;
        String pokemonType1 = type1;
        String pokemonType2 = type2;
    }

    public void setPokemonNatId(int id){
        pokemonNatId = id;
    }

    public int getPokemonNatId(){
        return pokemonNatId;
    }

    public void setPokemonName(String name){
        pokemonName = name;
    }

    public String getPokemonName(){
        return pokemonName;
    }

    public void setPokemonType1(String name){
        pokemonType1 = name;
    }

    public String getPokemonType1(){
        return pokemonType1;
    }

    public void setPokemonType2(String name){
        pokemonType2 = name;
    }

    public String getPokemonType2(){
        return pokemonType2;
    }

}
