package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class MedirTiempoInterceptor {

    public MedirTiempoInterceptor() {
    }

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        long init = System.currentTimeMillis();
        try {
            // context.proceed() ejecuta el método original y obtiene su resultado real
            return context.proceed(); 
        } finally {
            long fin = System.currentTimeMillis();
            long total = fin - init; // Corregido: fin - init (positivo)
            System.out.println(">>> [MEDIR TIEMPO] El método " + context.getMethod().getName() + " tardó: " + total + " ms");
        }
    }
}