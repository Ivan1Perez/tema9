package tarea9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {


    Miscelanea misc;

    @BeforeEach
    void setUp() {

        misc = new Miscelanea();

    }

    @AfterEach
    void tearDown() {
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

//    @Test
//    void generaAleatorioEntre() {
//
//        int a = 11;
//        int b = 7;
//        int expResult = 73;
//        int result = Miscelanea.generaAleatorioEntre(a, b);
//
//        for(int i = 0; i < 1000 ; i++){
//            if(result > a || result < b)
//                assertEquals();
//        }
//
//        //fail ("Not yet implemented");
//
//    }

    @Test
    void concatena() {



    }

    @Test
    void getMayor() {
    }

    @Test
    void getMaximo() {
    }

    @Test
    void getElemento() {
    }

    @Test
    void factorial() {
    }

    @Test
    void esPrimo() {
    }

    @Test
    void areaCirculo() {
    }

    @Test
    void areaTriangulo() {
    }

    @Test
    void areaCuadrado() {
    }

    @Test
    void decimalABinario() {
    }
}