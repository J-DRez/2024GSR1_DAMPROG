package ejercicioWebcam;

public class Webcam {

    // Atributos
    private String resolucion;
    private int fps;
    private boolean encendido;
    private double tamanioImg;


    // Constructor
    public Webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;
        this.encendido = false;
    }


    // Getter y Setter de resolucion
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }


    // Getter y Setter de fps
    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }


    // Getter y Setter de encendido
    public boolean getEncendido() {
        return encendido;
    }


    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    // Getter y Setter de tamanioImg
    public double getTamanioImg() {
        return tamanioImg;
    }

    public void setTamanioImg(double tamanioImg) {
        this.tamanioImg = tamanioImg;
    }


    // Método encender
    public void encender() {
        if (encendido==true) {
            System.out.println("La webcam ya está encendida.");
        } else {
            encendido = true;
            System.out.println("La webcam se ha encendido.");
        }
    }


    // Método apagar
    public void apagar() {
        if (encendido==false) {
            System.out.println("La webcam ya está apagada.");
        } else {
            encendido = false;
            System.out.println("La webcam se ha apagado.");
        }
    }


    // Método tomarFoto
    public void tomarFoto() {
        if (encendido==true) {
            int ancho = Integer.parseInt(resolucion.split("x")[0]); // Coge el primer valor de la resolución asignada (de la "x" para la izquierda)
            int alto = Integer.parseInt(resolucion.split("x")[1]); // Coje el segundo valor de la resolución asignada (de la "x" para la derecha)
            tamanioImg = ((ancho * alto * fps)/1000000.0);
            System.out.println("La foto fue tomada con una resolución de " + resolucion + " y el archivo ocupa " + tamanioImg + "MB.");
        } else {
            System.out.println("Primero deberías encender la webcam.");
        }
    }



    public static void main(String[] args) {
        // Instancia de la clase Webcam
        Webcam miWebcam = new Webcam("1920x1080", 30);

        // Intento de foto sin encender la webcam
        System.out.println("Intento de foto sin encender la webcam:");
        miWebcam.tomarFoto();

        // Enciendo la webcam y tomo la foto
        System.out.println("\nEnciendo la webcam y tomo la foto:");
        miWebcam.encender();
        miWebcam.tomarFoto();

        // Apago la webcam
        System.out.println("\nApago la webcam:");
        miWebcam.apagar();
    }
}