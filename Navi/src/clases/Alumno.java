package clases;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class Alumno extends Usuario {

    private String nombres;
    private String apellidos;
    private ArrayList<Ramo> aprovado;
    private ArrayList<Ramo> cursando;
    private ArrayList<Ramo> reprovado;
    private float porcentajeAvance;
    private String direccion;
    private String numeroTelefono;
    private String mailPrivado;
    private String mailInstitucional;

    //procedimientos
    public Ramo verificarRamo(String codigo) {
        Carrera ramosUsuario = new Carrera();
        ArrayList<Ramo> malla = ramosUsuario.getMalla();
        Ramo rec;
        for (int i = 0; i < malla.size(); i++) {

            rec = malla.get(i);
            if (rec.getCodigo().equals(codigo)) {
                return rec;
            }
        }
        System.out.println(" Ramo no existe");
        return null;
    }

    public Ramo verificarRamo(String nombre, int paralelo) {
        Carrera ramosUsuario = new Carrera();
        ArrayList<Ramo> malla = ramosUsuario.getMalla();
        Ramo rec;
        for (int i = 0; i < malla.size(); i++) {

            rec = malla.get(i);
            if (rec.getNombre().equals(nombre) && rec.getParalelo() == paralelo) {
                return rec;
            }
        }
        System.out.println(" Ramo no existe");
        return null;
    }

    public boolean agregarRamoAprovado(String codigo) {
        Ramo aux, ver;
        ver = verificarRamo(codigo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < aprovado.size(); i++) {
            aux = aprovado.get(i);
            if (ver.getCodigo().equals(aux.getCodigo())) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        aprovado.add(ver);
        eliminarRamoCursando(ver);
        return true;
    }

    public boolean agregarRamoAprovado(String nombre, int paralelo) {

        Ramo aux, ver;
        ver = verificarRamo(nombre, paralelo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < aprovado.size(); i++) {
            aux = aprovado.get(i);
            if (ver.getNombre().equals(aux.getNombre()) && ver.getParalelo() == aux.getParalelo()) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        aprovado.add(ver);
        eliminarRamoCursando(ver);
        return true;

    }

    public boolean agregarRamoReprovado(String codigo) {
        Ramo aux, ver;
        ver = verificarRamo(codigo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < reprovado.size(); i++) {
            aux = reprovado.get(i);
            if (ver.getCodigo().equals(aux.getCodigo())) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        reprovado.add(ver);
        eliminarRamoCursando(ver);
        return true;
    }

    public boolean agregarRamoReprovado(String nombre, int paralelo) {
        Ramo aux, ver;
        ver = verificarRamo(nombre, paralelo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < reprovado.size(); i++) {
            aux = reprovado.get(i);
            if (ver.getNombre().equals(aux.getNombre()) && ver.getParalelo() == aux.getParalelo()) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        reprovado.add(ver);
        eliminarRamoCursando(ver);
        return true;
    }

    public void modificarDireccion(String direccionNueva) {
        direccion = direccionNueva;
    }

    public boolean modificarNumeroTelefonico(String numeroNuevo) {
        numeroTelefono = numeroNuevo;
        return true;            //por ahora
    }

    public boolean modificarMailPrivado(String mailNuevo) {
        mailPrivado = mailNuevo;
        return true;
    }

    public boolean agregarRamoCursando(String codigo) {
        Ramo aux, ver;
        ver = verificarRamo(codigo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < cursando.size(); i++) {
            aux = cursando.get(i);
            if (ver.getCodigo().equals(aux.getCodigo())) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        cursando.add(ver);
        return true;
    }

    public boolean agregarRamoCursando(String nombre, int paralelo) {
        Ramo aux, ver;
        ver = verificarRamo(nombre, paralelo);
        if (ver == null) {
            return false;
        }
        for (int i = 0; i < cursando.size(); i++) {
            aux = cursando.get(i);
            if (ver.getNombre().equals(aux.getNombre()) && ver.getParalelo() == aux.getParalelo()) {
                System.out.println("ya esta el ramo agregado");
                return false;
            }
        }
        cursando.add(ver);
        return true;
    }

    public void eliminarRamoCursando(Ramo curso) {
        Ramo aux;
        for (int i = 0; i < cursando.size(); i++) {
            aux = cursando.get(i);
            if (curso.getCodigo().equals(aux.getCodigo())) {
                cursando.remove(i);
                break;
            }
        }
    }

    public void modificarPorcentajeAvance() {
        Carrera ramosUsuario = new Carrera();
        ArrayList<Ramo> malla = ramosUsuario.getMalla();
        porcentajeAvance = (aprovado.size() * 100) / malla.size();
    }

    public void mostrarRamosAprovados() {
        Ramo rec;
        for (int i = 0; i < aprovado.size(); i++) {
            rec = aprovado.get(i);
            System.out.print(rec.getNombre() + " ");
            System.out.print(rec.getParalelo() + " ");
            System.out.print(rec.getClave() + " ");
            System.out.print(rec.getNombreProfesor() + " ");
            System.out.print(rec.getMailProfesor() + " ");
            System.out.print(rec.getNombreAyudante() + " ");
            System.out.print(rec.getMailAyudante() + " ");
            System.out.println(rec.getPromedio() + " ");
        }
    }

    public void mostrarRamosAprovados(String nombre) {
        Ramo rec;
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
            try{
                   f=new File(nombre);
                   w=new FileWriter(f);
                   bw=new BufferedWriter(w);
                   wr=new PrintWriter(bw);
                   for(int i=0;i< aprovado.size(); i++){
                       rec=aprovado.get(i);
                       if(i==0){
                           wr.write(rec.getNombre() + " ");
                           wr.append(rec.getParalelo() + " ");
                           wr.append(rec.getClave() + " ");
                           wr.append(rec.getNombreProfesor() + " ");
                           wr.append(rec.getMailProfesor() + " ");
                           wr.append(rec.getNombreAyudante() + " ");
                           wr.append(rec.getMailAyudante() + " ");
                           wr.append(rec.getPromedio() + "\n");
                           continue;
                       }
                       wr.append(rec.getNombre() + " ");
                       wr.append(rec.getParalelo() + " ");
                       wr.append(rec.getClave() + " ");
                       wr.append(rec.getNombreProfesor() + " ");
                       wr.append(rec.getMailProfesor() + " ");
                       wr.append(rec.getNombreAyudante() + " ");
                       wr.append(rec.getMailAyudante() + " ");
                       wr.append(rec.getPromedio() + "\n");
                   }
                   wr.close();
                   bw.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ha sucedido un error "+ e);
            }
    }

    public void mostrarRamosReprovados() {
        Ramo rec;
        for (int i = 0; i < reprovado.size(); i++) {
            rec = reprovado.get(i);
            System.out.print(rec.getNombre() + " ");
            System.out.print(rec.getParalelo() + " ");
            System.out.print(rec.getClave() + " ");
            System.out.print(rec.getNombreProfesor() + " ");
            System.out.print(rec.getMailProfesor() + " ");
            System.out.print(rec.getNombreAyudante() + " ");
            System.out.print(rec.getMailAyudante() + " ");
            System.out.println(rec.getPromedio() + " ");
        }
    }

    public void mostrarRamosCursando() {
        Ramo rec;
        for (int i = 0; i < cursando.size(); i++) {
            rec = cursando.get(i);
            System.out.print(rec.getNombre() + " ");
            System.out.print(rec.getParalelo() + " ");
            System.out.print(rec.getClave() + " ");
            System.out.print(rec.getNombreProfesor() + " ");
            System.out.print(rec.getMailProfesor() + " ");
            System.out.print(rec.getNombreAyudante() + " ");
            System.out.print(rec.getMailAyudante() + " ");
            System.out.println(rec.getPromedio() + " ");
        }
    }

    //seters y geters
    public void setNombre(String nm) {
        nombres = nm;
    }

    public String getNombre() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apell) {
        apellidos = apell;
    }

    public static void main(String arg[]) {
    }

    public ArrayList<Ramo> getAprovado() {
        return aprovado;
    }

    public void setAprovado(ArrayList<Ramo> aprovado) {
        this.aprovado = aprovado;
    }

    public ArrayList<Ramo> getReprovado() {
        return reprovado;
    }

    public void setReprovado(ArrayList<Ramo> reprovado) {
        this.reprovado = reprovado;
    }

    public float getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(float porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMailPrivado() {
        return mailPrivado;
    }

    public void setMailPrivado(String mailPrivado) {
        this.mailPrivado = mailPrivado;
    }

    public String getMailInstitucional() {
        return mailInstitucional;
    }

    public void setMailInstitucional(String mailInstitucional) {
        this.mailInstitucional = mailInstitucional;
    }

    public ArrayList<Ramo> getCursando() {
        return cursando;
    }

    public void setCursando(ArrayList<Ramo> cursando) {
        this.cursando = cursando;
    }
}
