package ec.edu.uce.pa.paquete.Interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.AuditoriaService;
import ec.edu.uce.pa.paquete.Pedido;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {

    @Inject
    private AuditoriaService auditoriaService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {//en el InvocationContext se tiene toda la informacion del metodo interceptado

        Object resultado = context.proceed();//Ejecuta el método interceptado
        System.out.println("Retorno:" + resultado);
        String nombreMetodo = context.getMethod().getName();

        System.out.println("Auditoria: Interceptando método: " + nombreMetodo);
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor");
        Parameter[] parametros = context.getMethod().getParameters();//para acceder a los argumentos del metodo interceptado
        for (Parameter parametro : parametros) {
            System.out.println("Parametro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();//para acceder a los valores de los argumentos del metodo interceptado
        //tiene lo mismo que los parametros pero con los valores que se le pasan al metodo
        Pedido pedido = (Pedido) valores[0];//el primer parametro es el pedido
        //le hago un cast a Pedido porque se que el primer parametro es de tipo Pedido

        String cliente = pedido.getCliente();//pista de auditora con el cliente, total y correo,los valores que necesitamos para guardar en la base de datos
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();

        this.auditoriaService.guardarEnLaBase(cliente, total, correo);
        //Todo lo que esta arriba se eejcuta antes de ejecutar el método interceptado
        //si quiero que se ejecute algo despues de ejecutar el método interceptado, lo pongo despues del context.proceed()
        System.out.println("Mensaje luego de ejecutar el método interceptado");
        return resultado;
    }

}
