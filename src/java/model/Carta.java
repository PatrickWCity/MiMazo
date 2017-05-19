/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PatrickWCity
 */
public class Carta {
    private int id;
    private int nivel;
    private String atributo;
    private String nombre;
    private String atk;
    private String def;
    private String tipo;
    private String descripcion;
    private int precio;
    private List<Imagen> imagen;
    
    public Carta(int id, int nivel, String atributo, String nombre, String atk, String def, String tipo, String descripcion, int precio, List<Imagen> imagen) {
        this.id = id;
        this.nivel = nivel;
        this.atributo = atributo;
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen ;
    }
    public Carta(){
    }
    
    public static List<Carta> getAll(){
        List<Carta> list= new ArrayList<Carta>();

        List<Imagen> listimg1 = new ArrayList<Imagen>();
        listimg1.add(new Imagen(1, "Slifer el Drag&oacute;n del Cielo Carta", "Carta1_1.png")); 
        listimg1.add(new Imagen(2,"Slifer el Drag&oacute;n del Cielo Monstruo","Carta1_2.png")); 
        listimg1.add(new Imagen(3,"Atributo de Slifer el Drag&oacute;n del Cielo","Divina.png")); 
        list.add(new Carta(1, 10, "Divina", "Slifer el Drag&oacute;n del Cielo","?","?","Bestia Divina / Efecto","Requiere 3 Sacrificios para ser Invocada de Modo Normal (no puede ser Colocada de Modo Normal). La Invocaci&oacute;n Normal de esta carta no puede ser negada. Cuando es Invocada de Modo Normal, no se pueden activar cartas ni efectos. Una vez por turno, durante la End Phase, si esta carta fue Invocada de Modo Especial: m&aacute;ndala al Cementerio. Esta carta gana 1000 ATK y DEF por cada carta en tu mano. Si uno o m&aacute;s monstruos son Invocados de Modo Normal o Especial al Campo de tu adversario, en Posici&oacute;n de Ataque boca arriba: ese o esos monstruos pierden 2000 ATK, y despu&eacute;s, si su ATK qued&oacute; reducido a 0 como resultado, destr&uacute;yelos.",6000,listimg1));

        List<Imagen> listimg2 = new ArrayList<Imagen>();
        listimg2.add(new Imagen(4, "Drag&oacute;n de Oscuridad de Ojos Rojos Carta", "Carta2_1.png")); 
        listimg2.add(new Imagen(5,"Drag&oacute;n de Oscuridad de Ojos Rojos Monstruo","Carta2_2.png")); 
        listimg2.add(new Imagen(6,"Atributo de Drag&oacute;n de Oscuridad de Ojos Rojos","Oscuridad.png")); 
        list.add(new Carta(2, 9, "Oscuridad", "Drag&oacute;n de Oscuridad de Ojos Rojos","2400","2000","Drag&oacute;n / Efecto","No puede ser Invocado de Modo Normal/Colocado. Debe ser Invocado de Modo Especial (desde tu mano) Sacrificando 1 Drag&oacute;n Negro de Ojos Rojos, y no puede ser Invocado de Modo Especial de otra forma. Esta carta gana 300 ATK por cada monstruo de Tipo Drag&oacute;n en tu Cementerio.",4500,listimg2));

        List<Imagen> listimg3 = new ArrayList<Imagen>();
        listimg3.add(new Imagen(7, "Drag&oacute;n Blanco de Ojos Azules Carta", "Carta3_1.png")); 
        listimg3.add(new Imagen(8,"Drag&oacute;n Blanco de Ojos Azules Monstruo","Carta3_2.png")); 
        listimg3.add(new Imagen(9,"Atributo de Drag&oacute;n Blanco de Ojos Azules","Luz.png")); 
        list.add(new Carta(3, 8, "Luz", "Drag&oacute;n Blanco de Ojos Azules","3000","2500","Drag&oacute;n","Este legendario drag&oacute;n es una poderosa m&aacute;quina de destrucci&oacute;n. Virtualmente invencible, muy pocos se han enfrentado a esta impresionane criatura y han vivido para contarlo.",9500,listimg3));

        List<Imagen> listimg4 = new ArrayList<Imagen>();
        listimg4.add(new Imagen(10, "Drag&oacute;n de Polvo de Estrellas Carta", "Carta4_1.png")); 
        listimg4.add(new Imagen(11,"Drag&oacute;n de Polvo de Estrellas Monstruo","Carta4_2.png")); 
        listimg4.add(new Imagen(12,"Atributo de Drag&oacute;n de Polvo de Estrellas","Viento.png")); 
        list.add(new Carta(4, 8, "Viento", "Drag&oacute;n de Polvo de Estrellas","2500","2000","Drag&oacute;n / Synchro / Efecto","[1 Cantante + 1 o m&aacute;s monstruos que no sean Cantantes]<br> Durante el turno de cualquier jugador, cuando es activada una carta o efecto que destruir&iacute;a una o m&aacute;s cartas en el Campo: puedes Sacrificar esta carta; niega la activaci&oacute;n y, si lo haces, destruye la carta. Durante la End Phase, si este turno este efecto fue activado (y no fue negado): puedes Invocar esta carta de Modo Especial desde tu Cementerio.",6500,listimg4));
        
        List<Imagen> listimg5 = new ArrayList<Imagen>();
        listimg5.add(new Imagen(13, "Ciber Drag&oacute;n del Infinito Carta", "Carta5_1.png")); 
        listimg5.add(new Imagen(14,"Ciber Drag&oacute;n del Infinito Monstruo","Carta5_2.png")); 
        listimg5.add(new Imagen(15,"Atributo de Ciber Drag&oacute;n del Infinito","Luz.png"));
        list.add(new Carta(5, 6, "Luz", "Ciber Drag&oacute;n del Infinito","2100","1600","M&aacute;quina / XYZ / Efecto","[3 monstruos de LUZ de Tipo M&aacute;quina de Nivel 6]<br> Una vez por turno, tambi&eacute;n puedes Invocar Xyz a Ciber Drag&oacute;n del Infinito usando un Ciber Drag&oacute;n Nova que controles como Material Xyz. (Los Materiales Xyz acoplados a ese monstruo se convierten tambi&eacute;n en Materiales Xyz en esta carta). Esta carta gana 200 ATK por cada Material Xyz acoplado a ella. Una vez por turno: puedes seleccionar 1 monstruo en Posici&oacute;n de Ataque boca arriba en el Campo; ac&oacute;plalo a esta carta como Material Xyz boca arriba. Una vez por turno, durante el turno de cualquier jugador, cuando es activada una carta o efecto: puedes desacoplar de esta carta 1 Material Xyz; niega la activaci&oacute;n y, si lo haces, destruye la carta.",5500,listimg5));

        List<Imagen> listimg6 = new ArrayList<Imagen>();
        listimg6.add(new Imagen(16, "Exodia, el Prohibido Carta", "Carta6_1.png")); 
        listimg6.add(new Imagen(17,"Exodia, el Prohibido Monstruo","Carta6_2.png")); 
        listimg6.add(new Imagen(18,"Atributo de Exodia, el Prohibido","Oscuridad.png"));
        list.add(new Carta(6, 3, "Oscuridad", "Exodia, el Prohibido","1000","1000","Lanzador de Conjuros / Efecto","Si tienes 'Pierna Derecha del Prohibido', 'Pierna Izquierda del Prohibido', 'Brazo Derecho del Prohibido' y 'Brazo Izquierdo del Prohibido', adem&aacute;s de esta carta en tu mano, ganas el Duelo.",7500,listimg6));

        List<Imagen> listimg7 = new ArrayList<Imagen>();
        listimg7.add(new Imagen(19, "7 Carta", "Carta7_1.png")); 
        listimg7.add(new Imagen(20,"Monstruo de Carta 7","Carta7_2.png")); 
        listimg7.add(new Imagen(21,"Atributo de 7","Magica.png"));
        list.add(new Carta(7, 0, "Magica", "7 (La Nota de Este Proyecto! :D)","","","Continua","Esta carta hace que el Profe le ponga nota 7 a este Proyecto!",0,listimg7));

        return list;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getAtributo() {
        return atributo;
    }
    public void setAtributo(String artibuto) {
        this.atributo = artibuto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAtk() {
        return atk;
    }
    public void setAtk(String atk) {
        this.atk = atk;
    }
    public String getDef() {
        return def;
    }
    public void setDef(String def) {
        this.def = def;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public List<Imagen> getImagen() {
        return imagen;
    }
    public void setImagen(List<Imagen> imagen) {
        this.imagen = imagen;
    }
}