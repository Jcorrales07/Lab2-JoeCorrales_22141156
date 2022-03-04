package joecorrales_22141156;


public class Equipo {
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
}
