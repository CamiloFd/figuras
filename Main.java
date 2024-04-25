public class Main {
    public static void main(String[] args) {
        
        class Circulo {
            private double radio;

            public Circulo(double radio) {
                this.radio = radio;
            }

            public double calcularArea() {
                return Math.PI * Math.pow(radio, 2);
            }

            public double calcularPerimetro() {
                return 2 * Math.PI * radio;
            }
        }

        
        class Rectangulo {
            private double base;
            private double altura;

            public Rectangulo(double base, double altura) {
                this.base = base;
                this.altura = altura;
            }

            public double calcularArea() {
                return base * altura;
            }

            public double calcularPerimetro() {
                return 2 * (base + altura);
            }
        }

    
        class Cuadrado {
            private double lado;

            public Cuadrado(double lado) {
                this.lado = lado;
            }

            public double calcularArea() {
                return Math.pow(lado, 2);
            }

            public double calcularPerimetro() {
                return 4 * lado;
            }
        }

        
        class TrianguloRectangulo {
            private double base;
            private double altura;

            public TrianguloRectangulo(double base, double altura) {
                this.base = base;
                this.altura = altura;
            }

            public double calcularArea() {
                return (base * altura) / 2;
            }

            public double calcularHipotenusa() {
                return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
            }

            public String determinarTipoTriangulo() {
                if (base == altura)
                    return "Equilátero";
                else if (base == Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2)) || altura == Math.sqrt(Math.pow(base, 2) + Math.pow(altura / 2, 2)))
                    return "Isósceles";
                else
                    return "Escaleno";
            }
        }

        
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(5);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del triángulo rectángulo: " + triangulo.calcularArea());
        System.out.println("Hipotenusa del triángulo rectángulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
    }
}
