package ec.edu.ec.pa2.paquete.Interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@TiempoEjecucion
@Interceptor
public class TiempoEjecucionInterceptor {

    @AroundInvoke
    public Object medirTempo(InvocationContext context) throws Exception {
        long inicio = System.currentTimeMillis();
        System.out.println("iniciando ejecuciondel método: " + context.getMethod().getName());
        try {
            return context.proceed();

        } finally {
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println("Metodo:" + context.getMethod().getName() + "Ejcutando en: " + duracion + "ms");
        }

    }
}
