package ec.edu.ec.pa2.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;


@TiempoEjecucion
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 300)
public class TiempoEjecucionInterceptor {

    @AroundInvoke
    public Object medirTempo(InvocationContext context) throws Exception {
        long inicio = System.currentTimeMillis();
        System.out.println("[INTERCEPTOR TIEMPO] Iniciando ejecución del método: " + context.getMethod().getName());
        try {
            return context.proceed();

        } finally {
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println("[INTERCEPTOR TIEMPO] Método:" + context.getMethod().getName() + " Ejecutando en: " + duracion + "ms");
        }

    }
}
