package pe.edu.cibertec.queries;

import jakarta.persistence.*;
import pe.edu.cibertec.domain.Libro;

import javax.lang.model.element.Element;
import java.util.List;

public class JPAQuery {
    public static void main(String[] args) {
        //referenciar a la unidad de persisentecia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();
        //select
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);

        //select -where
       // TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio =:autor", Libro.class);
       // query.setParameter("autor", "claudia");
        //selct -where comparacion(>< =)
       // TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio > :precio", Libro.class);
       // query.setParameter("precio", 50);
       //select where betewwen
      //  TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
       // query.setParameter("inicio", 30);
     //   query.setParameter("fin", 50);

         //SELECT - WHERE - IN
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in('Cesar','Claudia') ", Libro.class);
        //consularar autores especificos (seleciona valores escalares)
        // TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in('Cesar', 'Claudia')", String.class);
        //seleciona valores escalares
        //TypedQuery<String> query = em.createQuery("select distinct l.autor from Libro l where l.autor in('Cesar', 'Claudia')", String.class);
//seleciona valores escalares--upper
       // TypedQuery<String> query = em.createQuery("select distinct upper(l.autor)  from Libro l where l.autor in('Cesar', 'Claudia')", String.class);
//seleciona  - oreder by
//TypedQuery<Libro> query = em.createQuery("select l from Libro l order by l.precio", Libro.class);
//seleciona  - group by
//TypedQuery<Object[]> query = em.createQuery("select l.autor, count(l) from Libro l group by  l.autor", Object[].class);
//seleciona  - null
//TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor is null ", Libro.class);
//seleciona  - LIKE
 TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.titulo like 'c%'", Libro.class);


        //obtner resultados
        List<Libro> resultado = query.getResultList(); // LO CAMBIEA DE QUERY A STRING PARA UNO DE LOS EJERCCIOS--OBJJETCT PARA OBJEXTXD
       //resultado.forEach(elemento -> System.out.println("Autor: " + elemento[0] + " - Cantidad: " + elemento[1])); //cambia en obj
        resultado.forEach(System.out::println);//CAMBIA EN OBJECT
        //resultado.forEach(item ->System.out.println(item.getTitulo()));


    }
}
