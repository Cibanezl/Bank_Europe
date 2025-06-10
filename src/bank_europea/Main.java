/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_europea;

import java.util.Scanner;

import bank_europe.clientes.info.Cliente;
import bank_europe.cuentas.tipocuenta.CuentaAhorros;
import bank_europe.cuentas.tipocuenta.CuentaBancaria;
import bank_europe.cuentas.tipocuenta.CuentaCorriente;
import bank_europe.cuentas.tipocuenta.CuentaDigital;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de cuenta que desea crear:");
        System.out.println("Opciones: CuentaCorriente, CuentaAhorros, CuentaDigital");
        String tipoCuenta = scanner.nextLine();

        System.out.println("Ingrese número de cuenta (9 dígitos):");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Ingrese saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); 

        CuentaBancaria cuenta;

        switch (tipoCuenta) {
            case "CuentaCorriente":
                cuenta = new CuentaCorriente(numeroCuenta, saldo);
                break;
            case "CuentaAhorros":
                cuenta = new CuentaAhorros(numeroCuenta, saldo);
                break;
            case "CuentaDigital":
                cuenta = new CuentaDigital(numeroCuenta, saldo);
                break;
            default:
                System.out.println("Tipo de cuenta no reconocido. Se creará una CuentaCorriente por defecto.");
                cuenta = new CuentaCorriente(numeroCuenta, saldo);
        }

        Cliente cliente = new Cliente("Carlos Ibañez", "1234567890", cuenta);
        cliente.mostrarInformacionCliente();

        scanner.close();
    }
}