public class Ecuaciones {

    //VARIABLE A
    private double var1;
    private double var2;
    private double var3;
    private double var4;

    //GET
    public double getVar1() {
        return var1;
    }
    public double getVar2() {
        return var2;
    }
    public double getVar3() {
        return var3;
    }
    public double getVar4() {
        return var4;
    }
    
    //SET
    public void setVar1( double var1) {
        this.var1 = var1;
    }
    public void setVar2( double var2) {
        this.var2 = var2;
    }
    public void setVar3( double var3) {
        this.var3 = var3;
    }
    public void setVar4( double var4) {
        this.var4 = var4;
    }


    //CONTRUCTORES
    public Ecuaciones() {
    }
    public Ecuaciones(double var1, double var2, double var3, double var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }
    


    //MÉTODO POLINOMIO DE PRIMER GRADO
    public double primerGrado (double a, double b, double c) {

        double x;

        x = var3 - var2 / var1;
        System.out.printf("X = %.3f\n",x );

        return 0;   
    }


    //MÉTODO ECUACIÓN DE SEGUNDO GRADO

    public double segundoGrado (double a, double b, double c) {

        double determinante;
        
        determinante = var2*var2 - 4*var1*var3;

        return determinante;
        
    } 


    //MÉTODO ECUACIÓN DE TERCER GRADO

    public double tercerGrado (double a, double b, double c, double d) {

        double coefA=(var2/var1), coefB=(var3 / var1), coefC=(var1/var4);

        double p=(3*coefB-Math.pow(coefA, 2))/3;
        double q=((2*Math.pow(coefA, 3))-(9*coefA*coefB)+(27*coefC))/27;
        

        //DISCRIMINANTE
        double det=Math.pow((q/2),2)+Math.pow((p/3),3);
        double ax1 = (-q/2) + Math.sqrt(det);
        double X1,X2,X3, ax2, varM = 1, varN = 3, var13=(varM/varN);
        if (ax1 > 0)

        {

            X1=Math.pow(ax1,var13);

        }

        else

        {

            ax1 = ax1*-1;

            X1=Math.pow(ax1,var13);

            X1= X1*-1;

        }

        ax2 = (-q/2) - Math.sqrt(det);

        if (ax2 > 0)

        {

            X2=Math.pow(ax2,var13);

        }

        else

        {

            ax2 = ax2*-1;

            X2=Math.pow(ax2,var13);

            X2= X2*-1;

        }

    X3=(coefA/3);
    double resultado = X1 + X2 - X3;
    System.out.printf("X = %.2f\n", resultado);
    return resultado;
     


    }
    
}
