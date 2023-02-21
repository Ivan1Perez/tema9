package tarea9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class MiscelaneaTest {

    Miscelanea misc;

    @BeforeEach
    void setUp() throws Exception{
        misc = new Miscelanea();
    }

    @AfterEach
    void tearDown() throws Exception{
        misc = null;
    }

    @Test
    void suma() {
        System.out.println("sumar");
        int a = 43;
        int b = 30;
        int expResult = 73;
        int result = misc.suma(a, b);
        assertEquals(expResult, result, "Fallo en la suma");
        //fail ("Not yet implemented");
    }

    @Test
    void generaAleatorioEntre() {

        int a = 11;
        int b = 7;

        for(int i = 0; i < 1000 ; i++) {
            assertTrue(Miscelanea.generaAleatorioEntre(a, b) >= b &&
                    Miscelanea.generaAleatorioEntre(a, b) <= a);
            //fail ("Not yet implemented");
        }

    }

    @Test
    void concatena() {

        String cad1 = "gato";
        String cad2 = "pardo";

        String expResult = "gatopardo";
        String result = misc.concatena(cad1, cad2);

        assertEquals(expResult, result, "Fallo al concatenar");

    }

    @Test
    void getMayor() {

        int num1 = 7;
        int num2 = 11;

        int expResult = 11;
        int resul = misc.getMayor(num1, num2);

        assertEquals(expResult, resul, "Fallo al comparar");

    }

    @Test
    void getMaximo() {

        int vector[] = {8,9,1,10,3,13};

        int expResult = 13;
        int result = misc.getMaximo(vector);

        assertEquals(expResult, result, "Fallo al comparar");

    }

    @Test
    void getElemento1() {

        int vector[] = {8,9,1,10,3,13};
        int pos = 4;

        int expResult = 3;
        int result = misc.getElemento(vector, pos);

        assertEquals(expResult, result, "Fallo al obtener el elemento.");

    }

    @Test
    void getElemento2(){

        try{
            int vector[] = {8,9,1,10,3,13};
            int pos = 7;

            int expResult = 3;

            int result = misc.getElemento(vector, pos);
            assertEquals(expResult, result, "Fallo al obtener el elemento.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Excepción producida.");
        }
    }

    @Test
    void factorial1() {

        int num = 4;

        int expResult = 24;

        int result = Miscelanea.factorial(num);

        assertEquals(expResult, result);

    }

    @Test
    void factorial2() {

        int num = -4;

        int expResult = 24;

        int result = Miscelanea.factorial(num);

        assertEquals(expResult, result, "No aparece ninguna excepción.");


    }

    @Test
    void esPrimo1() {

        int num = 12;

        assertFalse(Miscelanea.esPrimo(num));

    }

    @Test
    void esPrimo2() {

        int num = 13;

        assertTrue(Miscelanea.esPrimo(num));

    }

    @Test
    void areaCirculo() {

        int radio = 4;

        double expResult = 50.26548245743669;

        double result = Miscelanea.areaCirculo(radio);

        assertEquals(expResult, result);

    }

    @Test
    void areaTriangulo() {

        int base = 4, altura = 7;

        double expResult = 14;

        double result = Miscelanea.areaTriangulo(base, altura);

        assertEquals(expResult, result);

    }

    @Test
    void areaCuadrado() {

        int lado = 4;

        double expResult = 16;

        double result = Miscelanea.areaCuadrado(lado);

        assertEquals(expResult, result);

    }

    @Test
    void decimalABinario() {

        int num = 13;

        String expResult = "1101";

        String result = Miscelanea.decimalABinario(num);

        assertEquals(expResult, result);

    }
}