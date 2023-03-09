package teoryBuilder;

public interface Test {
    public static void main(String [] args){
        //il pattern Builder costruisce in creazione direttamente l'oggetto
        //utile quando vi sono alcuni campi opzionali
        
        User fabio= User.builder("Fabio","La Ciura")
//                .firstname("Fabio")
//                .lastname("La Ciura")
                .age(34)
                //.cartaIdentita("AG800A")
                .build();
        
        
        System.err.println(fabio);
    }
}
