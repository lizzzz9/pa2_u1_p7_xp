package ec.edu.ec.pa2.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@ValidarStock
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 200)
public class ValidarStockInterceptor {

    @AroundInvoke
    public Object validar(InvocationContext context) throws Exception {
        System.out.println("[INTERCEPTOR STOCK] Verificando inventario disponible antes de procesar...");
        return context.proceed();

    }
}
