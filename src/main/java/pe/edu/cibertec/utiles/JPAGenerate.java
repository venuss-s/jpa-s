package pe.edu.cibertec.utiles;

import jakarta.persistence.Persistence;

public class JPAGenerate {
    public static void main(String[] args) {

        //generar BD
        Persistence.generateSchema("biblioteca",null);
    }
}
