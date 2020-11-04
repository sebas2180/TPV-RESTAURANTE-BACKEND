package com.example.model;

public class detalle_facturaModel {

    private int cantidad;

    private double porcentaje_iva;

    private double cuota;

    private double total_mesa;



    public detalle_facturaModel() {
    }
    

    /**
     * @return int return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return double return the porcentaje_iva
     */
    public double getPorcentaje_iva() {
        return porcentaje_iva;
    }

    /**
     * @param porcentaje_iva the porcentaje_iva to set
     */
    public void setPorcentaje_iva(double porcentaje_iva) {
        this.porcentaje_iva = porcentaje_iva;
    }

    /**
     * @return double return the cuota
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * @param cuota the cuota to set
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * @return double return the total_mesa
     */
    public double getTotal_mesa() {
        return total_mesa;
    }

    /**
     * @param total_mesa the total_mesa to set
     */
    public void setTotal_mesa(double total_mesa) {
        this.total_mesa = total_mesa;
    }

}
