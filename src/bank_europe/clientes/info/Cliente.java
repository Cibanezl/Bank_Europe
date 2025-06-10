/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_europe.clientes.info;

import bank_europe.cuentas.tipocuenta.CuentaBancaria;

public class Cliente implements InfoCliente {
    private String nombre;
    private String cedula;
    private CuentaBancaria cuenta;

    public Cliente(String nombre, String cedula, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuenta = cuenta;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            cuenta.setSaldo(cuenta.getSaldo() + monto);
            System.out.println("Depósito exitoso.");
        }
    }

    public void girar(double monto) {
        if (monto > 0 && monto <= cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Giro exitoso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return cuenta.getSaldo();
    }

    @Override
    public void mostrarInformacionCliente() {
        System.out.println("=== Información del Cliente ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Interés calculado: $" + cuenta.calcularInteres());
    }
}
