package joecorrales_22141156;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Equipo {
    private static ArrayList<Equipo> equipos = new ArrayList<>();
    private File file = new File("./equipos.txt");
    private String nombre;
    private int partidoJugado;
    private int pGanados;
    private int pEmpatados;
    private int pPerdidos;
    private int golesFavor;
    private int golesContra;
    private int diferencia;
    private int pts;

    public Equipo() {}
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidoJugado = 0;
        this.pGanados = 0;
        this.pEmpatados = 0;
        this.pPerdidos = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.diferencia = 0;
        this.pts = 0;
    }

    public Equipo(String nombre, int partidoJugado, int pGanados, int pEmpatados, int pPerdidos, int golesFavor, int golesContra, int diferencia, int pts) {
        this.nombre = nombre;
        this.partidoJugado = partidoJugado;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferencia = diferencia;
        this.pts = pts;
    }

    
    public void addList(Equipo e) {
        this.equipos.add(e);
    } 
    
    public void addEquipo(String name) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        Equipo e = new Equipo(name);
        addList(e);
        for(Equipo eq : equipos) {
            System.out.println(eq.toString());
        }
        System.out.println("Equipo creado");
        fw.write(toString() + "\n");
        fw.close();
    }
    
    public boolean verifyName(String name) {
        for(Equipo e : equipos) {
            if(name.equalsIgnoreCase(e.getNombre())) {
                System.out.println("Ya existe un nombre");
                return false;
            }
        }
        System.out.println("No existe");
        return true;
    }
    
    
    public void modificarName(String name, int pos) {
        Equipo.equipos.get(pos).setNombre(name);
    }
    
    public void eliminarEquipo(int pos) {
        Equipo.equipos.remove(pos);
    }
    
    public void escribirArchivo(String path, boolean append) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(path, append);
            bw = new BufferedWriter(fw);
            String eq = "";
            for (Equipo equipo : equipos) {
                eq += equipo.getNombre()+";";
                eq += equipo.getPartidoJugado()+";";
                eq += equipo.getpGanados()+";";
                eq += equipo.getpEmpatados()+";";
                eq += equipo.getpPerdidos()+";";
                eq += equipo.getGolesFavor()+";";
                eq += equipo.getGolesContra()+";";
                eq += equipo.getDiferencia()+";";
                eq += equipo.getPts()+";";
                eq += "\n";
                bw.write(eq);
                eq = "";
            }
            bw.flush();
            fw.close();
            bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se pudo escribir al archivo!");
        }  
    }
    
    public void cargarArchivo(String path) {
        file = new File(path);
        Scanner sc = null;
        equipos = new ArrayList();
        if(file.exists()){
            try{
                sc = new Scanner(file);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    equipos.add(new Equipo(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));                    
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error, no se pudo leer el archivo!");
            }
            sc.close();
        }
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidoJugado() {
        return partidoJugado;
    }

    public void setPartidoJugado(int partidoJugado) {
        this.partidoJugado = partidoJugado;
    }

    public int getpGanados() {
        return pGanados;
    }

    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }

    public int getpEmpatados() {
        return pEmpatados;
    }

    public void setpEmpatados(int pEmpatados) {
        this.pEmpatados = pEmpatados;
    }

    public int getpPerdidos() {
        return pPerdidos;
    }

    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public static ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public static void setEquipos(ArrayList<Equipo> equipos) {
        Equipo.equipos = equipos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    

    @Override
    public String toString() {
        return  this.nombre+";"+this.partidoJugado+";"+this.pGanados+";"+this.pEmpatados+";"+this.pPerdidos+";"+this.golesFavor+";"+this.golesContra+";"+this.diferencia+";"+this.pts+";";
    }
}
