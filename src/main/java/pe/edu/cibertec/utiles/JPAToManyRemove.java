package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Categoria;

public class JPAToManyRemove {
    public static void main(String[] args) {
        //referenciar a la unidad de persisentecia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();
        //referenciar a una categoria
        Categoria categoria = em.find(Categoria.class, "C2");

        //remove
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();


    }
}
