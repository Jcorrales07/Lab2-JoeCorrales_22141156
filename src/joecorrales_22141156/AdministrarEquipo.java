package joecorrales_22141156;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarEquipo {
    private ArrayList<Equipo> equipos;
    private File file = null;
    
    public AdministrarEquipo() {}
    
    public AdministrarEquipo(String path) {
        file = new File(path);
    }
    
    public void addEquipo(Equipo e) {
        this.equipos.add(e);
    }
    
    public void writeFile() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
            
            for(Equipo equipo : equipos) {
                bw.write(equipo.getNombre() + ";");
                bw.write(equipo.getPartidoJugado()+ ";");
                bw.write(equipo.getpGanados()+ ";");
                bw.write(equipo.getpEmpatados()+ ";");
                bw.write(equipo.getpPerdidos()+ ";");
                bw.write(equipo.getGolesFavor()+ ";");
                bw.write(equipo.getGolesContra()+ ";");
                bw.write(equipo.getDiferencia()+ ";");
                bw.write(equipo.getPts()+ ";");
            }
            bw.flush();
        } catch(IOException e) {
            
        }
        fw.close();
        bw.close();
    }
    
    
    public void uploadFile() {
        Scanner read = null;
        equipos = new ArrayList<>();
        
        if(file.exists()) {
            try {
                read = new Scanner(file);
                read.useDelimiter(";");
                while(read.hasNext()) {
                    equipos.add(new Equipo(read.next(), read.nextInt(), read.nextInt(),
                            read.nextInt(), read.nextInt(), read.nextInt(),
                            read.nextInt(), read.nextInt(), read.nextInt()));
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
