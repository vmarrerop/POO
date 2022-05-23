import java.util.Scanner;
import java.util.InputMismatchException;


public class Controlador {
    
    Ecuaciones ecuaciones;
    Vista vista;

    public Controlador(Ecuaciones ecuaciones, Vista vista) {
        this.ecuaciones = ecuaciones;
        this.vista = vista;
    }

    public void iniciar () {

        Scanner sc = new Scanner(System.in);
        Ecuaciones ecuaciones = new Ecuaciones();
        Vista vista = new Vista();

        System.out.println("====================================\n");
        System.out.println("APLICACIÓN - SOLUCIÓN DE ECUACIONES\n");
        System.out.println("====================================\n");
        System.out.println("1)Ecuación de un grado \n2)Ecuación de segundo grado\n3)Ecuación de tercer grado\n4)Ecuación de cuarto grado\n");
        System.out.print("Digite una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            
            vista.mostrar1();
            double a = sc.nextDouble();
            ecuaciones.setVar1(a);

            vista.mostrar2();
            double b = sc.nextDouble();
            ecuaciones.setVar2(b);

            vista.mostrar3();
            double c = sc.nextDouble();
            ecuaciones.setVar3(c);

            ecuaciones.primerGrado(a, b, c);

            break;


            case 2:
            

            try {

                vista.mostrar1();
                double q = sc.nextDouble();
                ecuaciones.setVar1(q);

                vista.mostrar2();
                double w = sc.nextDouble();
                ecuaciones.setVar2(w);

                vista.mostrar3();
                double e = sc.nextDouble();
                ecuaciones.setVar3(e);

                double det = ecuaciones.segundoGrado(q, w, e);

                if (det > 0) {

                    double x1=(-w+Math.sqrt(det))/(2*q);
                    double x2=(-w-Math.sqrt(det))/(2*q);

                    System.out.printf("X1 = %.2f\n",x1);
                    System.out.printf("X2 = %.2f\n ",x2);

                } else if (det == 0) {
                    double x1 = -w/(2*q);
                    System.out.printf("X1 = %.1f ",x1);

                } else if (det < 0) {
                    System.out.println("No hay raices");
                }
            } catch (InputMismatchException iException) {
                System.out.println("Error");
            }

            break;


            case 3:

            vista.mostrar1();
            double h = sc.nextDouble();
            ecuaciones.setVar1(h);

            vista.mostrar2();
            double j = sc.nextDouble();
            ecuaciones.setVar2(j);

            vista.mostrar3();
            double p = sc.nextDouble();
            ecuaciones.setVar3(p);

            vista.mostrar4();
            double l = sc.nextDouble();
            ecuaciones.setVar4(l);

            ecuaciones.tercerGrado(h, j, p, l);

            break;
            


        }

        sc.close();


    }

    

}
