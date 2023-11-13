import javax.swing.JOptionPane;



public class ListaDoblementeEnlazadas {
    public static void main(String[] args) throws Exception {
        Lista ldl = new Lista();
        int opcion = 0, el,n;

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar el valor al inicio\n2. Agregar el valor al final\n3. Eliminar inicio\n4. Eliminar Final\n5.Eliminar elemento espesifico\n6.Buscar elemento especifico\n7.-Actualizar elemento especifico\n8.Cerrar"));
            switch ((opcion)) {
                case 1: el= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor del elemento"));
                    ldl.agregarInicio(el);
                    ldl.imprimir();
                    break;
                case 2: el= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor del elemento"));
                    ldl.agregarFin(el);
                    ldl.imprimir();
                    break;
                case 3: 
                    ldl.eliminarInicio();
                    ldl.imprimir();
                    break;
                case 4: 
                    ldl.eliminarFin();
                    ldl.imprimir();
                    break;
                case 5:
                    el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del elemento a eliminar"));
                    ldl.eliminarElementoE(el);
                    ldl.imprimir();
                    break;
                case 6:
                    el = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato a buscar"));
                    ldl.buscarElemento(el);
                    break;
                case 7:
                    el = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato a buscar"));
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Nuevo dato"));
                    ldl.actualizarElemento(el, n);
                    break;
                case 8: break;
            
                default: JOptionPane.showMessageDialog(null,"Opcion incorrecta bobo");
                    break;
            }
        }while(opcion!=8);
    }
}
