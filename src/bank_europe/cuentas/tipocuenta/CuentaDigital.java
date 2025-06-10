/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_europe.cuentas.tipocuenta;

public class CuentaDigital extends CuentaBancaria {
    public CuentaDigital(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public double calcularInteres() {
        return getSaldo() * 0.01; // 1% de interés
    }
}