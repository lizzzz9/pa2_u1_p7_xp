package ec.edu.ec.pa2.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@ReintentarOperacion
@Priority(Interceptor.Priority.APPLICATION + 100)
public class ReintentarOperacionInterceptor {

    @AroundInvoke
    public Object reintentar(InvocationContext context) throws Exception {
        int intentosMaximos = 3;
        int intentoActual = 0;

        while (true) {
            try {
                System.out.println("[INTERCEPTOR REINTENTO] Intento número: " + (intentoActual + 1));
                return context.proceed(); // Intenta ejecutar el método
            } catch (Exception e) {
                intentoActual++;
                if (intentoActual >= intentosMaximos) {
                    System.out.println("[INTERCEPTOR REINTENTO] Se agotaron los reintentos.");
                    throw e; 
                }
                Thread.sleep(1000); 
            }
        }
    }
}