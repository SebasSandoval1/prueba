
package prueba;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Gente");
        System.out.println("Brrrrrrrr");
        System.out.println("nanix");
        System.out.println("ya esta");
        System.out.println("holaaaaa");
                
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
            
            System.out.println("buenas");
        }
    }
    
    /*
public class Main{

    //------------------------------------------------

    //para leer el archivo de entrada

    public static String getContentOfFile(String pathname) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathname);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String content = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                content += linea + "\n";
            }
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    //---------------------------------------------------------

    //para agregar contenido (la matriz R) al final del archivo

    public static void addToEndFile(String pathname, String data) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(pathname, true); // True indica que se va a agregar datos al final
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            // Escribe los datos en el archivo
            bfwriter.write(data);
            bfwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //---------------------------------------------------------

    public static void main(String[] args){

        //menu consola para el usuario

        System.out.println("Bienvenido a nuestro humilde programa");

        //------------------------------------------------
        //usuario ingresa ruta del archivo

        System.out.println("Ingrese la ruta del archivo de matrices");
        String rutaarchivo = new Scanner(System.in).nextLine();
        String content = getContentOfFile(rutaarchivo);



        System.out.println("Archivo recibido correctamente!!");

        //------------------------------------------------

        System.out.println("============MENU============");
        System.out.println("1. Sumar Matrices");
        System.out.println("2. Restar Matrices");
        System.out.println("3. Multiplicar Matrices");
        System.out.println("4. Dividir Matrices");
        System.out.println("5. Transpuesta de Matriz");
        System.out.println("6. Matriz Inversa");
        System.out.println("7. Potencia de una Matriz");
        System.out.println("8. Determinante de la Matriz");
        System.out.println("============================");

        try {

            Scanner teclado = new Scanner(System.in);
            int opcion; //Opcion del usuario
            System.out.println("Escriba una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Has seleccionado la opcion 1");



                break;

                case 2:

                    System.out.println("Has seleccionado la opcion 2");





                    break;

                case 3: {

                    System.out.println("Has seleccionado la opcion 3");


                    break;
                }

                case 4: {

                    System.out.println("Has seleccionado la opcion 4");


                    break;
                }

                case 5: {

                    System.out.println("Has seleccionado la opcion 5");


                    break;
                }

                case 6: {

                    System.out.println("Has seleccionado la opcion 6");


                    break;
                }

                case 7: {

                    System.out.println("Has seleccionado la opcion 7");


                    break;
                }

                case 8: {

                    System.out.println("Has seleccionado la opcion 8");


                    break;
                }
                default:

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
     */
    
}
