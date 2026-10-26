package ec.edu.uce.pa2.descuento;

import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {
    private final String id = UUID.randomUUID().toString();

    public void registrar(String operacion) {

        System.out.println("[Auditoria: " + id + "]" + operacion);
    }
    
    @PostConstruct
    void iniciar() {
        System.out.println("[Auditoria: " + id + "] CREADA");
    }

    @PreDestroy
    void destruir() {
        System.out.println("[Auditoria: " + id + "] DESTRUIDA");
    }

}
