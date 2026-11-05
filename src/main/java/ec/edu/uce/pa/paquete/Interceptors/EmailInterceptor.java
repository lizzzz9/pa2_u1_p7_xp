package ec.edu.uce.pa.paquete.Interceptors;

import java.lang.reflect.Method;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Email
@Interceptor
@Priority(3)
public class EmailInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        Method metodo = context.getMethod();
        String nombreMetodo = metodo.getName();

        System.out.println(">>> [Interceptor Email] Interceptando método: " + nombreMetodo);

        long inicio = System.currentTimeMillis();
        try {
            return context.proceed(); // Ejecuta el método original
        } finally {
            long fin = System.currentTimeMillis();
            long total = fin - inicio;
            System.out.println(">>> [Interceptor Email] El método '" + nombreMetodo + "' tardó: " + total + " ms");
        }
    }
}
