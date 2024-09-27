public class App {public static void main(String[] args) throws Exception {

    boolean ascendente = true;
    boolean descendente = false;

    System.out.println("Metodo de ordenamiento Seleccion");
    MetodosOrdenamiento mO = new MetodosOrdenamiento();
    int[] arreglo = {5, 2, 8, 1, 9, 3, 6, 4, 7};
    mO.printArreglo(arreglo);
     
    //System.out.println("Arreglo ordenado");
    //arreglo = mO.sortBySeleccion(arreglo);
   // mO.printArreglo(arreglo);

    mO.sortBySeleccionM(arreglo, ascendente);
    mO.printArreglo(arreglo);

    mO.sortBySeleccionM(arreglo, descendente);
    mO.printArreglo(arreglo);

}}