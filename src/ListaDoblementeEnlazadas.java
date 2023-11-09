import javax.swing.JOptionPane;



public class ListaDoblementeEnlazadas {
    public static void main(String[] args) throws Exception {
        Lista ldl = new Lista();
        int opcion = 0, el;

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar el valor del elemento\n2. Salir"));
            switch ((opcion)) {
                case 1: el= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor del elemento"));
                    ldl.agregarInicio(el);
                    ldl.imprimir();
                    break;
                case 2: break;
            
                default: JOptionPane.showMessageDialog(null,"Opcion incorrecta bobo");
                    break;
            }



        }while(opcion<2);
    }
}
