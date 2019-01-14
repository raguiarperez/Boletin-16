
package Boletin16;

/**

 * @author raguiarperez
 */
public class Exeminterfaces {

    public static void main(String[] args) {
        //crear obxectos
       Persoa per=new Persoa();
       Canario car=new Canario();
       Galo gal=new Galo();
       //metodos
       per.cantar();
       car.cantar();
       gal.cantar();
       IPodeCantar obx=new Persoa();
        System.out.println("*********************");
       obx.cantar();
    }
    
}
