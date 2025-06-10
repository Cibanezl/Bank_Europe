/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_europe.cuentas.tipocuenta;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public double calcularInteres() {
        return getSaldo() * 0.02; // 2% de interés
    }
}