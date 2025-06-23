package Drones;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

    class DronTest {

        @Test
        void testEsExitosa_Correcto() {
            DeCarga dron = new DeCarga(Estado.OPERATIVO, "Modelo C", LocalDate.now(), 100, -34.61, -58.38, 10);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.38, -34.61);
            assertTrue(resultado);
            assertEquals(50, dron.getBateria());
        }

        @Test
        void testEsExitosa_BateriaInsuficiente() {
            DeCarga dron = new DeCarga(Estado.OPERATIVO, "Modelo C", LocalDate.now(), 40, -34.61, -58.38, 10);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.38, -34.61);
            assertTrue(resultado);
            assertEquals(0, dron.getBateria());
        }

        @Test
        void testEsExitosa_Lejos() {
            DeCarga dron = new DeCarga(Estado.OPERATIVO, "Modelo C", LocalDate.now(), 100, -34.00, -58.00, 10);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.00, -34.00);
            assertFalse(resultado);
        }

        @Test
        void testEsExitosa_EstadoInvalido() {
            DeCarga dron = new DeCarga(Estado.INACTIVO, "Modelo C", LocalDate.now(), 100, -34.61, -58.38, 10);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.38, -34.61);
            assertFalse(resultado);
        }

        @Test
        void testChequearAlmacenamiento_Suficiente() {
            DeVigilancia dron = new DeVigilancia(Estado.OPERATIVO, "Cam Vision", LocalDate.now(), 90, -34.60, -58.38, 300);
            assertTrue(dron.chequearAlmacenamiento());
        }

        @Test
        void testChequearAlmacenamiento_Insuficiente() {
            DeVigilancia dron = new DeVigilancia(Estado.OPERATIVO, "Cam Vision", LocalDate.now(), 90, -34.60, -58.38, 1);
            assertFalse(dron.chequearAlmacenamiento());
        }

        @Test
        void testEsExitosa_Vigilancia() {
            DeVigilancia dron = new DeVigilancia(Estado.OPERATIVO, "Cam Vision", LocalDate.now(), 90, -34.60, -58.38, 300);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.38, -34.60);
            assertTrue(resultado);
        }

        @Test
        void testEsExitosa_VigilanciaMal() {
            DeVigilancia dron = new DeVigilancia(Estado.MANTENIMIENTO, "Cam Vision", LocalDate.now(), 90, -34.60, -58.38, 300);
            boolean resultado = dron.esExitosa(-58.504111, -34.573195, -58.38, -34.60);
            assertFalse(resultado);
        }
    }



