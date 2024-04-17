package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityTransaction {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public EntityTransaction() {
    }
    
    public static EntityManagerFactory criarEntityManagerFactory(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("persistence");
            System.out.println("CONEXAO ABERTA");
        }
        return emf;
    }
    
    public static void fecharEntityManagerFactory(){
        if(emf != null && emf.isOpen()){
            emf.close();
            System.out.println("CONEXAO FECHADA");
        }
    }
    
    public static EntityManager getManager(){
        if(em == null || !em.isOpen()){
            em = emf.createEntityManager();
            System.out.println("ENTITY MANAGER ABERTO");
        }
        return em;
    }
    
}
